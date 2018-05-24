package main.java.by.bazyk.maxAndMinInArray;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите размер массива: ");
		int n = in.nextInt();
		in.close();

		int[] array = new int[n];
		array = initArray(array);
			
		System.out.println("Максимальное число: " + getMaxValue(array));
		System.out.println("Минимальное число: " + getMinValue(array)); 
	}
	
	private static int[] initArray(int[] array) {
		Random rand = new Random();
		int evenNumber;
		for (int i=0; i< array.length; i ++) {
			evenNumber = rand.nextInt(2);
			if (evenNumber != 0) {
				array[i] = rand.nextInt(90) + 10;				
			}
			else {
				array[i] = rand.nextInt(90) - 99;
			}
		}
		return array;
	}

	private static int getMaxValue(int[] array) {
	    int maxValue = array[0];
	    for (int i = 1; i < array.length; i++) {
	        if (array[i] > maxValue) {
	            maxValue = array[i];
	        }
	    }
	    return maxValue;
	}
	
	private static int getMinValue(int[] array) {
	    int minValue = array[0];
	    for (int i = 1; i < array.length; i++) {
	        if (array[i] < minValue) {
	            minValue = array[i];
	        }
	    }
	    return minValue;
	}

}
