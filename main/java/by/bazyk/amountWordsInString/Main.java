package main.java.by.bazyk.amountWordsInString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Введите строку: ");
		String sourceString = in.nextLine();
		in.close();

		sourceString = getProcessedString(sourceString);
		String[] bufferWords = sourceString.split(" ");

		ArrayList<String> listWords = getProcessedListWords(bufferWords);

		System.out.println("\nВы ввели " + listWords.size() + " слов(а)\n");
		
		Collections.sort(listWords);
		outputToConsole(listWords);

	}

	private static String getProcessedString(String str) {
		str = str.trim();
		str = str.replace(',', ' ');
		str = str.replaceAll("[\\s]{2,}", " ");

		return str;
	}

	private static ArrayList<String> getProcessedListWords(String[] bufferWords) {
		ArrayList<String> listWords = new ArrayList<>();
		Boolean checkIsLetter = true;

		for (int i = 0; i < bufferWords.length; i++) {
			for (int j = 0; j < bufferWords[i].length(); j++) {
				checkIsLetter = true;
				if (!Character.isLetter(bufferWords[i].charAt(j))) {
					checkIsLetter = false;
					break;
				}
			}
			if (checkIsLetter) {
				listWords.add(bufferWords[i]);
			}
		}

		return listWords;
	}
	
	private static void outputToConsole(ArrayList<String> list) {
		for (int i=0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
