package numbersprogramme;

public class Strong_NO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int num=145, rem=0,store=0;
		int temp=num;
		while(temp>0) {
			int sum=1;
			rem=temp%10;
			for(int i=rem;i>0;i--) {
				sum=sum*i;
			}
			store=store+sum;
			temp=temp/10;
		}
		if(num==store) {
			System.out.println(num+" is a Strong Number.");
		}else {
			System.out.println(num+" is not a Strong Number.");
		}
	}

}
