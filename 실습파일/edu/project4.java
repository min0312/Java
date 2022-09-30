package edu;

public class project4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[2][3];
		int[][] b = new int[2][3];
		int[][] c = new int[2][3];
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				a[i][j] = (int)(Math.random()*10);
			}
		}
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]);
				System.out.print("\t");
			}
			System.out.println("\n");
		}
		
		
		
		for(int i = 0; i < b.length; i++) {
			for(int j = 0; j < b[i].length; j++) {
				b[i][j] = (int)(Math.random()*10);
			}
		}
		
		for(int i = 0; i < b.length; i++) {
			for(int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j]);
				System.out.print("\t");
			}
			System.out.println("\n");
		}
		
		
		System.out.println("\n");
		
		for(int i = 0; i < c.length; i++) {
			for(int j = 0; j < c[i].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		
		for(int i = 0; i < c.length; i++) {
			for(int j = 0; j < c[i].length; j++) {
				System.out.print(c[i][j]);
				System.out.print("\t");
			}
			System.out.println("\n");
		}
		
		System.out.println("----------");
		
		
		int[][] d = new int[2][3];
		int[][] e = new int[3][4];
		int[][] f = new int[2][4];
		
		for(int i = 0; i < d.length; i++) {
			for(int j = 0; j < d[i].length; j++) {
				d[i][j] = (int)(Math.random()*10);
			}
		}
		
		for(int i = 0; i < d.length; i++) {
			for(int j = 0; j < d[i].length; j++) {
				System.out.print(d[i][j]);
				System.out.print("\t");
			}
			System.out.println("\n");
		}
		
		
		
		for(int i = 0; i < e.length; i++) {
			for(int j = 0; j < e[i].length; j++) {
				e[i][j] = (int)(Math.random()*10);
			}
		}
		
		for(int i = 0; i < e.length; i++) {
			for(int j = 0; j < e[i].length; j++) {
				System.out.print(e[i][j]);
				System.out.print("\t");
			}
			System.out.println("\n");
		}
		
		
		System.out.println("\n");
		
		for(int i = 0; i < f.length; i++) {
			for(int j = 0; j < f[i].length; j++) {
				int result = 0;
				for(int k = 0; k < d[i].length; k++) {
					result += d[i][k] * e[k][j];
				}
				f[i][j] = result;
			}
		}
		
		for(int i = 0; i < f.length; i++) {
			for(int j = 0; j < e[i].length; j++) {
				System.out.print(f[i][j]);
				System.out.print("\t");
			}
			System.out.println("\n");
		}
		

	}

}