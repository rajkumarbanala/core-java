package com.example.demo.exception.e1;

public class TryCatchFinallyClass {

	public static void main(String[] args) {

		System.out.println("m1():" + m1());
		System.out.println("m2():" + m2());
		System.out.println("m3():" + m3());

	}

	public static int m1() {
		try {

			if (true)
				throw new RuntimeException("error");

			return 1;

		} catch (Exception e) {

			return 2;

		} finally {

			return 3;
		}
	}

	public static int m2() {
		try {

			if (true)
				throw new RuntimeException("error");

			return 1;

		} catch (Exception e) {

			return 2;
		}
	}

	public static int m3() {
		try {

			if (true)
				throw new RuntimeException("error");

			return 1;

		} finally {

			return 2;
		}
	}
}
