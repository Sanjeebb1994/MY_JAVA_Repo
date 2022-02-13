package com.array;

public class GetDuplicateFromString {
	public static void main(String[] args) {
		String str="Men will be men";
		String lower=str.toLowerCase();
		String [] remove=lower.split(" ");
		for(int i=0;i<remove.length;i++) {
			int count=0;
			for(int j=0;j<remove.length;j++) {
				if(remove[i].equals(remove[j])&&i>j) {
					break;
				}
				if(remove[i].equals(remove[j])) {
					count++;
				}
			}
			if(count==0) {
				System.out.println("The Duplicate word Present in "+str+" is----> "+remove[i]);
			}
		}
	}
}
