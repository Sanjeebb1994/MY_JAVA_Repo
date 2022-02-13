package com.revise;

public class FindMaxLengthOfAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,44,35,57,97,48,29,30};
		System.out.println("The Data present in arraay is: ");
		for(int data:arr) {
			System.out.print(data+", ");
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[i]) {
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		System.out.println();
		System.out.print("The maximum length of array is: ");
		System.out.print(arr[arr.length-1]);
	}

}
