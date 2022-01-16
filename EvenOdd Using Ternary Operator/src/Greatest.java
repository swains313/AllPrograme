import java.util.Scanner;
public class Greatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		int n1,n2,n3;
		System.out.println("Enter the first number");
		n1=scan.nextInt();
		System.out.println("Enter the second number");
		n2=scan.nextInt();
		System.out.println("Enter the third number");
		n3=scan.nextInt();
		int largest =(n1 >= n2)?((n1>=n3)?n1:n3):((n2>=n3)?n2:n3);
		System.out.println("Largest number is "+largest);

	}

}
