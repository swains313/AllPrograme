import java.util.Scanner;
public class PalindromeString {
	public static void main(String args[]) {
		
		Scanner scan  = new Scanner(System.in);
		System.out.println("Enter the string");
		String str=scan.next();
		String org_str=str;
		
		String rev = "";
		int len=str.length();
		
		for(int i = len-1;i>=0;i--) {
			rev= rev+str.charAt(i);
		}
		if(org_str.equals(rev))
		{
			System.out.println(org_str+" is palindrom string");
			
		}
		else
		{
			System.out.println(org_str+" is not a palindrome String ");
		}
	}

}
