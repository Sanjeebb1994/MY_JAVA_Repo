package com.array;

public class RemoveDuplicateWord {

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
			if(count==1) {
				System.out.println(remove[i]+" present "+count+" Times.");
			}
		}
	}

}
