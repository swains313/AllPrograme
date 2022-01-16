package condition;
import java.util.Scanner;

public class Ifclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan =new Scanner(System.in);
		
		int age;
		System.out.println("Enter the age");
		age=scan.nextInt();
		
		if(age>=18) {
			System.out.println("You are eligible for vote");
			
		}
		else {
			System.out.println("You are not eligible for vote now");
		}
		

	}

}
