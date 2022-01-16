package condition;

import java.util.Scanner;

public class Elif {
	
	public static void main(String args[]) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int number;
		System.out.println("Enter the number");
		number = scan.nextInt();
		
		if(number <= 10) {
			System.out.println("Number is less than 10");
		}
		
		else if(number<=10 && number<=20){
			System.out.println("Number is less than 20");	
		}
		else if(number <=20 && number <=30) {
			System.out.println("Number is less than 30");
		}
		else {
			System.out.println("Number is greater than 30");
			
		}
		scan.close();
		
		
	}
	
	

}

