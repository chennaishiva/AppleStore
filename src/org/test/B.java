package org.test;

public class B {

	private  void m1() {
		A a = new A();
		System.out.println(a.x);

	}

	public static void main(String[] args) {
		B b = new B();
		b.m1();
	}

}
