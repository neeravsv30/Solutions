package com.njava.solutions.hackerrank.algo.sorting;

import java.util.Scanner;

public class QuickSortInPlace {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] ar = new int[N];
		for (int i = 0; i < N; i++) {
			ar[i] = in.nextInt();
		}
		quickSort(ar,0,ar.length -1);
		in.close();
	}
	
	private static void quickSort(int[] ar, int low, int high) {
		if(low < high) {
			int p = partition(ar,0,high);
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
	        }
	    }
	    swap (ar,highIndex + 1, high);
	    printArray(ar);
	    return (highIndex + 1);
	}
	
	private static void swap(int[] ar, int i, int j) {
		int temp = ar[i];
		ar[i] = ar[j];
		ar[j] = temp;
		
	}

	private static void printArray(int[] ar) {
		for (int n: ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}
}

/**
 * int i = low;
		int j = high-1;
		final int pivot = ar[high];
		while(i <= j) {
			while(i <= high && ar[i] < pivot) {
				i++;
			}
			while(j >= low && ar[j] > pivot) {
				j--;
			}
			if(i<=j){
				swap(ar,i,j);
				i++;
				j--;
			}
		}
		swap(ar,i,high);
		printArray(ar);
		return i;	
 */