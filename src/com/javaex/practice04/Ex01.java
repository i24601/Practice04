package com.javaex.practice04;

public class Ex01 {

	public static void main(String[] args) {
		int[] intArray = new int[5];
		int result = 0, i = 0;
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;

		for (i = 0; i < intArray.length; i++) {
			result = result + intArray[i];
		}
		System.out.println(result);
	}

}
