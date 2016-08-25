package com.njava.solutions.practice.algo.graph;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AllPathsTest {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

	@Before
	public void setUpStreams() {
		System.setOut(new PrintStream(outContent));
	}

	@Test
	public void test() {
		final AllPaths allPath = new AllPaths(7);
		allPath.addEdge(0, 1);
		allPath.addEdge(0, 2);
		allPath.addEdge(0, 3);
		allPath.addEdge(1, 5);
		allPath.addEdge(2, 3);
		allPath.addEdge(2, 4);
		allPath.addEdge(2, 5);
		allPath.addEdge(3, 4);
		allPath.addEdge(3, 6);
		allPath.addEdge(4, 6);
		allPath.addEdge(5, 4);
		allPath.addEdge(5, 6);

		allPath.printAllPaths(0, 6);
		Assert.assertEquals("[0, 1, 5, 4, 6] - [0, 1, 5, 6] - [0, 2, 3, 4, 6] - "
				+ "[0, 2, 3, 6] - [0, 2, 4, 6] - [0, 2, 5, 4, 6] - "
				+ "[0, 2, 5, 6] - [0, 3, 4, 6] - [0, 3, 6] - ",
				outContent.toString());
	}

	@After
	public void cleanUpStreams() {
		System.setOut(null);
	}
}
