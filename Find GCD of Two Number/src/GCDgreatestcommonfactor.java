import java.util.Scanner;
public class GCDgreatestcommonfactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n1,n2,gcd=1;
		System.out.println("Enter the first  umber");
		n1=scan.nextInt();
		System.out.println("Enter the second number");
		n2=scan.nextInt();
		for(int i = 1; i<= n1 && i<= n2; i++) {
			if(n1 % i == 0 && n2 % i ==0)
				gcd = i;
		}
		System.out.println("G.C.D of " +n1+ " and "+n2+" is "+gcd );

	}

}
