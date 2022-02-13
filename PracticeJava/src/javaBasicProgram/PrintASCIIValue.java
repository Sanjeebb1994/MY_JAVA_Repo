package javaBasicProgram;

public class PrintASCIIValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<=128;i++) {
			char ch=(char) i;
			System.out.println("ASCII value of "+i+" is: "+ch);
		}
	}

}
