package com.array;

public class TraverSingOfAString {
	
	public static void main(String[] args) {
		String str="wellcome to india";
		String[] strarray = str.split(" ");
		for(int i=strarray.length-1;i>=0;i--)
		{
			System.out.print(strarray[i]+" ");
		}

	}

}
