import java.util.Scanner;
public class QuotientandRemainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		int num1,num2,quotient,remainder;
		System.out.println("Enter the first number");
		num1=scan.nextInt();
		System.out.println("Enter the second number");
		num2=scan.nextInt();
		quotient=num1/num2;
		remainder=num1%num2;
		System.out.println("Quotient = " +quotient);
		System.out.println("Remainder = " +remainder);
		}

}
