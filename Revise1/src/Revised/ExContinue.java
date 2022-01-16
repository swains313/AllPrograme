package Revised;

import java.util.Scanner;

public class ExContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int n=scan.nextInt();
		
		for(int i=0;i<n;i++) {
			if(i>40 && i<50) {
				continue;
			}
		System.out.println(i);
		}
		

	}

}
