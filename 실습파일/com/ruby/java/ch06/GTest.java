package com.ruby.java.ch06;

import java.util.Scanner;

public class GTest {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("message1:");
		int a = scanner.nextInt();
		System.out.print("message2:");
		int b = scanner.nextInt();
		
		Gdjwjrn gd1 = new Gdjwjrn();
		gd1.setNum1(a);
		gd1.setNum2(b);
		gd1.print();
	}
}
