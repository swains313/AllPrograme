import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String args[]) {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter a number");
	int num = scan.nextInt();
	
	//1.Using Algorthim
	int rev =0;
	while (num!=0) {
	rev=rev*10+num%10;
	num=num/10;
		
	}
	
	//2.Using StringBuffer Class
	/*StringBuffer sb=new StringBuffer(String.valueOf(num));
	StringBuffer rev=sb.reverse();*/
	
	
	//3. Using String Builder
	/*StringBuilder sbl = new StringBuilder();
	sbl.append(num);
	StringBuilder rev=sbl.reverse();*/
	
	
	System.out.println("Reverse number is "+rev);
	
	//3. Using StringBuilder
	
	
	
	}
}
