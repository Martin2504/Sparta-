package com.sparta.j_BinaryTree;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Creating Tree
        BinaryTree tree = new BinaryTree();

        // Populating the array for the tree elements in no particular order
        BinaryTree.treeArray = new int[]{8, 3, 10, 1, 6, 4, 7, 14, 13};

        // Adding Elements to the tree
        tree.addElements(BinaryTree.treeArray);

        // Printing number of elements
        System.out.println(tree.getNumberOfElements());

        tree = new BinaryTree();
        System.out.println(tree.getNumberOfElements());


        // Printing boolean for whether number exists
        System.out.println(tree.findElement(13));

        // Returning the value of the left child of the node containing the passed int
        BinaryTree.tempNode = BinaryTree.root;
        try {
            System.out.println(tree.getLeftChild(14));
        } catch (Exception e) {
            System.out.println("Value entered has no left child");
        }

        // Returning the value of the right child of the node containing the passed int
        BinaryTree.tempNode = BinaryTree.root;
        try {
            System.out.println(tree.getRightChild(3));
        } catch (Exception e) {
            System.out.println("Value entered has no right child");
        }

        // Printing the elements of the tree in ascending order
        System.out.println(Arrays.toString(tree.getSortedTreeAsc()));

        // Printing the elements of the tree in Descending order
        System.out.println(Arrays.toString(tree.getSortedTreeDesc()));

    }
}
