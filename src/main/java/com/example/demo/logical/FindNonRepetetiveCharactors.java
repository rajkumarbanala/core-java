package com.example.demo.logical;

public class FindNonRepetetiveCharactors {

	public static void main(String[] args) {

		String s = "aabbcddeffgggghcbcdefghijkll";

		char[] v = s.toCharArray();

		for (int row = 0; row < v.length; row++) {

			boolean isFound = false;

			for (int col = row + 1; col < v.length; col++) {

				if (v[row] != '@' && v[row] == v[col]) {
					isFound = true;
					v[col] = '@';
					break;
				}
			}
			if (!isFound && v[row] != '@')
				System.out.print(v[row] + ", ");
		}

	}

}
