package com.array;

public class FindTheMin_NoOFArray {
	public static void main(String[] args) {
		int [] arr= {23,45,56,86,98,59,47,95};
		System.out.println("The Given Array is-->");
		for(int i:arr) {
			System.out.println(i);
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]>arr[i]) {
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		System.out.println("----------------------");
		System.out.println("The min.No of Array is---> "+arr[arr.length-1]);
	}
}
