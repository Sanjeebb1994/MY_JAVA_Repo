package com.revise;

public class Count_The_OccurenceOf_Word_FromThe_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Men Will Be Men";
		str=str.toLowerCase();
		System.out.println("The given String is: "+str);
		String []output=str.split(" ");
		for(int i=0;i<output.length;i++) {
			int count=0;
			for(int j=0;j<output.length;j++) {
				if(output [i].equals(output [j])&&i>j) {
					break;
				}
				if(output [i].equals(output [j])) {
					count++;
				}
			}
			System.out.println();
			if(count>0) {
				System.out.println(output [i]+" ==> Present "+count+" Times.");
			}
		}
	}

}
