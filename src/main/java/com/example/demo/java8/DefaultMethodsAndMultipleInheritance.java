package com.example.demo.java8;

public class DefaultMethodsAndMultipleInheritance {

	public static void main(String[] args) {
		DefaultMethodsAndMultipleClass1 c1 = new DefaultMethodsAndMultipleClass1();
		c1.m1();
		
		DefaultMethodsAndMultipleClass2 c2 = new DefaultMethodsAndMultipleClass2();
		c2.m1();

		Interface1 i1 = new DefaultMethodsAndMultipleClass1();
		i1.m1();
		
		Interface1 i2 = new DefaultMethodsAndMultipleClass2();
		i2.m1();
		
		Interface2 i3 = new DefaultMethodsAndMultipleClass1();
		i3.m1();
		
		Interface2 i4 = new DefaultMethodsAndMultipleClass2();
		i4.m1();
	}

}

interface Interface1 {
	default void m1() {
		System.out.println("Interface1 m1()");
	}
}

interface Interface2 {
	default void m1() {
		System.out.println("Interface2 m1()");
	}
}

class DefaultMethodsAndMultipleClass1 implements Interface1, Interface2 {
	public void m1() {
		Interface1.super.m1();
	}
}
class DefaultMethodsAndMultipleClass2 implements Interface1, Interface2 {
	public void m1() {
		Interface2.super.m1();
	}
}