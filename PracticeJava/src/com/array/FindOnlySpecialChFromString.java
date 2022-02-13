package com.array;

public class FindOnlySpecialChFromString {

	public static void main(String[] args) {
		String str="abc12@x3";
		String al="";
		String num="";
		String sp="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='a'&&str.charAt(i)<='z'||str.charAt(i)>='A'&&str.charAt(i)<='Z') {
				al=al+str.charAt(i);
			}else if(str.charAt(i)>='0'&&str.charAt(i)<='9') {
				num=num+str.charAt(i);
			}else {
				sp=sp+str.charAt(i);
			}
		}
		System.out.println("The given String is: "+str);
		System.out.println("The cheracters present in the String are: "+ al);
		System.out.println("The numbers present in the String are: "+num);
		System.out.println("The SpecialCheracter present in the String are: "+sp);
	}

}
