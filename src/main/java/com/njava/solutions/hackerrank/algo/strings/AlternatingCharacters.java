package com.njava.solutions.hackerrank.algo.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlternatingCharacters {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine());
        final char words[][] = new char[N][];
        for(int i = 0; i < N; ++i){
        	words[i] = br.readLine().toCharArray();
        }
        
        for(char word[] : words) {
        	int deletion = 0;
        	char prevChar = word[0];
        	for(int i=1; i< word.length; i++) {
        		if(prevChar == 'A')
        			if(word[i] != 'B')
        				deletion++;
        			else
        				prevChar = 'B';
        		else if(prevChar == 'B')
        			if(word[i] != 'A')
        				deletion++;
        			else
        				prevChar = 'A';
        	}
        	System.out.println(deletion);
        }
	}
}

/**
 * 5
AAAA
BBBBB
ABABABAB
BABABA
AAABBB
 */