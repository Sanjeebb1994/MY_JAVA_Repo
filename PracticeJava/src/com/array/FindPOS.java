package com.array;

import java.util.LinkedHashSet;

public class FindPOS {
	public static void main(String[] args) {
		String s="Tester";
		s=s.toLowerCase();
		LinkedHashSet<Character> set=new LinkedHashSet<Character> ();
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		
		for(char ch:set) {
			for(int j=s.length()-1;j>=0;j--) {
				if(ch==s.charAt(j)) {
					System.out.println(ch+" "+(j+1));
					break;
				}
			}
		}
	}
}
