package com.njava.solutions.hackerrank.algo.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FunnyString {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine());
        final char words[][] = new char[N][];
        for(int i = 0; i < N; ++i){
        	words[i] = br.readLine().toCharArray();
        }
        
        for(char word[] : words) {
        	int length = word.length;
        	boolean success = true;
        	for(int i=1; success && (i< word.length); i++) {
        		if(Math.abs((word[i]-word[i-1])) != Math.abs((word[length - i]-word[length - i-1]))) {
        			success = false;
        		}
        	}
        	if(success)
        		System.out.println("Funny");
        	else
        		System.out.println("Not Funny");
        }
	}
}

/**
 * Sample Input
 * 	2
	acxz
	bcxz
 */