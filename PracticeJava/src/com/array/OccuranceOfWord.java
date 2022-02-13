package com.array;

public class OccuranceOfWord {
	public static void main(String[] args) {
		String str="We go to School";
		String lower=str.toLowerCase();
		String [] output=lower.split(" ");
		
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
			if(count>0) {
				System.out.println(output[i]+" present "+count+" Times.");
			}
		}
	}
}
