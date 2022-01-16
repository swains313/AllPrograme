package Revised;

import java.util.Scanner;
public class FactorialNumber {
	public static void main (String args[]) {
		Scanner scan=new Scanner(System.in);
		
		int n,factorial=1;
		System.out.println("Enter the number");
		n=scan.nextInt();
		
		for(int i=1;i<=n;i++) {
			factorial *=i;
			System.out.println(" "+factorial );
		}
		
	}

}
