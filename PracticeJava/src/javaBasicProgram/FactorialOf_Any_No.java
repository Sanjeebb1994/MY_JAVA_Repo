package javaBasicProgram;

public class FactorialOf_Any_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=0, sum=1;
		int temp=num;
		for(int i=temp;i>=1;i--) {
			sum=sum*i;
			System.out.println(sum);
		}
		System.out.println("The Factorial of Number "+num+" is: "+sum);
	}

}
