package com.njava.solutions.hackerrank.contest.epiccode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PerfectHiring {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		final String npx[] = br.readLine().split(" ");
		final int N = Integer.parseInt(npx[0]);
		int P = Integer.parseInt(npx[1]);
		final int X = Integer.parseInt(npx[2]);
		double max = 0;
		int id = 0;
		double score;
		//int maxScore = 0;
		final String strScores[] = br.readLine().split(" ");
		for(int i=0;i<N;i++) {
			float s = Float.parseFloat(strScores[i]);
			score = s * P;
			//System.out.println("Score = " + score + "s = " + s + ", max = " + max + ", id = " + id);
			if(score > max) {
				max = score;
				id = i;
				//maxScore = s;
			}
			P = P - X;
			//if(P<1) P =1;
		}
		
		System.out.println((id + 1));
	}
}
