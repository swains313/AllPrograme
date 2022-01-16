import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num;
		System.out.println("Enter a number");
		num=scan.nextInt();
		String evenodd = (num % 2 == 0) ? "even"  : "odd";
		System.out.println(num+ " is " +evenodd);
 
	}

}
