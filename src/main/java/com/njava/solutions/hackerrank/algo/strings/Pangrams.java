package com.njava.solutions.hackerrank.algo.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pangrams {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final String line = br.readLine().toLowerCase();
        
        if (line.length() < 26) {
        	System.out.println("not pangram");
            return;
        }
        for (char c = 'a'; c <= 'z'; c++) {
            if (line.indexOf(c) == -1) {
            	System.out.println("not pangram");
                return;
            }
        }
        System.out.println("pangram");
	}
}

/**
* We promptly judged antique ivory buckles for the next prize  - Panagram
*
*/
