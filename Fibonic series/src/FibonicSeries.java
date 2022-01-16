import java.util.Scanner;
public class FibonicSeries {
	
	public static void main(String args[]) {
		
		Scanner scan=new Scanner(System.in);
		int n1,n2;
		System.out.println("Enter the two number");
		n1=scan.nextInt();
		n2=scan.nextInt();
		int c;
		for(int i=1;i<=10;i++) {
			c=n1+n2;
			System.out.print(" "+c);
			n1=n2;
			n2=c;
		}
		scan.close();
		
	}

}
