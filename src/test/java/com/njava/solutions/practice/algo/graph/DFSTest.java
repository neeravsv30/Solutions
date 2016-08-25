package com.njava.solutions.practice.algo.graph;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DFSTest {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

	@Before
	public void setUpStreams() {
		System.setOut(new PrintStream(outContent));
	}

	@Test
	public void test() {
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

		Assert.assertEquals("3 0 1 2 5 6 4 ", outContent.toString());
	}

	@After
	public void cleanUpStreams() {
		System.setOut(null);
	}
}
