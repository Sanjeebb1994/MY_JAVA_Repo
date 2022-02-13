package com.array;

public class SumOfmin3NoofArray {
	public static void main(String[] args) {
		int sum=0;
		int [] arr= {2,1,6,7,9,4,5,3,8};
		System.out.println("Array before short-->");
		for(int i:arr) {
			System.out.println(i);
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=1;i<=3;i++) {
			int count=arr[arr.length-i];
			sum=sum+count;
		}
		System.out.println("The sum of Min.3 No. is---> "+sum);
	}

}
