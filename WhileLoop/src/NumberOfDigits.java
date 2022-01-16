import java.util.Scanner;
public class NumberOfDigits {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int numberOfDigits = (int)Math.log10(n)+1;
		System.out.println(numberOfDigits);
	}

}
