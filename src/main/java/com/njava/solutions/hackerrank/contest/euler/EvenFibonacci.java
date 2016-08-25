package com.njava.solutions.hackerrank.contest.euler;

import java.util.Scanner;

public class EvenFibonacci {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int T = in.nextInt();
		for(int i=0;i<T;i++) {
			long N = in.nextLong();
			long fibo1 = 0;
			long fibo2 = 1;
			long fibonacci = 0;
			long sum=0;
			for(;fibonacci < N;fibonacci = fibo1 + fibo2,fibo1=fibo2,fibo2=fibonacci){
				if((fibonacci & 1) == 0)
					sum = sum + fibonacci;
			}
			System.out.println(sum);
		}
		in.close();
	}
}
