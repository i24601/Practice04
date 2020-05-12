package com.javaex.practice04;

public class Ex03 {

	public static void main(String[] args) {
		int[] intA = { 3, 6, 9 };
		int[] intB;
		int i = 0;
		intB = intA;
		intB[0] = 20;
		intB[2] = 10;
		for (i = 0; i < intA.length; i++) {
			System.out.println(intA[i]);
		}
	}

}
