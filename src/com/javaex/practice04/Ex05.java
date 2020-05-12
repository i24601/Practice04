package com.javaex.practice04;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] score = new int[5];
		int i = 0, sum = 0;
		for (i = 0; i < score.length; i++) {
			System.out.print(i + 1 + "번 점수: ");
			score[i] = sc.nextInt();
			sum = sum + score[i];
		}
		sc.close();
		System.out.println(((float) sum / score.length));

	}

}
