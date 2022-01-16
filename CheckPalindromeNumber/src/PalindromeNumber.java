import java.util.Scanner;
public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in) ;
		int num,reverseInteger = 0, remainder,originalInteger;
		System.out.println("Enter the number");
		num=scan.nextInt();
		
		originalInteger = num;
		
		//Using for loop
		/* for( ;num != 0; num /= 10 ){
		 * remainder = num % 10;
		 * reverseInteger = reverseInteger * 10 + remainder;} */
		
		
		//Using while loop
		while(num != 0) {    
	    remainder = num% 10; 
			reverseInteger= reverseInteger * 10 + remainder; 
			num /=10;
			
			
		}
		if(originalInteger == reverseInteger)
			System.out.println(originalInteger+ " Is a palindrome number");
		else
			System.out.println(originalInteger+" Is not a palindrome number");
		
			
		

	}

}
