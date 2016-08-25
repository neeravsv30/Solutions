package com.njava.solutions.practice.algo.graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
	final private LinkedList<Integer>[] adjList;
	final private boolean[] visited;

	@SuppressWarnings("unchecked")
	BFS(final int count) {
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

	public void printBFS(final int startNode) {
		final Queue<Integer> queue = new LinkedList<Integer>();
		visited[startNode] = true;
		queue.add(startNode);
		while(queue.size() != 0) {
			final int s = queue.poll();
			System.out.print(s + " ");
			final Iterator<Integer> adj = adjList[s].listIterator();
			while (adj.hasNext()) {
				final int n = adj.next();
				if (!visited[n]) {
					visited[n] = true;
					queue.add(n);
				}
			}
		}
	}
}
