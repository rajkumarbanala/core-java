package com.example.demo.logical;

public class FindDuplicateCharactors {

	public static void main(String[] args) {
		
		String s = new String("Great responsibility");
		char[] sa = s.toCharArray();

		for (int row = 0; row < sa.length; row++) {

			int count = 1;

			for (int col = row + 1; col < sa.length; col++) {

				if (sa[row] != '@' && sa[row] == sa[col]) {
					count++;
					sa[col] = '@';
				}
			}
			if (count > 1 && sa[row] != '@')
				System.out.print(sa[row] + ", ");
		}
	}
}
