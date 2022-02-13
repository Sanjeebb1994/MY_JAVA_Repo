package com.array;

public class Pattern2Array {
	public static void main(String[] args) {
		int [] arr1= {1,2,0,0,4,0,3};
		int [] arr2= new int[arr1.length];
		
		int m=0;
		int n=arr1.length-1;
		
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]==0) {
				arr2[n]=arr1[i];
				n--;
			}else {
				arr2[m]=arr1[i];
				m++;
			}
		}
		for(int j=0;j<arr2.length;j++) {
			System.out.print(arr2[j]+" ");
			
		}
	}
}
