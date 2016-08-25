package com.njava.solutions.hackerrank.algo.sorting;

import java.util.Scanner;

public class RunningTimeOfAlgorithms {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}
		insertionSort(ar);
		in.close();
	}

	private static void insertionSort(int[] ar) {
		int count = 0;
		for (int j = 1; j < ar.length; j++) {
			final int V = ar[j];
			int i = j;
			while (i > 0 && V < ar[i - 1]) {
				ar[i] = ar[i - 1];
				count++;
				i--;
			}
			ar[i] = V;
		}
		System.out.println(count);
	}
}
