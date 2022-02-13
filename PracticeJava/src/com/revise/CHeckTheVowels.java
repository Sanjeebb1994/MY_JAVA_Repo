package com.revise;

public class CHeckTheVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String []name= {"Rakshith", "Chat", "Zoom"};
		String vowel="aeiou";
		String value="";
		for(int i=0;i<name.length;i++) {
			value=name[i];
			value=value.toLowerCase();
			 int count=0;
			for(int j=0;j<value.length();j++) {
				char ch1=value.charAt(j);
				for(int k=0;k<vowel.length();k++) {
					char ch2=vowel.charAt(k);
					if(ch2==ch1) {
						count++;
					}
				}
			}
			if(count>0) {
				System.out.println(value+"==>"+count);
			}
		}
	}

}
