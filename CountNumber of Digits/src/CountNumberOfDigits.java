import java.util.Scanner;
public class CountNumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int count=0,n;
		System.out.println("Enter the number");
        n=scan.nextInt();
		while (n != 0) {/*  	               * */
			n /=10;
			++count;
		}
		System.out.println("Number of digits " +count);
		

	}

}
