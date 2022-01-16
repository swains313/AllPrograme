
public class Convert {
	
	public static void main(String args[]) {
		char ch='a';
		if(ch=='a') {
			
		}
			System.out.println("Account");
		
		 if((ch=='c')||(ch=='g'))
		System.out.println("Admin");
		if(ch=='f')
			System.out.println("Advisor");
		
		switch(ch) {
		case 'a' :
			System.out.println("Account");
			break;
		case 'c':
		case 'g':
			System.out.println("Admin");
			break;
		case 'f':
			System.out.println("Advisor");
			break;
			
		}
		
		
	}

}
