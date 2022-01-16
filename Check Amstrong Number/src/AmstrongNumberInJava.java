import java.util.Scanner;
public class AmstrongNumberInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("Enter the number");
		int num=scan.nextInt();
		
		int t1 = num;
		int length=0;
		while(t1!=0)
		{
			
			length = length + 1;
			t1 = t1/10;
		}
		int t2=num;
		int arm=0;
		int remainder;
		while(t2!=0)
		{
			int multipy=1;
			remainder=t2%10;
			for(int i=1;i<=length;i++)
			{
			 multipy=multipy*remainder;	
			}
			arm=arm+multipy;
			t2=t2/10;
		}
		if(arm==num)
		{
			System.out.println(num+" Is a amstrong number");
		}
		else {
			System.out.println(num+" Is not a amstrong");
		}
	}

}
