package doit;

import java.util.ArrayList;
import java.util.List;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();
		list.add("아메리카노");
		list.add("콜드브루");
		list.add("카페라떼");
		
		print(1, list);
		
		list.add("바닐라라떼");
		list.add("카라멜마끼아또");
		print(2, list);
		
		list.remove(1);
		
		list.remove("카라멜마끼아또");
		
		print(3, list);
		
		System.out.println("4 : " + list.contains("콜드브루"));
		System.out.println("5 : " + list.contains("카페라떼"));
		
		
	}
			
	public static void print(int n, List<String> list) {
		System.out.println(n + " : " + list);
	}
}
