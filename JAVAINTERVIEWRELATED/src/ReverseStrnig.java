import java.util.Scanner;
public class ReverseStrnig {
	
	public static void main(String args[]) {
		
		Scanner scan=new Scanner(System.in);
		
		
		String str;
		String rev = "";
		System.out.println("Enter a character");
		str = scan.nextLine();
		
		//1.Using ConCatination Operator
		
		//int len=str.length();
		
		//for(int i = len-1; i>=0;i--)
		//{
		//	 rev= rev+str.charAt(i);
		//}
		//System.out.println("Reversed String "+rev);
		
		//2. Using Character array
		//char a[] =str.toCharArray();
		//int len=a.length;
		//for(int i =len-1;i>=0;i--)
		//{
		//	rev=rev+a[i];
		//	System.out.println("Reversed String is : "+rev);
		//}
		
		//3.Using StringBufferClass
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
				
	}

}
