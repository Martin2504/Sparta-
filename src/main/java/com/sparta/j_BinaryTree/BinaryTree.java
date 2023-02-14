package com.sparta.j_BinaryTree;

import com.sparta.j_BinaryTree.Exceptions.ChildNotFoundException;

import java.util.Arrays;

public class BinaryTree implements IBinaryTree {

    static Node root;
    static Node tempNode = root;        // Basically serves as a pointer
    static int[] treeArray;

    @Override
    public int getRootElement() {
        return root.getValue();
    }

    @Override
    public int getNumberOfElements() {
        return Size.findSize(root);
    }

    @Override
    public void addElements(int[] elements) {
        for (int e : elements) {
            addElement(e);
        }
    }

    @Override
    public void addElement(int element) {
        if (root == null) {
            root = new Node(element);
            tempNode = root;
        }
        if (element < tempNode.getValue()) {
            if (tempNode.isLeftChildEmpty()) {
                tempNode.setLeftChild(new Node(element));
            } else {
                tempNode = tempNode.getLeftChild();
                addElement(element);
            }
        } else if (element > tempNode.getValue()) {
            if (tempNode.isRightChildEmpty()) {
                tempNode.setRightChild(new Node(element));
            } else {
                tempNode = tempNode.getRightChild();
                addElement(element);
            }
        }
        tempNode = root;
    }

    @Override
    public boolean findElement(int value) {
        if (root == null ) {
            return false;
        } else if (root.getValue() == value) {
            return true;
        }
        boolean answer = Recursive.recursiveCall(value);
        tempNode = root;
        return answer;

    }


    // (1) Find node in which element is located
    // (2) Return value of the left child of that node
    @Override
    public int getLeftChild(int element) {
        try {
            if (element < tempNode.getValue()) {
                if (tempNode.getLeftChild().getValue() == element) {
                    tempNode = tempNode.getLeftChild();
                    if (!tempNode.isLeftChildEmpty()) {
                        return tempNode.getLeftChild().getValue();
                    } else {
                        throw new ChildNotFoundException();
                    }
                }
                tempNode = tempNode.getLeftChild();
                return getLeftChild(element);
            } else if (element > tempNode.getValue()) {
                if (tempNode.getRightChild().getValue() == element) {
                    tempNode = tempNode.getRightChild();
                    if (!tempNode.isLeftChildEmpty()) {
                        return tempNode.getLeftChild().getValue();
                    } else {
                        throw new ChildNotFoundException();
                    }
                }
                tempNode = tempNode.getRightChild();
                return getLeftChild(element);
            }
        } catch (ChildNotFoundException e) {
            System.out.println(e.getMessage());
        }
        tempNode = root;
        return 0;
    }

    @Override
    public int getRightChild(int element) throws ChildNotFoundException {
        try {
            if (element < tempNode.getValue()) {
                if (tempNode.getLeftChild().getValue() == element) {
                    tempNode = tempNode.getLeftChild();
                    if (!tempNode.isRightChildEmpty()){
                        return tempNode.getRightChild().getValue();
                    } else {
                        throw new ChildNotFoundException();
                    }
                }
                tempNode = tempNode.getLeftChild();
                return getRightChild(element);
            } else if (element > tempNode.getValue()) {
                if (tempNode.getRightChild().getValue() == element) {
                    tempNode = tempNode.getRightChild();
                    if (!tempNode.isRightChildEmpty()){
                        return tempNode.getRightChild().getValue();
                    } else {
                        throw new ChildNotFoundException();
                    }
                }
                tempNode = tempNode.getRightChild();
                return getRightChild(element);
            }
        } catch (ChildNotFoundException e) {
            System.out.println(e.getMessage());
        }
        tempNode = root;
        return 0;
    }


    @Override
    public int[] getSortedTreeAsc() {
        int[] sortedTreeAsc = new int[treeArray.length];
        for (int i = 0; i < sortedTreeAsc.length; i++) {
            sortedTreeAsc[i] = treeArray[i];
        }
        Arrays.sort(sortedTreeAsc);
        return sortedTreeAsc;
    }

    @Override
    public int[] getSortedTreeDesc() {
        int[] newSortedTreeAsc = this.getSortedTreeAsc();
        int[] sortedTreeDesc = new int[treeArray.length];
        int m = 0;
        for (int i = sortedTreeDesc.length - 1; i >= 0; i--) {
            sortedTreeDesc[i] = newSortedTreeAsc[m];
            m++;
        }
        return sortedTreeDesc;
    }
}
