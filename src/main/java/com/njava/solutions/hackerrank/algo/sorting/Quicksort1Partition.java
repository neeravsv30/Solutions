package com.njava.solutions.hackerrank.algo.sorting;

import java.util.Scanner;

public class Quicksort1Partition {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] ar = new int[N];
		for (int i = 0; i < N; i++) {
			ar[i] = in.nextInt();
		}
		quickSort(ar);
		in.close();
	}
	
	private static void quickSort(int[] ar) {
		partition(ar,0,ar.length-1);
		
	}
	
	private static void partition(int[] ar, int low, int high) {
		if(ar.length <= 1)
			return;
		int smallArr[] = new int[high+1];
		int largeArr[] = new int[high+1];
		int smallIndex = -1;
		int largeIndex = -1;
		
		final int pivot = ar[0];
		for (int j = 1; j <= high; j++) {	
			if(pivot > ar[j]) {
				smallArr[++smallIndex] = ar[j];
			} else {
				largeArr[++largeIndex] = ar[j];
			}
		}
		if(smallIndex > 0)
			partition(smallArr,0,smallIndex);
		if(largeIndex > 0)
			partition(largeArr,0,largeIndex);
		System.arraycopy(smallArr, 0, ar, 0, smallIndex + 1);
		ar[++smallIndex] = pivot;
		System.arraycopy(largeArr, 0, ar, smallIndex + 1, largeIndex + 1);
		printArray(ar,0,smallIndex + largeIndex + 2);
	}

	private static void printArray(int[] ar,int start, int end) {
		for (int i=start; i< end; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println("");
	}
}

/**
 * for (int j = low + 1; j <= high; j++) {
		  int current = ar[j];
		  if (current < pivot) {
			  int temp = ar[low+1];
			  ar[low+1] = ar[j];
			  ar[j] = temp;
			  low++;
		  }
		}
		swap(ar,0,low);
		printArray(ar);
 */

