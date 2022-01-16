import java.util.Scanner;
public class Atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int pin,cvv;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the pin number");
		pin=scan.nextInt();
		System.out.println("Enter the cvv");
		cvv=scan.nextInt();
		if((pin==4545) && (cvv==100)) {
			System.out.println("Transaction Done");
			System.out.println("Thank you");
		}
		else
			System.out.println("Enter the correct pin or cvv number ");
	}

}
