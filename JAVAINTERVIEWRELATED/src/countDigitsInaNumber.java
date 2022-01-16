import java.util.Scanner;
public class countDigitsInaNumber {
	
	public static void main(String args[]) {
		
		Scanner scan=new Scanner(System.in);
		long num;
		System.out.println("Enter the number");
		num=scan.nextLong();
		long count=0;
		while(num>0)
		{
			num= num/10;
			count++;
			
		}
		System.out.println("Number of digits "+count);
	}

}
