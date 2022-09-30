package edu;
import java.util.Random;
import java.util.Scanner;

public class project3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int[][] s = new int[2][3];
		int n = scanner.nextInt();
		
		
		
		for(int i = 0; i < s.length; i++) {
			for(int j = 0; j < s[i].length; j++) {
				s[i][j] = random.nextInt(n+1);
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