package com.revise;

public class ReverseA_String {
	public static void main(String[] args) {
		String str="Mahabharat";
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			char ch=str.charAt(i);
			rev=rev+ch;
		}
		System.out.println(rev);
	}
}
