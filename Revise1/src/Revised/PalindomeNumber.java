package Revised;

import java.util.Scanner;

public class PalindomeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("Enter the number");
		int n=scan.nextInt();
		int temp=n;
		int reverseNumber=0;
		while(temp>0) {
			int lastDigit=temp%10;
			
			reverseNumber =reverseNumber*10+lastDigit;
			
			temp/=10;
		}
		if(reverseNumber==n) {
			System.out.println(n+" Is a palindrome number");
		}else {
			System.out.println(n+" Is not a palindrome number");
		}

	}

}
