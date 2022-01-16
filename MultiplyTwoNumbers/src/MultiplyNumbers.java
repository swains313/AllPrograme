import  java.util.Scanner;
public class MultiplyNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		float first,second,result;
		System.out.println("Enter the first number");
		first=scan.nextFloat();
		System.out.println("Enter the second number");
		second=scan.nextFloat();
		result=first*second;
		System.out.println(+first+ " * " +second+ " = " +result);

	}

}
