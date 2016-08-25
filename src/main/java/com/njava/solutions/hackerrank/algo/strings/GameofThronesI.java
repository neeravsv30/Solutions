package com.njava.solutions.hackerrank.algo.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class GameofThronesI {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		final String line = br.readLine().toLowerCase();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>(
				Math.min(line.length(), 26));

		for (int i = 0; i < line.length(); ++i) {
			char charAt = line.charAt(i);
			if (!charMap.containsKey(charAt)) {
				charMap.put(charAt, 1);
			} else {
				charMap.put(charAt, charMap.get(charAt) + 1);
			}
		}
		int oddCount = 0;
		for(Integer count: charMap.values()) {
			if((count % 2) != 0)
				oddCount++;
		}
		if(oddCount > 1)
			System.out.println("NO");
		else
			System.out.println("YES");
	}
}

/**
 * aaabbbb
 */
