package main.java.by.bazyk.palindrome;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String word;
		Boolean result;
		Scanner in = new Scanner(System.in);

		do {
			System.out.print("Введите слово: ");
			word = in.nextLine();

			result = isPalindrome(word);
			System.out.println(result.toString());

		} while (!(word.equals("exit")));
		
		in.close();
	}

	public static boolean isPalindrome(String word) {
		word = word.replaceAll("[\\s]", "").toLowerCase();
		boolean result = true;
		for (int i = 0; i < word.length() / 2; i++) {
			if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
				result = false;
				break;
			}
		}
		
		return result;
	}

}
