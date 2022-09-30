package edu;

public class Armor_Test {
	public static void main(String[] args) {
		
		Armor ar = new Armor();
		
		
		System.out.println("name : " + ar.getName());
		
		Armor ar1 = new Armor(165);
		System.out.println("h : " + ar1.getHeight());
		
		Armor ar2 = new Armor("이름 ", 100, 100, "블랙", false);
		System.out.println("name " + ar2.getName());
		System.out.println("height " + ar2.getHeight());
		System.out.println("weight " + ar2.getWeight());
		System.out.println("color " + ar2.getColor());
		System.out.println("isFly " + ar2.isFly());
		System.out.println("ar2" + ar2.toString());
	}

}
