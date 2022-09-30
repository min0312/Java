package com.ruby.java.ch06;

class Student {
	// student 클래스 생성
	private int sno;
	private String name;
	private double height;
	// 변수 선언
	
	public void getStudent(int sno, String name, double height) {
		this.sno = sno;
		this.name = name;
		this.height = height;
	}
	// getStudent 함수 생성. getStudent(값) 실행을 통해 변수에 값 넣어주기
	
	public void print() {
		System.out.printf("학번:  %d\n이름: %s\n키: %f", sno, name, height);
	}
	// print 함수 생성
}
	
public class Info {
	public static void main(String[] args) {
		Student min = new Student();
		min.getStudent(01, "민경", 1.63);
		min.print();
	}
	// info 클래스 생성 후 Student클래스를 활용한 min함수 생성, min.함수를 통해 실행
}

