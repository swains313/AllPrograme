import java.util.Scanner;
public class PalindromeNumber {
	
	public static void main(String args[]) {
		
		Scanner scan=new Scanner(System.in);
		
		int r,sum=0,temp;
		
		
		System.out.println("Enter a number");
		int num=scan.nextInt();
		temp = num;
		while(num>0) {
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		if(temp==sum) 
			System.out.println("Palindrome number");
		
		else 
			System.out.println("Not a palindrome number");
		
	}

}
