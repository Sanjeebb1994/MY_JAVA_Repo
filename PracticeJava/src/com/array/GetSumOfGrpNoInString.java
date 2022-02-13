package com.array;

public class GetSumOfGrpNoInString {
	public static void main(String[] args) {
		String s="a12hg67&456rt23";
		int sum=0,Tsum=0;
		for(int i=0;i<s.length();i++) {
			int n=s.charAt(i)-48;
			
			if(s.charAt(i)>'0'&& s.charAt(i)<'9') {
//				int n=s.charAt(i)-48;
				sum=sum*10+n;
			}
			else {
				Tsum=Tsum+sum;
				sum=0;
			}
		}
		System.out.println(Tsum+sum);
	}
}
