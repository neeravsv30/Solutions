package com.njava.solutions.hackerrank.algo.sorting;

import java.util.Scanner;

public class CountingSort2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] ar = new int[N];
		int countArr[] = new int[100];
		for (int i = 0; i < N; i++) {
			ar[i] = in.nextInt();
			countArr[ar[i]]++;
		}
		printArray(countArr);
		in.close();
	}
	
	private static void printArray(int[] ar) {
		for (int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i];j++)
				System.out.print(i + " ");
		}
		System.out.println("");
	}
}
