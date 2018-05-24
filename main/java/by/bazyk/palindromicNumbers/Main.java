package main.java.by.bazyk.palindromicNumbers;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);

		do {
			System.out.print("Длина последовательности: ");
			n = in.nextInt();
		} while (n > 100 || n < 0);

		in.close();

		printPalindrome(n);
	}

	private static int getCountsOfDigits(int number) {
		return String.valueOf(Math.abs(number)).length();
	}

	private static void printPalindrome(int n) {
		boolean result, singleDigit = true;

		for (int i = 0; i < n; i++) {
			result = true;
			for (int j = 0; j < getCountsOfDigits(i) / 2; j++) {
				if (String.valueOf(i).charAt(j) != String.valueOf(i).charAt(String.valueOf(i).length() - j - 1)) {
					result = false;
					break;
				}
				if (result) {
					System.out.println(i);
					singleDigit = false;
				}
			}
			if (singleDigit) {
				System.out.println(i);
			}
		}
	}
}
