import java.util.Scanner;
public class ReverseNumber {
	
	public static void main(String args[]) {
		
		Scanner scan=new Scanner(System.in);
		int n,remainder,reverse=0;
		System.out.println("Enter the number");
		n=scan.nextInt();
		while(n != 0) {
			remainder = n % 10;
			reverse = reverse * 10 + remainder;
			n = n/10;
		}
		System.out.println("Reverse num  is "+reverse);
	}

}
