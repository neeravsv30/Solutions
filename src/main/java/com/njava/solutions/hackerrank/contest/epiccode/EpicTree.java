package com.njava.solutions.hackerrank.contest.epiccode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EpicTree {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int N = in.nextInt();
		Node[] nodeArray = new Node[N+1];
		for(int i=1;i<=N;i++) {
			nodeArray[i] = new Node(i);
		}
		for(int i=0;i<N;i++) {
			int from = in.nextInt();
			int to = in.nextInt();
			nodeArray[from].addChild(nodeArray[to]);
		}
		int operation=0;
		final int M = in.nextInt();
		for(int i=0;i<M;i++) {
			operation = in.nextInt();
			switch(operation) {
				case 1: {
					operation1(in.nextInt(),in.nextInt(),in.nextInt());
					break;
				}
				case 2: {
					operation2(in.nextInt());
					break;
				}
			}
		}
		in.close();
	}
	
	public static void findPath(int a, int b, Node[] nodeArray, boolean visitParent, boolean visitChild) {
		Node startNode = nodeArray[a];
		Node endNode = nodeArray[b];
		if(visitChild) {
			if(startNode.getChildren().size() != 0) {
				for(Node node: startNode.getChildren()) {
					
				}
			}
		}
		if(visitParent) {
			if(startNode.getParent() != null) {
				
			}
		}
	}
	
	public static void operation1(int a, int b, int t) {
		
	}
	public static void operation2(int a) {
		
	}
}

class Node {
	private List<Node> children = new ArrayList<Node>();
	private Node parent = null;
	private int number;
	private long data = 0;

	public Node(int number) {
		this.number = number;
	}
	
	public Node(Node parent) {
		this.parent = parent;
	}

	public List<Node> getChildren() {
		return children;
	}

	public void setParent(Node parent) {
		parent.addChild(this);
		this.parent = parent;
	}
	public Node getParent() {
		return this.parent;
	}
	
	public void addChild(Node child) {
		child.setParent(this);
		this.children.add(child);
	}

	public int getNumber() {
		return this.number;
	}
	
	public long getData() {
		return this.data;
	}

	public void setData(long data) {
		this.data = data;
	}

	public boolean isRoot() {
		return (this.parent == null);
	}

	public boolean isLeaf() {
		if (this.children.size() == 0)
			return true;
		else
			return false;
	}

	public void removeParent() {
		this.parent = null;
	}
	
	@Override
	public String toString() {
		return "Nmmber : " + number + ", Child: " +  children.toString();
	}
}