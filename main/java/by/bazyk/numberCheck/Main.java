package main.java.by.bazyk.numberCheck;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String numberIs = "Число является ";
		Scanner in = new Scanner(System.in);

		try {
			System.out.print("Введите число: ");
			int number = in.nextInt();
			in.close();
			
			switch (number) {
			case -1:
				System.out.println(numberIs + checkNumberIsEven(number));
				break;
			case 0 :
				System.out.println(numberIs + checkNumberIsEven(number));
				break;
			case 1:
				System.out.println(numberIs + checkNumberIsEven(number));
				break;
			default:
				if (number < -1) {
					System.out.println(numberIs + checkNumberIsEven(number));
					break;
				}
				System.out.println(numberIs + checkNumberIsPrime(number) + " и "+ checkNumberIsEven(number));
				break;
			}

		} catch (InputMismatchException e) {
			System.out.println("Число не является целым! :c");
		}
		
	}

	private static String checkNumberIsPrime(int number) {

		Boolean isNumber = false; // true = простое, false = составное

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isNumber = true;
				break;
			}
		}
		
		return isNumber ? "составным" : "простым";
	}
	
	private static String checkNumberIsEven(int number) {

		Boolean isNumber = false; // true = чётным, false = нечётным

			if (number % 2 == 0) {
				isNumber = true;
			}
			
		return isNumber ? "чётным" : "нечётным";
	}

}
