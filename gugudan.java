package edu;

public class gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int set = 5;
		
		for(int i = 2; i<=9; i+=set) {
			for(int j = 1; j <= 9; j++) {
				for(int k = 0; k < set; k++) {
					System.out.print((i+k) + "*" + j + "=" + (i*j));
					
					if(k < set-1)
						System.out.print("\t");
					else
						System.out.print("\n");
				}
			}
			System.out.print("\n");
		}
		
//		for(int i = 2; i<10; i++) {
//			for(int j = 1; j < 10; j++) {
//				System.out.println(i + "*" + j + "=" + (i*j));
//			}
//			System.out.print("\n");
//		}

	}

}