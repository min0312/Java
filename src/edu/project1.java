package edu;
import java.util.Scanner;

public class project1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scanner = new Scanner(System.in);
//		int[][] s = new int[5][5];
//		int num = scanner.nextInt();
//		
//		
//		for(int i = 0; i < s.length; i++) {
//			for(int j = 0; j < s[i].length; j++) {
//				s[i][j] = num++;
//			}
//		}
//		
//		for(int i = 0; i < s.length; i++) {
//			for(int j = 0; j < s[i].length; j++) {
//				System.out.print(s[i][j]);
//				System.out.print("\t");
//			}
//			System.out.println("\n");
//		}
//		scanner.close();
		
		Scanner scanner = new Scanner(System.in);
		int[][] s = new int[2][3];
		
		
		
		for(int i = 0; i < s.length; i++) {
			for(int j = 0; j < s[i].length; j++) {
				s[i][j] = scanner.nextInt();
			}
		}
		
		for(int i = 0; i < s.length; i++) {
			for(int j = 0; j < s[i].length; j++) {
				System.out.print(s[i][j]);
				System.out.print("\t");
			}
			System.out.println("\n");
		}
		scanner.close();
		

	}

}