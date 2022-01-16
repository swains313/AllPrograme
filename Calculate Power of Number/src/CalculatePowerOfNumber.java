import java.util.Scanner;
public class CalculatePowerOfNumber {
	
	public static void main(String args[]) {
		
		Scanner scan=new Scanner(System.in);
		int base,exponent;
		System.out.println("Enter the number");
		base=scan.nextInt();
		System.out.println("Enter the number");
		exponent=scan.nextInt();
		long result = 1;
		while (exponent !=0) {
			result *=base;
			--exponent;
		}
		System.out.println("Answer = " + result);
				}

}
