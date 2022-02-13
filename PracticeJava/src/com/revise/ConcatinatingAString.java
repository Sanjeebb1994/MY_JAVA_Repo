package com.revise;

public class ConcatinatingAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="abc"+"xyz";
		for(int i=0;i<str.length()/2;i++) {
			System.out.println(str.charAt(i)+""+str.charAt(str.length()/2+i));
		}
	}

}
