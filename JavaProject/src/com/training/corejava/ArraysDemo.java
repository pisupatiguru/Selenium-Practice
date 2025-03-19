package com.training.corejava;

import java.util.Iterator;

public class ArraysDemo {

	public static void main(String[] args) {

		int a[] = new int[5];

		a[0] = 2;
		a[1] = 6;
		a[2] = 1;
		a[3] = 9;
		a[4] = 12;

		int b[] = { 1, 4, 3, 5, 7, 8 };

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}

}
