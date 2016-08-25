package com.njava.solutions.hackerrank.algo.sorting;

import java.util.Scanner;

public class InsertionSort1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}
		insertIntoSorted(ar);
		in.close();
	}

	private static void insertIntoSorted(int[] ar) {
		final int V = ar[ar.length - 1];
		int i = ar.length - 1;
		while (i > 0 && V < ar[i - 1]) {
			ar[i] = ar[i - 1];
			printArray(ar);
			i--;
		}
		ar[i] = V;
		printArray(ar);
	}

	private static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}
}
