import java.util.Scanner;
public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int num,factorial=1;
		System.out.println("Enter the number");
		num=scan.nextInt();
		for(int i = 1; i <= num; ++i) {
						//for(int i =num;i<=1;i--)
			factorial *= i;
		}
		System.out.println("Factorial of " + num+ " is " +factorial);
		scan.close();

	}
	

}
