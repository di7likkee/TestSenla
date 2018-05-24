package main.java.by.bazyk.searchWord;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите текст: ");
		String text = in.nextLine();
		System.out.print("Введите слово: ");
		String word = in.nextLine();
		in.close();

		System.out.println("Употребляется " + searchWord(text.toLowerCase(), word.toLowerCase()) + " раз(а)");

	}

	private static int searchWord(String text, String word) {
		int i = text.indexOf(word);
		int amount = 0;

		while (i >= 0) {
			amount++;
			i = text.indexOf(word, ++i);
		}

		return amount;
	}

}
