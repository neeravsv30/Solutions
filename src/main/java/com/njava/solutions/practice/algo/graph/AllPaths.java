package com.njava.solutions.practice.algo.graph;

import java.util.Iterator;
import java.util.LinkedList;

public class AllPaths {
	final private LinkedList<Integer>[] adjList;
	final private boolean[] visited;

	@SuppressWarnings("unchecked")
	AllPaths(final int count) {
		adjList = new LinkedList[count];
		visited = new boolean[count];
		for (int i = 0; i < count; i++) {
			adjList[i] = new LinkedList<Integer>();
		}
	}

	public void addEdge(final int v, final int w) {
		adjList[v].add(w);
		adjList[w].add(v);
	}

	public void printAllPaths(final int startNode) {
		visited[startNode] = true;
		System.out.println(startNode);
		final Iterator<Integer> adj = adjList[startNode].listIterator();
		while (adj.hasNext()) {
			final int n = adj.next();
			if (!visited[n]) {
				printAllPaths(n);
			}
		}

	}

	public static void main(final String[] args) {
		final AllPaths allPath = new AllPaths(7);
		allPath.addEdge(0, 3);
		allPath.addEdge(0, 1);
		allPath.addEdge(0, 2);
		allPath.addEdge(3, 1);
		allPath.addEdge(1, 2);
		allPath.addEdge(1, 5);
		allPath.addEdge(1, 4);
		allPath.addEdge(2, 5);
		allPath.addEdge(4, 6);
		allPath.addEdge(5, 6);

		allPath.printAllPaths(3);
	}
}
