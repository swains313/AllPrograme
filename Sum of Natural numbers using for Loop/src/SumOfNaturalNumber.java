import java.util.Scanner;
public class SumOfNaturalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int num,sum = 0;
		System.out.println("Enter the number");
		num = scan.nextInt();
		for(int i= 1; i<= num;++i) {
			sum += i;
			
		}
		System.out.println("Sum = " +sum);

	}

}
