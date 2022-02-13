package javaBasicProgram;

public class StrongNumber {
	
	public static void main(String[] args) {
		
		int num=145, sum=1, rem=0;
		int temp=num, ans=0;
		while(temp>0) {
			sum=1;
			rem=temp%10;
			for(int i=rem;i>=1;i--) {
				sum=sum*i;
			}
			temp=temp/10;
			ans=ans+sum;
		}
		if(ans==num) {
			System.out.println(num+" is a Strong Number");
		}else {
			System.out.println(num+" is not a Strong Number");
		}
	}
}
