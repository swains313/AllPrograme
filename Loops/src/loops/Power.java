package loops;
import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int a=scan.nextInt();
		int b=scan.nextInt();
		
		int result=1;
		
		for(int i=0;i<b;i++) {
			result *=a;
		}
		System.out.println(result);
		

	}

}
