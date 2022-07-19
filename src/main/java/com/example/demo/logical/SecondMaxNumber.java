package com.example.demo.logical;

public class SecondMaxNumber {

	public static void main(String[] args) {

		int[] v = { 2, 3, 7, 8, 9, 11, 10, 12, 13, 14, 15, 18, 16 };

		int fMax = v[0];
		int sMax = 0;

		for (int row = 0; row < v.length; row++) {

			if (v[row] > fMax) {
				sMax = fMax;
				fMax = v[row];
			} else if (v[row] > sMax) {
				sMax = v[row];
			}
		}
		System.out.println("fMax: " + fMax);
		System.out.println("sMax: " + sMax);
	}
}
