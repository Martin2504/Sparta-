package com.sparta.j_BinaryTree;

public class Size {
    public static int findSize(Node passed) {
        if (passed == null) {
            return 0;
        }
        int cnt = 0;
        cnt ++;
        cnt += Size.findSize(passed.getLeftChild());
        cnt += Size.findSize(passed.getRightChild());
        return cnt;
    }

}
