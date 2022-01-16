package Revised;

import java.util.Scanner;
public class FindX {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		
		int a=scan.nextInt();
		int b=scan.nextInt();
		
		int result=1;
		
		for(int i=0;i<b;i++) {
			result *=a;
			
		}
		System.out.println(" "+result);
	}

}
