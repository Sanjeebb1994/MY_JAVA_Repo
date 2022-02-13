package com.revise;

public class Remove_Duplicate_Word_From_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Men will be Men";
		str=str.toLowerCase();
		String [] output=str.split(" ");
//		String remove=" ";
		for(int i=0;i<output.length;i++) {
			int count=0;
			for(int j=0;j<output.length;j++) {
				if(output[i].equals(output[j])&&i>j) {
					break;
				}
				if(output[i].equals(output[j])) {
					count++;
				}
			}
			if(count==1) {
				System.out.println("The String Without Duplicate is: "+output[i]);
//				remove=output[i].toString();
			}  
		}
//		System.out.println("The given String is: "+str);
//		System.out.println("The String Without Duplicate is: "+remove);
	}

}
