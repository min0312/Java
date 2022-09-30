package edu;

public class project2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] s = new int[2][3];
		
		
		
		for(int i = 0; i < s.length; i++) {
			for(int j = 0; j < s[i].length; j++) {
				s[i][j] = (int)(Math.random()*10);
			}
		}
		
		for(int i = 0; i < s.length; i++) {
			for(int j = 0; j < s[i].length; j++) {
				System.out.print(s[i][j]);
				System.out.print("\t");
			}
			System.out.println("\n");
		}
		

	}

}