package com.sparta.j_BinaryTree.Exceptions;

public class ChildNotFoundException extends Exception {
    @Override
    public String getMessage() {
        return "Child not found";
    }
}
