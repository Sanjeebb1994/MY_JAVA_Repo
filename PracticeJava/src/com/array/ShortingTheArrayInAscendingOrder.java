package com.array;
//By Bubble Shorting Method.
public class ShortingTheArrayInAscendingOrder {
	public static void main(String[] args) {
		int [] arr= {2,1,6,7,9,4,5,3,8};
		System.out.println("Array before short-->");
		for(int i:arr) {
			System.out.println(i);
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("Array After Shorting--> ");
		System.out.println("--------------------------------");
		for(int j:arr) {
			System.out.println(j);
		}
	}
}
