package com.sparta.j_BinaryTree;

import static com.sparta.j_BinaryTree.BinaryTree.root;
import static com.sparta.j_BinaryTree.BinaryTree.tempNode;

public class Recursive {
    public static boolean recursiveCall(int value) {
        if (value < tempNode.getValue()) {
            if (tempNode.getLeftChild().getValue() == value) {
                return true;
            }
            tempNode = tempNode.getLeftChild();
            return recursiveCall(value);
        } else if (value > tempNode.getValue()) {
            if (tempNode.getRightChild().getValue() == value) {
                return true;
            }
            tempNode = tempNode.getRightChild();
            return recursiveCall(value);
        }
        return false;
    }
}
