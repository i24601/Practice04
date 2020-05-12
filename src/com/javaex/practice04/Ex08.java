package com.javaex.practice04;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		int user[] = new int[6];
		int com[] = new int[6];
		int i = 0, j = 1, count = 0;

		user = sort(user_lott());
		com = sort(com_lott());
		
		for (i = 0; i < user.length; i++) {
			for (j = 0; j < user.length; j++) {
				if (user[i] == com[j]) {
					count++;
				}
			}
		}

		System.out.println("\n당신의 번호는");
		for (i = 0; i < user.length; i++) {
			System.out.print(user[i] + " ");
		}
		System.out.println("\n당첨번호는");
		for (i = 0; i < user.length; i++) {
			System.out.print(com[i] + " ");
		}

		switch (count) {
		case 5:
			System.out.println("\n\n10억입니다");
			break;
		case 4:
			System.out.println("\n\n5천만원입니다");
			break;
		case 3:
			System.out.println("\n\n5000원입니다");
			break;
		default:
			System.out.println("\n\n꽝입니다");
			break;
		}
	}

	static int[] com_lott() {

		int lott_num[] = new int[6];
		int num, i, j;
		boolean check = true;

		for (i = 0; i < 6; i++) {

			j = 0;
			num = (int) ((Math.random() * 46) % 45 + 1);

			while (j != 5) {
				if (num != lott_num[j]) {
					check = true;
				} else {
					check = false;
					break;
				}
				j++;
			}

			if (check) {
				lott_num[i] = num;
			} else {
				i--;
			}
		}
		return lott_num;
	}

	static int[] user_lott() {

		Scanner sc = new Scanner(System.in);
		int user_num[] = new int[6];
		int num, i, j;
		boolean check = true;

		for (i = 0; i < user_num.length; i++) {

			j = 0;
			System.out.printf("%d번째 숫자를 입력: ", i + 1);
			if (sc.hasNextInt()) {
				num = sc.nextInt();
				while (j != user_num.length - 1) {
					if (num != user_num[j]) {
						check = true;
					} else {
						check = false;
						break;
					}
					j++;
				}
				if (num > 0 && num < 46) {
					if (check) {
						user_num[i] = num;
					} else if (!check) {
						System.out.println("중복된 숫자입니다");
						i--;
					}
				} else {
					System.out.println("1 ~ 45 범위 내의 숫자를 입력하세요");
					i--;
				}
			} else {
				System.out.println("숫자만 입력하세요");
				sc.next();
				i--;
			}
		}
		sc.close();
		return user_num;
	}

	static int[] sort(int array[]) {

		int i = 0, j = 1, k = 1, tmp = 0;

		for (k = 0; k < array.length - 1; k++) {
			j = 1;
			for (i = 0; i < array.length - 1; i++) {
				if (array[i] > array[j]) {
					tmp = array[j];
					array[j] = array[i];
					array[i] = tmp;
				}
				j++;
			}
		}
		return array;
	}
}