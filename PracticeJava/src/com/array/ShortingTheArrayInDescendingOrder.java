package com.array;

public class ShortingTheArrayInDescendingOrder {
	public static void main(String[] args) {
		int [] arr= {10,35,3,1,87,46,22,76,2};
		System.out.println("Array before Shorting ---->");
		for(int i:arr) {
			System.out.println(i);
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("------------------------------------------");
		System.out.println("Array after shorting--->");
		for(int j:arr) {
			System.out.println(j);
		}
	}
}
