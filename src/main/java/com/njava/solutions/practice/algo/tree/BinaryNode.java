package com.njava.solutions.practice.algo.tree;

public class BinaryNode {
	int data;
	BinaryNode left;
	BinaryNode right;

	BinaryNode(final int data) {
		this(data, null, null);
	}

	BinaryNode(final int data, final BinaryNode left, final BinaryNode right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}

	public int getData() {
		return data;
	}

	public void setData(final int data) {
		this.data = data;
	}

	public BinaryNode getLeft() {
		return left;
	}

	public void setLeft(final BinaryNode left) {
		this.left = left;
	}

	public BinaryNode getRight() {
		return right;
	}

	public void setRight(final BinaryNode right) {
		this.right = right;
	}

}
