package edu;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[2][3];
		int[][] b = new int[3][4];
		int[][] c = new int[2][4];

		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				a[i][j] = (int) (Math.random() * 10);
			}
		}
		
		for(int i = 0; i < b.length; i++) {
			for(int j = 0; j < b[i].length; j++) {
				b[i][j] = (int) (Math.random() * 10);
			}
		}
		
		for(int i = 0; i < c.length; i++) {
			for(int j = 0; j < c[i].length; j++) {
				int result = 0;
				for(int k = 0; k < a[i].length; k++) {
					result += a[i][k] * b[k][j];
				}
				c[i][j] = result;
			}
		}
			
		for(int i = 0; i < c.length; i++) {
			for(int j = 0; j < c[i].length; j++) {
				System.out.print(c[i][j]);
				System.out.print("\t");
			}
			System.out.println("\n");
		}
			
		
	}

}
