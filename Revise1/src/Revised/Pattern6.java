package Revised;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=scan.nextInt();
		int number=1;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
				
				
			}
			for(int j=1;j<=i;j++) {
				System.out.print(number+"  ");
				number++;
			}
			System.out.println();
		}

	}

}
