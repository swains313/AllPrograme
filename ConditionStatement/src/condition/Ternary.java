package condition;

import java.util.Scanner;


public class Ternary {
	
	public static void main(String args[]) {
		
		Scanner scan=new Scanner(System.in);
		int num1,num2,num3;
		System.out.println("Enter the first number");
		num1=scan.nextInt();
		System.out.println("Enter the second number");
		num2=scan.nextInt();
		System.out.println("Enter the third number");
		num3=scan.nextInt();
		int largest = (num1 >= num2) ? ((num1 >=num3) ? num1:num3 ):((num2 >= num3) ? num2:num3);
		System.out.println(largest );
		scan.close();
	}

}
