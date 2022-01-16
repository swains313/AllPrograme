import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float  num1,num2,output;
		System.out.println("Enter the first number");
		num1=scan.nextFloat();
		System.out.println("Enter the operator(+,-,*,/,%)");
		char operator=scan.next().charAt(0);
		
		System.out.println("Enter the second number");
		num2=scan.nextFloat();
		switch(operator){
		case'+':
			output = num1+num2;
			break;
		case'-':
			output = num1-num2;
			break;
		case'*':
			output=num1*num2;
			break;
		case'/':
			output=num1/num2;
			break;
		case'%':
			output=num1%num2;
			break;
			default:
				System.out.println("Error! operator is not correct");
				return;
		}
		System.out.println(num1+ " " +operator+ " " +num2+  "  = "+output);
		

	}

}
