package com.javaex.practice04;

public class Ex02 {

	public static void main(String[] args) {
		double[] dArray = { 6.7, 3.3, 1.2 };
		int i = 0;
		dArray[0] = 3;
		dArray[1] = 7;
		dArray[2] = 12;

		for (i = 0; i < dArray.length; i++) {
			System.out.println(dArray[i]);
		}
	}

}
