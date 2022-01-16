package question3;

public class Example {
	
	public static void main(String args[]) {
		
		int i=0,ua=0, ub=0, uc=0, fail=0;
		while(i<=5) {
			switch(i++)
			{
			case 1 :++ua;
			case 2 : ++ub;uc++;break;
			case 3 :
			case 4 : ++uc;ua++;ub++;break;
			default : ++fail;
			
			}
			
		}
	}
	

}
