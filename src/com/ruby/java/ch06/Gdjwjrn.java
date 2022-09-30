package com.ruby.java.ch06;

public class Gdjwjrn {
	
	private int num1;
	private int num2;
	
	
//	public Gdjwjrn(int num1, int num2) {
//		this.num1 = num1;
//		this.num2 = num2;
//	}
	
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public void print() {
		int max;
		int min;
		
		if (num1 < num2) {
			max = num2;
			min = num1;
		} else {
			max = num1;
			min = num2;
		}
		int rem = max%min;
		if (rem == 0) {
			System.out.printf("최대공약수 : %d, 최소공배수 : %d", min, max);
		}
		while(rem!=0) {
			max = min;
			min = rem;
			rem = max%min;
			System.out.printf("최대공약수 : %d, 최소공배수 : %d", min, num1*num2/min);
		}
		
	}
}
