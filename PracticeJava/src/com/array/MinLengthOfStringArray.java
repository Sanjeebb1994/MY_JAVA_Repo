package com.array;

public class MinLengthOfStringArray {
	
	public static void main(String[] args) {
		String[] str= {"ashutosh","aamir","mshutosh","tarini","amitab","samir","vishnu"};
		String minElement = str[0];
		for(int i=1;i<str.length;i++)
		{
			if(minElement.length()>str[i].length())
			{
				minElement=str[i];
			}
		}
		for (int i = 0; i < str.length; i++) {
			if(minElement.length()==str[i].length())
			{
				System.out.println(str[i]);
			}
		}
	}
}
