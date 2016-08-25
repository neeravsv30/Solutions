package com.njava.solutions.hackerrank.contest.euler;

import java.util.Scanner;

public class MultipleOf3And5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int T = in.nextInt();
		for(int i=0;i<T;i++) {
			int N = in.nextInt();
			long sum = 0;
			int incr3 = 0;
			int incr5 = 0;
			for(int j=1;j<N;j++) {
				int add = 0;
				if(++incr3 == 3){
					incr3 = 0;
					add = j;
				}
				if(++incr5 == 5){
					incr5 = 0;
					add = j;
				}
				sum = sum + add;
			}
			System.out.println(sum);
		}
		in.close();
	}
}
