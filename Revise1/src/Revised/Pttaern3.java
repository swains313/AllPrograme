package Revised;

import java.util.Scanner;

public class Pttaern3 {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=scan.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i-1;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=n-i+1;j++) {
				System.out.print("* ");
			}
			System.out.println( );
		}
	}

}
