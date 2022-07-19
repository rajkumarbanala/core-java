package com.example.demo.logical;

import java.util.HashSet;
import java.util.Set;

public class RemoveFirstDuplicateCharacter {

	public static void main(String[] args) {

		String input = "aaabcdededdfffghgghggh";
		System.out.println("input:" + input);

		char[] v = input.toCharArray();
		String output = "";
		Set<Character> list = new HashSet<>();

		for (int row = 0; row < v.length; row++) {

			for (int col = row + 1; col < v.length; col++) {

				if (v[row] != '@' && v[row] == v[col]) {

					if (!list.contains(v[row])) {
						list.add(v[row]);
						v[row] = '@';
					}
				}
			}
		}

		for (int row = 0; row < v.length; row++) {
			if (v[row] != '@') {
				output = output + v[row];
			}
		}

		System.out.println("output:" + output);
	}

}
