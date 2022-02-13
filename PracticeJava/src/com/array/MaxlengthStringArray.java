package com.array;

public class MaxlengthStringArray {
	
	public static void main(String[] args) {
		String[] str= {"ashutosh","mshutosh","tarini","amitab","samir","vishnu"};
		String maxElement = str[0];
		for(int i=1;i<str.length;i++)
		{
		if(maxElement.length()<str[i].length())
		{
			maxElement=str[i];
		}
		}
		for (int i = 0; i < str.length; i++) {
			if(maxElement.length()==str[i].length())
			{
				System.out.println(str[i]);
			}
		}
	}
}
