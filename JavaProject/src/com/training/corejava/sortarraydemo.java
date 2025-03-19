package com.training.corejava;

public class sortarraydemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 4;
		int b = 5;
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("a,b=" + a + " " + b);
		System.out.println("\n");
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a,b=" + a + " " + b);

		System.out.println("\n");

		int arr[] = { 2, 6, 1, 4, 9 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
				}
			}
		}

	}

}
