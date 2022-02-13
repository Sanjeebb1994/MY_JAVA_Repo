package com.revise;

public class Swaping_A_Number {
	
	public static void main(String[] args) {
		int a=10;
		int b=20;
		b=a+b;
		a=b-a;
		b=b-a;
		System.out.println(a);
		System.out.println(b);
	}
}
