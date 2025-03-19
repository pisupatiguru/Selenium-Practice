package com.training.corejava;

public class MultiDimensionalArrays {
	public static void main(String[] args) {
		int arr[][] = new int[2][3];
		arr[0][0] = 2;
		arr[0][1] = 4;
		arr[0][2] = 5;
		arr[1][0] = 3;
		arr[1][1] = 4;
		arr[1][2] = 7;
		System.out.println(arr[1][0]);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
		int b[][] = { { 2, 4, 5 }, { 3, 4, 7 }, { 5, 2, 1 } };
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				System.out.print(b[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}
