package com.array;

public class FindMax_ElementInArray {
	public static void main(String[] args) {
		int [] arr= {23,45,56,86,98,59,47,95};
		System.out.println("The Given Array is-->");
		for(int i:arr) {
			System.out.println(i);
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
		System.out.print("The Max.No of The Arr is-->");
		System.out.print(arr[arr.length-1]);
	}
}

                         //OR//
class FindMax_ElementInArray1{
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
			System.out.print("The Max.No of The Arr is-->");
			System.out.print(arr[arr.length-8]);
	}
}

