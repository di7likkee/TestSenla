package main.java.by.bazyk.allEvenNumbersAndTheirSum;

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
		
		int sum = findEvenNumbers(n);
		System.out.println("Сумма чётных чисел: " + sum);
	}

	private static int findEvenNumbers(int n) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
				sum += i;
			}
		}
		
		return sum;
	}

}
