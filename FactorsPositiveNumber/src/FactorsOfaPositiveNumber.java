import java.util.Scanner;
public class FactorsOfaPositiveNumber {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		int num;
		System.out.println("Enter the number");
		num=scan.nextInt();
		System.out.println("Factors of " + num + " are: ");
		//loop runs from 1 to 60
		for ( int i = 1;i<=num;++i) {
			//if number is divided by i
			// i is the factor
			if(num % i == 0) {
				System.out.print(i +" ");
			}
		}
	}

}
