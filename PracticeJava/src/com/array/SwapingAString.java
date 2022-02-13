package com.array;

public class SwapingAString {
	public static void main(String[] args) {
		String s="Well come to India";
		System.out.println("Original String is: "+s);
		
		String [] swap=s.split(" ");
		String temp=swap[0];
		swap[0]=swap[swap.length-1];
		swap[swap.length-1]=temp;
		for(String s1:swap) {
			System.out.print(s1+" ");
		}
	}
}
