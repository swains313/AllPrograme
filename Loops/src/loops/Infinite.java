package loops;
import java.util.Scanner;

public class Infinite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		for(;;) {
			
			int n=scan.nextInt();
			if(n<0) {
				break;
			}
		}

	}

}
