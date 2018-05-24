package main.java.by.bazyk.operationsWithNumbers;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		try {
			System.out.print("Введите первое число: ");
			int firstNumber = in.nextInt();
			System.out.print("Введите второе число: ");
			int secondNumber = in.nextInt();
			in.close();

			System.out.printf("\n%d + %d = %d", firstNumber, secondNumber, add(firstNumber, secondNumber));
			System.out.printf("\n%d - %d = %d", firstNumber, secondNumber, subtract(firstNumber, secondNumber));
			System.out.printf("\nНОД(%d,%d) = %d", firstNumber, secondNumber, gcd(firstNumber, secondNumber));
			System.out.printf("\nНОК(%d,%d) = %d", firstNumber, secondNumber, lcm(firstNumber, secondNumber));
			
		} catch (ArithmeticException e) {
			System.out.println(" / Деление на 0");
		} catch (InputMismatchException e) {
			System.out.println("Число не является целым! :c");
		}

		in.close();
	}

	private static int add(int firstNumber, int secondNumber) {
		return firstNumber + secondNumber;
	}

	private static int subtract(int firstNumber, int secondNumber) {
		return firstNumber - secondNumber;
	}

	private static int gcd(int firstNumber, int secondNumber) {
		return secondNumber == 0 ? firstNumber : gcd(secondNumber, firstNumber % secondNumber);
	}

	private static int lcm(int firstNumber, int secondNumber) {
		return firstNumber / gcd(firstNumber, secondNumber) * secondNumber;
	}
}
