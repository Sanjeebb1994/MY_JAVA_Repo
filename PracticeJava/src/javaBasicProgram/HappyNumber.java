package javaBasicProgram;

public class HappyNumber {
	
	public static void main(String[] args) {
		int num=5, rem=0, sum=0;
		while(num!=1||num!=sum) {
			while(num>0) {
				rem=num%10;
				sum=sum+(rem*rem);
				num=num/10;
			}
			num=sum;
		}
		if(num==1) {
			System.out.println("Happy No.");
		}else {
			System.out.println("Not A happy No.");
		}
	}
}
