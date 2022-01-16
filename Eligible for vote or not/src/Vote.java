import java.util.Scanner;
public class Vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your age");
		age=scan.nextInt();
		if(age >= 18) {
			System.out.println("You are now eligible for vote");
		}
			else {
				System.out.println("You are not eligible for vote");
			
		}
	}

}
