package edu;
import java.util.Scanner;

public class Maxmin {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("message1:");
		int a = scanner.nextInt();
		System.out.print("message2:");
		int b = scanner.nextInt();
		
		int max = 0;
		int min = 0;
		
		if (a > b) {
			max = a;
			min = b;
		} else if (a < b) {
			min = a;
			max = b;
		} else {
			System.out.println("error");
			return;
		}	
		
		int rem = max%min;
		if (rem == 0) {
			System.out.printf("최대공약수 : %d, 최소공배수 : %d", min, (max*min)/min);
		} else {
			do {
				max = min;
				min = rem;
			} while (rem == 0);
			System.out.printf("최대공약수 : %d, 최소공배수 : %d", min, a*b/min);
		}
		
//		maxmin mm  = new maxmin();
//		mm.num1 = a;
//		mm.num2 = b;
//		
//		mm.print();
//	}
//	private void print() {
//		int max;
//		int min;
//		
//		if (num1<num2) {
//			max = num2;
//			min = num1;
//		} else {
//			max = num1;
//			min = num2;
//		}
//		
//		int rem = max%min;
//		if (rem == 0) {
//			System.out.printf("최대공약수 : %d, 최소공배수 : %d", min, (max*min)/min);
//		}
//		while(rem!=0) {
//			max = min;
//			min = rem;
//			rem = max%min;
//			
//	}
		
	}

}

