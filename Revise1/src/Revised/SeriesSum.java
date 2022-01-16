package Revised;

import java.util.Scanner;

public class SeriesSum {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scan.nextInt();
		
		float result=0;
		for(float i=1;i<n;i++) {
			result +=1/i;
			
		}
		System.out.println(" "+result);
	}

}
