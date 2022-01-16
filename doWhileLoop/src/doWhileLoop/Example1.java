package doWhileLoop;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=1;
		do {
			n=scan.nextInt();
			System.out.println("number "+n);
		}while(n !=0);

	}

}
