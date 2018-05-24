package main.java.by.bazyk.checkTriangle;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите отрезок a: ");
		int a = in.nextInt();
		System.out.print("Введите отрезок b: ");
		int b = in.nextInt();
		System.out.print("Введите отрезок c: ");
		int c = in.nextInt();
		in.close();

		checkingTriangle(a, b, c);
	}

	private static void checkingTriangle(int a, int b, int c) {
		if (!((a + b > c) && (a + c > b) && (c + b > a))) {
			System.out.println("Треугольник с такими сторонами построить невозможно");
			return;
		}
		if ((Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) || (Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2))
				|| (Math.pow(c, 2) + Math.pow(b, 2) == Math.pow(a, 2))) {
			System.out.println("Прямоугольный треугольник построить можно");
		}
		else {
			System.out.println("Прямоугольный треугольник построить нельзя");
		}
	}

}
