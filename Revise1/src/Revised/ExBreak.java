package Revised;

import java.util.Scanner;

public class ExBreak {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=scan.nextInt();
		
		for(int i=0;i<=n;i++) {
			if(i==50) {
				break;
			}
			System.out.println(i);
			
		}
		
	}

}
