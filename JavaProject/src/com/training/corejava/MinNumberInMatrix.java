package com.training.corejava;


public class MinNumberInMatrix {

	public static void main(String[] args) {
		int a[][] = { { 2, 4, 5 }, { 3, 4, 7 }, { 1, 2, 9 } };
		int min = a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i][j] < min) {
					min = a[i][j];
				}
			}
		}
		System.out.println("min value = " + min);
		System.out.println("*******************************");
		MaxNumfromMin();

	}

	public static void MaxNumfromMin() {
		int a[][] = { { 2, 4, 10 }, { 3, 4, 5 }, { 1, 2, 0 } };
		int min = a[0][0];
		int mincol = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i][j] < min) {
					min = a[i][j];
					mincol = j;
				}
			}
		}
		System.out.println("min value = " + min);
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i][mincol] > max) {
				max = a[i][mincol];
			}
		}
		System.out.println("max of the min value columb = " + max);
	}
}
