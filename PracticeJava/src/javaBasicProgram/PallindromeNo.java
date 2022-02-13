package javaBasicProgram;

public class PallindromeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=131, rem=0, sum=0;
		int temp=num;
		while(temp>0) {
			rem=temp%10;
			sum=sum*10+rem;
			temp=temp/10;
		}
		if(num==sum) {
			System.out.println(num+" is a Pallindrome No.");
		}else {
			System.out.println(num+" is not a Pallindrome No.");
		}
	}

}
