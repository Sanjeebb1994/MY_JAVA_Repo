package com.revise;

public class Separate_No_Alp_SpeC_FromAGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String email="Sanjeeb2050@gmail.com";
		String al="";
		String num="";
		String spC="";
		for(int i=0;i<email.length();i++) {
			if(email.charAt(i)>='a'&&email.charAt(i)<='z'||email.charAt(i)>='A'&&email.charAt(i)<='Z') {
				al=al+email.charAt(i);
			}
			else if(email.charAt(i)>='0'&&email.charAt(i)<='9') {
				num=num+email.charAt(i);
			}else {
				spC=spC+email.charAt(i);
			}
		}
		System.out.println("The Given String is ==> "+email);
		System.out.println("Alphabets Present in the Given String are ==> "+al);
		System.out.println("The Num Present in the Given String are ==> "+num);
		System.out.println("The Special Char. Present in the Given String are ==> "+spC);
	}

}
