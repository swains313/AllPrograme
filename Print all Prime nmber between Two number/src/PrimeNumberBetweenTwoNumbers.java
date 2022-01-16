import java.util.Scanner;
public class PrimeNumberBetweenTwoNumbers {
	
	public static void main(String args[]) {
		
		Scanner scan=new Scanner(System.in);
		int n1,n2,flag = 0, i,j;
		System.out.println("Enter the first number");
		n1=scan.nextInt();
		
		System.out.println("Enter the second number");
		n2=scan.nextInt();
		
		System.out.printf("Prime numbers beetween are " );
		
		int x =0;
		for(i=n1;i<=n2;i++)
		{
			for(j = 2; j< i; j++)
			{
				if(i % j == 0)
				{
					flag=0;
					break;
				}else {
					flag = 1;
				}
			}
			if ( flag == 1) {
				x++;
				System.out.println(i +" ");
			}
		}
		System.out.println("Total number of prime numbers between " +n1+" and " +n2+ " are " +x);
		}
}