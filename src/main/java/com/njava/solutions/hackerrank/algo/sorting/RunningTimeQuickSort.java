package com.njava.solutions.hackerrank.algo.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class RunningTimeQuickSort {
	private static int quicksortSwap = 0;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] ar = new int[N];
		for (int i = 0; i < N; i++) {
			ar[i] = in.nextInt();
		}
		int ar2[] = Arrays.copyOf(ar, ar.length);
		int insertionShift = insertionSort(ar);
		quickSort(ar2,0,ar.length -1);
		System.out.println(insertionShift-quicksortSwap);
		in.close();
	}
	
	private static int insertionSort(int[] ar) {
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
		return count;
	}
	
	private static void quickSort(int[] ar, int low, int high) {
		if(low < high) {
			int p = partition(ar,low,high);
			quickSort(ar, low, p-1);
			quickSort(ar, p+1, high);
		}
	}
	
	private static int partition(int[] ar, int low, int high) {
		int pivot = ar[high];
	    int highIndex = low - 1;
	    
	    for (int j = low; j <= high- 1; j++)
	    {
	        if (ar[j] <= pivot)
	        {
	        	highIndex++;
	        	swap(ar,j,highIndex);
	        	quicksortSwap++;
	        }
	    }
	    swap (ar,highIndex + 1, high);
	    quicksortSwap++;
	    return (highIndex + 1);
	}
	
	private static void swap(int[] ar, int i, int j) {
		int temp = ar[i];
		ar[i] = ar[j];
		ar[j] = temp;
		
	}
}
