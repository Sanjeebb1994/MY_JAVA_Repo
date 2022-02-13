package com.revise;

public class FindTheSumOf_Min_3No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={12,44,35,57,97,48,29,30};
		int sum=0;
		System.out.println("The Data Present in Array is: ");
		for(int data:arr) {
			System.out.print(data+" ");
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
		System.out.println();
		for(int i=1;i<=3;i++) {
			int count=arr[arr.length-i];
			sum=sum+count;
		}
		System.out.println("The Sum of 3 Min No is--> "+sum);
	}

}
