package com.njava.solutions.hackerrank.algo.sorting;

import java.util.Scanner;

public class CountingSort4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] ar = new int[N];
		String[] strAr = new String[N];
		int[] newAr = new int[N];
		String[] newStrAr = new String[N];
		int countArr[] = new int[100];
		int M = N/2;
		for (int i = 0; i < N; i++) {
			ar[i] = in.nextInt();
			String str = in.next();
			countArr[ar[i]]++;
			if(i>=M)
				strAr[i] = str;
			else
				strAr[i] = "-";
			newAr[i] = -1;
				
		}
		
		for(int i=0;i<=99;i++) {
			if(i>0) {
				countArr[i] = countArr[i] + countArr[i-1];
			}
		}
		for(int i=N-1;i>=0;i--) {
			int index = --countArr[ar[i]];
			newAr[index] = ar[i];
			newStrAr[index] = strAr[i];
		}
		printArray(newStrAr);
		in.close();
	}
	
	private static void printArray(String[] ar) {
		for (int i=0;i<ar.length;i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println("");
	}
}
