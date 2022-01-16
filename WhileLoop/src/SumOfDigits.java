import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int temp=n;
		int sum=0;
		
		while(temp > 0) {
			int lastDigit= temp%10;
			temp/=10;
			
			sum+=lastDigit;
			
			System.out.println(+lastDigit+" "+temp+ " "+sum);
			
		}
		System.out.println("The sum of digits of "+sum);

	}

}
