package com.njava.solutions.practice.algo.tree;

public class BinaryTreeTraversal {

	public void printPreOrder(final BinaryNode startNode) {
		if (startNode == null) {
			return;
		}
		System.out.print(startNode.data + " ");
		printPreOrder(startNode.left);
		printPreOrder(startNode.right);
	}

	public void printPostOrder(final BinaryNode startNode) {
		if (startNode == null) {
			return;
		}
		printPostOrder(startNode.left);
		printPostOrder(startNode.right);
		System.out.print(startNode.data + " ");
	}

	public void printInOrder(final BinaryNode startNode) {
		if (startNode == null) {
			return;
		}
		printInOrder(startNode.left);
		System.out.print(startNode.data + " ");
		printInOrder(startNode.right);
	}

	public static void main(final String[] args) {

		final BinaryNode node3 = new BinaryNode(3);
		final BinaryNode node4 = new BinaryNode(4);
		final BinaryNode node5 = new BinaryNode(5);
		final BinaryNode node2 = new BinaryNode(2, node4, node5);
		final BinaryNode root = new BinaryNode(1, node2, node3);

		final BinaryTreeTraversal btt = new BinaryTreeTraversal();
		System.out.print("InOrder Traversal : ");
		btt.printInOrder(root);
		System.out.print("\nPreOrder Traversal : ");
		btt.printPreOrder(root);
		System.out.print("\nPostOrder Traversal : ");
		btt.printPostOrder(root);
	}
}
