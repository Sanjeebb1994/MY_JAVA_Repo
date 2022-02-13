package com.revise;

public class RemoveDuplicate_FromGiven_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Mahabharat";
		str=str.toLowerCase();
		String remove="";
		System.out.print("The Given String is: "+str);
		for(int i=0;i<str.length();i++) {
			char ch1=str.charAt(i);
			int count=0;
			for(int j=0;j<str.length();j++) {
				char ch2=str.charAt(j);
				if(ch1==ch2&&i>j) {
					break;
				}
				if(ch1==ch2) {
					count++;
				}
			}
			if(count==1) {
				remove=remove+ch1;
			}
		}
		System.out.println();
		System.out.println("The String Without Duplicate is: "+remove);
	}

}
