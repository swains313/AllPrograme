package loops;
import java.util.Scanner;

public class SeriesSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		float result=0;
		for(float i =1;i<=n;i++) {
			result += 1/i;
		}
		System.out.println(result);

	}

}
