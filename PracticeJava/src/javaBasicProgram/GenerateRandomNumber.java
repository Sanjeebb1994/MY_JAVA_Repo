package javaBasicProgram;

import java.util.Random;

public class GenerateRandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random ran=new Random();
		
		//For Integer.
		int x=ran.nextInt(10);
		int y=ran.nextInt(20);
		System.out.println(x);
		System.out.println(y);
		
		//For float
		float a=ran.nextFloat();
		System.out.println(a);
		
		//For Boolean
		boolean b=ran.nextBoolean();
		System.out.println(b);
		
		
	}

}
