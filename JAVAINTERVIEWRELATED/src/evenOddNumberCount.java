import java.util.Scanner;
public class evenOddNumberCount {
	
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		long num;
		System.out.println("Enter the number");
		num = scan.nextLong();
		long even_count=0;
		long odd_count=0;
		while(num>0)
		{
			long rem=num%10;
			
			if(rem%2==0)
			{
				even_count++;
			}
			else
			{
				odd_count++;
			}
			num=num/10;
		}
		System.out.println("Number of even_count: "+even_count);
		System.out.println("Number of odd_count: "+odd_count);
		
	}
	

}
