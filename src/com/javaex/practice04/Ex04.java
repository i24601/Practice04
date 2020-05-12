package com.javaex.practice04;

public class Ex04 {

	public static void main(String[] args) {
		int[] data = { 1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31 };
		int i = 0, count = 0, sum = 0;

		for (i = 0; i < data.length; i++) {
			if (data[i] % 3 == 0) {
				count++;
				sum = sum + data[i];
			}
		}
		System.out.println(count + "\n" + sum);
	}

}
