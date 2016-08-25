package com.njava.solutions.hackerrank.algo.sorting;

import java.util.Scanner;

public class Intro {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int V = in.nextInt();
		final int N = in.nextInt();
		final int arr[] = new int[N];
		int pos = 0;
		for(int i=0;i<N;i++) {
			arr[i] = in.nextInt();
			if(V == arr[i]) {
				pos = i;
			}
		}
		System.out.println(pos);
		in.close();
	}
}
