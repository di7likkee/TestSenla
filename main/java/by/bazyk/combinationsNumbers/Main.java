package main.java.by.bazyk.combinationsNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Первое число: ");
		int firstNumber = in.nextInt();
		System.out.print("Второе число: ");
		int secondNumber = in.nextInt();
		System.out.print("Третье число: ");
		int thirdNumber = in.nextInt();
		in.close();

		List<String> listCombinations = new ArrayList<String>();
		String[] array = { String.valueOf(firstNumber), String.valueOf(secondNumber), String.valueOf(thirdNumber) };
		int amount = fuctorial(array.length);
		int maxNumber = array.length - 1;
		int nextIndex = maxNumber;
		String tmp;

		while (amount > 0) {
			tmp = array[nextIndex];
			array[nextIndex] = array[nextIndex - 1];
			array[nextIndex - 1] = tmp;
			if (!listCombinations.contains(Arrays.toString(array))) {
				listCombinations.add(Arrays.toString(array));
			}
			amount--;
			if (nextIndex < 2) {
				nextIndex = maxNumber;
			} else {
				nextIndex--;
			}
		}

		print(listCombinations);
		System.out.println("Количество вариантов: " + listCombinations.size());

	}

	private static void print(List<String> listCombinations) {
		System.out.println(listCombinations);
	}

	private static int fuctorial(int n) {
		return (n > 0) ? n * fuctorial(n - 1) : 1;
	}

}
