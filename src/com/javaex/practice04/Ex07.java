package com.javaex.practice04;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = 0;
		int i = 0;
		int[] wonArray = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 1 };

		System.out.print("금액: ");
		if (sc.hasNextInt()) {
			money = sc.nextInt();
		} else
			System.out.println("잘못된 입력");
		sc.close();

		for (i = 0; i < wonArray.length; i++) {
			System.out.println(wonArray[i] + "원 : " + money / wonArray[i]);
			money = money - wonArray[i] * (money / wonArray[i]);
		}
	}

}
