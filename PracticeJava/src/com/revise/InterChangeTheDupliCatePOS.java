package com.revise;

import java.util.LinkedHashSet;

public class InterChangeTheDupliCatePOS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Tester";
		str=str.toLowerCase();
		System.out.println("The Given String is: "+str);
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<str.length();i++) {
			set.add(str.charAt(i));
		}
		
		for(char ch:set) {
			for(int j=str.length()-1;j>=0;j--) {
				if(ch==str.charAt(j)) {
					System.out.println(ch+"==>"+(j+1));
					break;
				}
			}
		}
	}

}
