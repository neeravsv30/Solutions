package com.njava.solutions.hackerrank.algo.sorting;

import java.util.Scanner;

public class CountingSort3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] ar = new int[N];
		int countArr[] = new int[100];
		for (int i = 0; i < N; i++) {
			ar[i] = in.nextInt();
			in.next();
			countArr[ar[i]]++;
		}
		
		for(int i=0;i<=99;i++) {
			if(i==0)
				System.out.print(countArr[i] + " ");
			else {
				countArr[i] = countArr[i] + countArr[i-1];
				System.out.print(countArr[i] + " ");
			}
		}
		in.close();
	}
}
