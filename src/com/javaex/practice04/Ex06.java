package com.javaex.practice04;

public class Ex06 {

	public static void main(String[] args) {
		int i = 0;
		char c[] = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l' };

		for (i = 0; i < c.length; i++) {
			if (c[i] != ' ')
				System.out.print(c[i]);
			else
				System.out.print(",");
		}

	}

}
