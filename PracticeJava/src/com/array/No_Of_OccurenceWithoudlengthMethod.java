package com.array;

public class No_Of_OccurenceWithoudlengthMethod {
	public static void main(String[] args) {
		String str="Sanjeeb";
		
//		System.out.println(ch);
		int count=0;
		for(int i=0;i<=count;i++) {
			char ch1=str.charAt(count);
//			count=0;
			for(int j=0;j<=count;j++) {
				char ch2=str.charAt(count);
				if(ch1==ch2&&i>j) {
					break;
				}
				if(ch1==ch2) {
					count++;
				}
			}
			if(count>0) {
				System.out.println(ch1+" is "+count+" Times.");
			}
		}
		
	}
}
