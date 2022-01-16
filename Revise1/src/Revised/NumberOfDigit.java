package Revised;

import java.util.Scanner;

public class NumberOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=scan.nextInt();
		
		
	int NumberOfDigits=(int)Math.log10(n)+1;
	System.out.println(NumberOfDigits);

	}

}
