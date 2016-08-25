package com.njava.solutions.practice.algo.graph;

import java.util.Iterator;
import java.util.LinkedList;

public class DFS {
	final private LinkedList<Integer>[] adjList;
	final private boolean[] visited;

	@SuppressWarnings("unchecked")
	DFS(final int count) {
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

	public void printDFS(final int startNode) {
		visited[startNode] = true;
		System.out.println(startNode);
		final Iterator<Integer> adj = adjList[startNode].listIterator();
		while (adj.hasNext()) {
			final int n = adj.next();
			if (!visited[n]) {
				printDFS(n);
			}
		}

	}

	public static void main(final String[] args) {
		final DFS dfs = new DFS(7);
		dfs.addEdge(0, 3);
		dfs.addEdge(0, 1);
		dfs.addEdge(0, 2);
		dfs.addEdge(3, 1);
		dfs.addEdge(1, 2);
		dfs.addEdge(1, 5);
		dfs.addEdge(1, 4);
		dfs.addEdge(2, 5);
		dfs.addEdge(4, 6);
		dfs.addEdge(5, 6);

		dfs.printDFS(3);
	}
}
