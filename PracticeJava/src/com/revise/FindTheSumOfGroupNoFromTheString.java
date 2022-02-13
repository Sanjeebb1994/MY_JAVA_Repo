package com.revise;

public class FindTheSumOfGroupNoFromTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="sa123nj456ee990b";
		int sum=0,temp=0;
		System.out.print("The givenString is: "+str);
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='0'&&str.charAt(i)<='9') {
				int num=str.charAt(i)-48;
				sum=sum*10+num;
			}else {
				temp=temp+sum;
				sum=0;
			}
		}
		System.out.println();
		System.out.println("The sum group of Number Present in the String is: "+temp);
	}

}
