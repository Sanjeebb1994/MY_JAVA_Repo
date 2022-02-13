package javaBasicProgram;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=2,count=0;
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println(a+" is a Prime No....");
		}else {
			System.out.println(a+" is not a Prime No!!!!");
		}
	}

}
