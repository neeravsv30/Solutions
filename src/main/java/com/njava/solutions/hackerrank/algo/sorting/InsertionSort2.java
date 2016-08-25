package com.njava.solutions.hackerrank.algo.sorting;

import java.util.Scanner;

public class InsertionSort2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}
		insertionSortPart2(ar);
		in.close();
	}

	private static void insertionSortPart2(int[] ar) {
		for (int j = 1; j < ar.length; j++) {
			final int V = ar[j];
			int i = j;
			while (i > 0 && V < ar[i - 1]) {
				ar[i] = ar[i - 1];
				i--;
			}
			ar[i] = V;
			printArray(ar);
		}
	}

	private static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}
}
