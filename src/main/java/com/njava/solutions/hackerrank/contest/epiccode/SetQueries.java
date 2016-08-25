package com.njava.solutions.hackerrank.contest.epiccode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class SetQueries {
	final static long MOD = (long) (Math.pow(10, 9) + 9);
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		final String firstLine[] = br.readLine().split(" ");
		final int N = Integer.parseInt(firstLine[0]);
		final int S = Integer.parseInt(firstLine[1]);
		final int M = Integer.parseInt(firstLine[2]);
		long arr[] = new long[N+1];
		
		HashMap<Integer, ArrayList<Integer>> sets = new HashMap<Integer, ArrayList<Integer>>();
		String[][] opArr = new String[M][4];
		for(int i=1;i<=S;i++) {
			String line[] = br.readLine().split(" ");
			int size = Integer.parseInt(line[0]);
			ArrayList<Integer> arrList = new ArrayList<Integer>(size);
			for(int j=0;j<size;j++) {
				arrList.add(Integer.parseInt(line[j+1]));
			}
			sets.put(i, arrList);
		}
		int operation = 0;
		for(int j=0;j<M;j++) {
			opArr[j] = br.readLine().split(" ");
		}
		
		for(int j=0;j<M;j++) {
			operation = Integer.parseInt(opArr[j][0]);
			switch(operation) {
				case 1: {
					operation1(arr, sets.get(Integer.parseInt(opArr[j][1])), Integer.parseInt(opArr[j][2]));
					break;
				}
				case 2: {
					operation2(arr, sets.get(Integer.parseInt(opArr[j][1])));
					break;
				}
				case 3: {
					operation3(arr, Integer.parseInt(opArr[j][1]), Integer.parseInt(opArr[j][2]), Integer.parseInt(opArr[j][3]));
					break;
				}
				case 4: {
					operation4(arr, Integer.parseInt(opArr[j][1]), Integer.parseInt(opArr[j][2]));
					break;
				}
			}
		}
	}

	public static void operation1(long[] arr, ArrayList<Integer> set, int t) {
		for(int index: set) {
			arr[index] = arr[index] + t;
		}
	}

	public static void operation2(long[] arr, ArrayList<Integer> set) {
		long sum=0;
		for(int index: set) {
			sum = sum + arr[index];
		}
		System.out.println(sum%MOD);
	}

	public static void operation3(long[] arr, int l, int r, int t) {
		for(int index=l;index<=r;index++) {
			arr[index] = arr[index] + t;
		}
	}
	
	public static void operation4(long[] arr, int l, int r) {
		long sum=0;
		for(int index=l;index<=r;index++) {
			sum = sum + arr[index];
		}
		System.out.println(sum%MOD);
	}
}
	