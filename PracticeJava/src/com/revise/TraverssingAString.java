package com.revise;

public class TraverssingAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Well Come To India";
		String []rev=str.split(" ");
		System.out.println("The Given String is: "+str);
		for(int i=rev.length-1;i>=0;i--) {
			System.out.print(rev[i]+" ");
		}
	}

}
