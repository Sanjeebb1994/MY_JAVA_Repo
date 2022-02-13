package com.array;

import java.util.LinkedHashSet;

//Without Using Collection:--
public class CherecterPositionOfAString {
		public static void main(String[] args) {
			String str="Tester";
			String lower=str.toLowerCase();
			for(int i=0;i<lower.length();i++) {
				char ch1=lower.charAt(i);
				int count=0;
				for(int j=0;j<lower.length();j++) {
					char ch2=lower.charAt(j);
					if(ch1==ch2&&i>j) {
						break;
					}
					if(ch1==ch2) {
						count++;
					}
				}
				if(count>0) {
					System.out.println(ch1+"---> "+(i+1));
				}
			}
		}
}


//With Using Collection:--

class CherecterPositionOfAString2{
	
	public static void main(String[] args) {
		String s="Tester";
		String lower=s.toLowerCase();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<lower.length();i++) {
			set.add(s.charAt(i));
		}
		
		for(char ch:set) {
			int count=0;
			for(int i=0;i<lower.length();i++) {
				if(ch==lower.charAt(i)) {
					count++;
				}
				if(count>0) {
					System.out.println(ch+"---->"+(i+1));
					break;
				}
			}
			
		}
	}
}
























