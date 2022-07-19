package com.example.demo.logical;

public class Pyramid1 {

// 	    *
//	   * *
//	  * * *
//	 * * * *

	public static void main(String[] args) {
		
		int n = 5;

		for (int row = 1; row < n; row++) {

			for (int sp1 = 1; sp1 < n - row; sp1++) {
				System.out.print(" ");
			}
			
			int sp2 = 1;
			for (int v = 1; v <= row; v++) {
				System.out.print("*");
				if (sp2 < row) {
					System.out.print(" ");
					sp2++;
				}
			}
			System.out.println();
		}
	}
}
