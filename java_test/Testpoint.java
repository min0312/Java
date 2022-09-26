package com.ruby.java.ch06;


class Point {
	private int x,y;
	public Point() {}
	public Point(int a, int b) {
		a = x;
		b = y;
	}
	
//		public void show() {
//			System.out.println(Point());
//		}
//}


public class Testpoint extends Point {
	private String color;
	public Testpoint(int x, int y, String z) {
		super(x, y);
		color = z;
		System.out.println(x + y + z);
	}
	public void show2() {
		System.out.println(color);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		}
	
//		public void setcolorpoint(int a, int b, String c) {
//			this.c = c;
//			setPoint(a,b);
//		}
//		public void getcolorpoint() {
//			System.out.println(c);
//			getPoint();
//		}

	}
}
