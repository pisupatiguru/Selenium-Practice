package com.training.corejava;

import java.util.Iterator;

public class Loops {

	public static void main(String[] args) {
		int counter = 1;
		for (int i = 0; i <= 4; i++) {
			for (int j = 1; j <= 4 - i; j++) {
				System.out.print(counter);
				System.out.print("\t");
				counter++;
			}
			System.out.println();
		}
		counter = 1;
		for (int i = 0; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(counter);
				System.out.print("\t");
				counter++;
			}
			System.out.println();
		}


	}
}
