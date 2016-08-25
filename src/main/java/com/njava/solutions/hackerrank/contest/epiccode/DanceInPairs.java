package com.njava.solutions.hackerrank.contest.epiccode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class DanceInPairs {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		final String firstLine[] = br.readLine().split(" ");
		final int N = Integer.parseInt(firstLine[0]);
		final int K = Integer.parseInt(firstLine[1]);
		int count = 0;
		final String secondLine[] = br.readLine().split(" ");
		final String thirdLine[] = br.readLine().split(" ");
		Arrays.sort(secondLine,new Comparator<String>() {
	        public int compare(String o1, String o2) {
	            return Integer.valueOf(o1).compareTo(Integer.valueOf(o2));
	        }
	    });
		Arrays.sort(thirdLine,new Comparator<String>() {
	        public int compare(String o1, String o2) {
	            return Integer.valueOf(o1).compareTo(Integer.valueOf(o2));
	        }
	    });
		int oldBackCount = N -1;
		int backCount = N - 1;
		boolean runWhile = true;
		for (int i = 0; (i < N && (backCount > -1)); i++) {
			runWhile = true;
			while (runWhile) {
				int B = Integer.parseInt(secondLine[N - 1 - i]);
				int G = Integer.parseInt(thirdLine[backCount]);
				//System.out.println("Evaluating : (" + B + "," + G + ")");
				if (Math.abs((B - G)) <= K) {
					//System.out.println("Pair : " + B + ", " + G);
					count++;
					backCount--;
					oldBackCount = backCount;
					runWhile = false;
				} else {
					backCount--;
					if (backCount < 0) {
						backCount = oldBackCount;
						runWhile = false;
					}
				}
			}

		}
		System.out.println(count);
	}
	
	/*public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int K = sc.nextInt();
		int count = 0;
		int boys[] = new int[N];
		for (int i = 0; i < N; i++) {
			boys[i] = sc.nextInt();
		}
		int girls[] = new int[N];
		for (int i = 0; i < N; i++) {
			girls[i] = sc.nextInt();
		}
		Arrays.sort(boys);
		Arrays.sort(girls);
		int oldBackCount = N - 1;
		int backCount = N - 1;
		boolean runWhile = true;
		for (int i = 0; (i < N && (backCount > -1)); i++) {
			runWhile = true;
			while (runWhile) {
				int B = boys[N - 1 - i];
				int G = girls[backCount];
				System.out.println("Evaluating : (" + B + "," + G + ")");
				if (Math.abs((B - G)) <= K) {
					System.out.println("Pair : " + B + ", " + G);
					count++;
					backCount--;
					oldBackCount = backCount;
					runWhile = false;
				} else {
					backCount--;
					if (backCount < 0) {
						backCount = oldBackCount;
						runWhile = false;
					}
				}
			}

		}
		sc.close();
		System.out.println(count);
	}*/
}
