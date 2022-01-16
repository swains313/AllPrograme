import java.util.Scanner;
public class AsciiValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner scan=new Scanner(System.in);
	char ch ;
	
	System.out.println("Enter the character");
	ch = scan.next().charAt(0);
	int ascii = ch;
	int castAscii =  (int)ch;
	System.out.println("The ASCII value of " +ch + " is " +ascii);
	System.out.println("The ASCII value of " +ch + " is " +castAscii);
	

	}

}
