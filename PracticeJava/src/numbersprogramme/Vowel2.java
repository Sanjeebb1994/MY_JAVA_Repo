package numbersprogramme;

public class Vowel2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] name= {"Rakshitha", "Chat", "Zoom"};
		String value="";
		String vowel="aeiou";
		for(int i=0;i<name.length;i++) {
			value=name[i];
			int count=0;
			for(int j=0;j<value.length();j++) {
				char ch1=value.charAt(j);
				for(int k=0;k<vowel.length();k++) {
					char ch2=vowel.charAt(k);
					if(ch1==ch2) {
						count++;
					}
				}
			}
			if(count>0) {
				System.out.println(value+" ==> "+count);
			}
			
		}
	}

}
