package com.njava.solutions.hackerrank.contest.epiccode;

import java.util.Scanner;

public class SquareArray {
	final static long MOD = (long) (Math.pow(10, 9) + 7);
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int N = in.nextInt();
		final int Q = in.nextInt();
		long arr[] = new long[N+1];
		int operation = 0;
		for(int j=0;j<Q;j++) {
			operation = in.nextInt();
			switch(operation) {
				case 1: {
					//operation1(arr, in.nextInt(),in.nextInt());
					long operand1 = 0;
					long operand2 = 0;
					int x = in.nextInt();
					int y = in.nextInt();
					for(int i=x;i<=y;i++) {
						operand1 = operand1+2;
						operand2 = operand2 + operand1;
						arr[i] = operand2 + arr[i];
					}
					break;
				}
				case 2: {
					//operation2(arr, in.nextInt(),in.nextInt());
					int x = in.nextInt();
					int y = in.nextInt();
					long sum = 0;
					for(int i=x;i<=y;i++) {
						sum = sum + arr[i];
					}
					System.out.println(sum%MOD);
					break;
				}
			}
		}
		in.close();
	}
	
	public static void operation1(long arr[],int x, int y) {
		long operand1 = 0;
		long operand2 = 0;
		for(int i=x;i<=y;i++) {
			operand1 = operand1+2;
			operand2 = operand2 + operand1;
			arr[i] = operand2 + arr[i];
		}
	}
	public static void operation2(long arr[],int x, int y) {
		long sum = 0;
		for(int i=x;i<=y;i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum%MOD);
	}
	
	/*public static long multiply(long x, long y)
    {
        int size1 = getSize(x);
        int size2 = getSize(y);
        *//** Maximum of lengths of number **//*
        int N = Math.max(size1, size2);
        *//** for small values directly multiply **//*        
        if (N < 10)
            return x * y;
        *//** max length divided, rounded up **//*    
        N = (N / 2) + (N % 2);    
        *//** multiplier **//*
        long m = (long)Math.pow(10, N);
 
        *//** compute sub expressions **//*        
        long b = x / m;
        long a = x - (b * m);
        long d = y / m;
        long c = y - (d * N);
        *//** compute sub expressions **//*
        long z0 = multiply(a, c);
        long z1 = multiply(a + b, c + d);
        long z2 = multiply(b, d);          
 
        return z0 + ((z1 - z0 - z2) * m) + (z2 * (long)(Math.pow(10, 2 * N)));        
    }
    *//** Function to calculate length or number of digits in a number **//*
    public static int getSize(long num)
    {
        int ctr = 0;
        while (num != 0)
        {
            ctr++;
            num /= 10;
        }
        return ctr;
    }*/
}
