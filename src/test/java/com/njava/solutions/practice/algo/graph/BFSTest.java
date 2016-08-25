package com.njava.solutions.practice.algo.graph;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BFSTest {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

	@Before
	public void setUpStreams() {
		System.setOut(new PrintStream(outContent));
	}

	@Test
	public void test() {
		final BFS bfs = new BFS(7);
		bfs.addEdge(0, 3);
		bfs.addEdge(0, 1);
		bfs.addEdge(0, 2);
		bfs.addEdge(3, 4);
		bfs.addEdge(1, 2);
		bfs.addEdge(1, 5);
		bfs.addEdge(1, 4);
		bfs.addEdge(2, 5);
		bfs.addEdge(4, 6);
		bfs.addEdge(5, 6);
		bfs.printBFS(0);
		System.err.println(outContent.toString());
		Assert.assertEquals("0 3 1 2 4 5 6 ", outContent.toString());
	}

	@After
	public void cleanUpStreams() {
		System.setOut(null);
	}
}
