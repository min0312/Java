package edu;

//import java.util.Scanner;

public class Gugudan {
	// 함수 및 입력 수 데이터 타입, 데이터 변경
	public void printGugudan(int col) {
		
//		int col; // int col 입력함에 따라 삭제 처리
		
		// Scanner
//		try (Scanner scanner = new Scanner(System.in)) {
//			System.out.print("Column : ");
//			col = scanner.nextInt();
//		} catch (Exception e) { // 예외 발생 캐치
//			return;
//		}
		
		// col 타입을 애초에 int로 입력받음에 따른 삭제처리
//		col = Integer.parseInt(args[0]);
//		if (col < 1 || 9 <= col) {
//			System.out.println("col is not valid!");
//			return;
//		}

		for(int i = 2 ; i < 10 ; i+=col) {
			for(int j = 1 ; j < 10 ; j++) {
				for (int k = 0 ; k < col ; k++) {
					if (10 <= i+k) {
						System.out.print("\n");
						break;
					}
					System.out.printf("%d*%d=%d", (i+k), j, (i+k)*j);
					if (k < col -1)	System.out.print("\t");
					else			System.out.print("\n");
				}
			}
			System.out.println();
		}
		


	}

}