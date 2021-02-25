package com.github.lucaseo90;

public class TreeNode {
    public int value;
    public TreeNode left;
    public TreeNode right;

    TreeNode(int x) {
        value = x;
    }

    public TreeNode(int value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return value + " " + left + " " + right;
    }
}
