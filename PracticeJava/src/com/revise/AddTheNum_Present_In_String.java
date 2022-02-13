package com.revise;

public class AddTheNum_Present_In_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="S12a45n03j23e32b00";
		int sum=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='0'&&str.charAt(i)<='9') {
				sum=sum+(str.charAt(i)-48);
			}
		}
		System.out.println("The given String is: "+str);
		System.out.println("The Sum of Number Present in String is: "+sum);
	}

}
