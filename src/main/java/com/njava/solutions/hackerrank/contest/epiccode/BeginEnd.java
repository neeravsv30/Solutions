package com.njava.solutions.hackerrank.contest.epiccode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BeginEnd {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		final int N = Integer.parseInt(br.readLine());
		final String s = br.readLine();
		int count = 0;
		for (int c = 0; c < N; c++) {
			for (int i = 1; i <= N - c; i++) {
				String sub = s.substring(c, c + i);
				System.out.println(sub);
				if (sub.length() == 1)
					count++;
				else if (sub.charAt(0) == sub.charAt(sub.length() - 1))
					count++;
			}
		}
		System.out.println(count);
	}
}
