package javaBasicProgram;

public class AmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=153, rem=0,sum=0;
		int temp=num;
		while(temp>0) {
			rem=temp%10;
			sum=(int) (sum+Math.pow(rem, 3));
			temp=temp/10;
		}
		if(num==sum) {
			System.out.println(num+" is a Amstrong Number.");
		}else {
			System.out.println(num+" is not a Amstrong Number!!!");
		}
	}

}
