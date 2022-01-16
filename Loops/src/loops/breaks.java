package loops;
import java.util.Scanner;

public class breaks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		for(int i=0;i<=n;i++) {
			if(i==40) {
				break;
			}
			System.out.println(i);
		}
		

	}

}
