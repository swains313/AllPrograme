import java.util.Scanner;
import java.math.BigInteger;

public class FactorialNumber {

	
	
	public static void main(String[] args) {
	    int num;
	    BigInteger fact = BigInteger.valueOf(1);
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter a number: ");
	    num = scan.nextInt();
	    for (int i = 2; i <= num; i++){
	        fact = fact.multiply(BigInteger.valueOf(i));
	    }
	    System.out.println(fact);
	}
}





