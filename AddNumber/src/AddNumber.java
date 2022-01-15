import java.util.Scanner;
public class AddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		int num1,num2,result;
		System.out.println("Enter the first number");
		num1=scan.nextInt();
		System.out.println("Enter the second number");
		num2=scan.nextInt();
		result=num1+num2;
		System.out.println(+num1+ " + " +num2+" = " +result);
	}

}
