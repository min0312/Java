package com.ruby.java.ch06;

public class StaticMethodTest {
	int num = 123;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethodTest.print1();
		StaticMethodTest s = new StaticMethodTest();
		s.print2();
	}
	
	public static void print1() {
		System.out.println("Hello");
	}
		
	public void print2() {
		int num3 = num;
		System.out.println("java");
		System.out.println(num3);
	}


}
