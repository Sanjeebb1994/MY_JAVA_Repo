package com.array;

public class PatternString1 {
	public static void main(String[] args) {
		String str="india";
		String rev="";
		for(int i=0;i<str.length();i++) {
			rev=rev+str.charAt(i);
			System.out.println(rev);
		}
	}
}
