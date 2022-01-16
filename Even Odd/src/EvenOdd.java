import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int  number;
		System.out.println("Enter a number");
		number =scan.nextInt();
		if(number % 2 == 0) {
			System.out.println(+number+" is a even number");
		}
		else {
		System.out.println(number+" is a odd number");
		}
	}

}
