package numbersprogramme;

public class VowelsProgram {
	public static void main(String[] args) {
		
		String name="Sanjeeb";
		name=name.toLowerCase();
		String vowel="aeiou";
		for(int i=0;i<vowel.length();i++) {
			char ch1=vowel.charAt(i);
			int count=0;
			for(int j=0;j<name.length();j++) {
				char ch2=name.charAt(j);
				if(ch1==ch2) {
					count++;
				}
			}
			if(count>0) {
				System.out.println(ch1+" Present==> "+count+" Times.");
			}
		}
	}
}
