import java.util.Scanner;
public class SwapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		float first,second;
		System.out.println("Enter the first number");
		first = scan.nextFloat();
		System.out.println("Enter the second number");
		second=scan.nextFloat();
		System.out.println("==Before Swap==");
		System.out.println("First Number " +first);
		System.out.println("Second Number " +second);
		float temporary = first;
		first = second;
		second = temporary;
		System.out.println("== After swap==");
		System.out.println("First Number " +first);
		System.out.println("Second Number " +second);

	}

}
