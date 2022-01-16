import java.util.Scanner;
public class FindLCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n1,n2,lcm;
		System.out.println("Enetr the two number");
		n1=scan.nextInt();
		n2=scan.nextInt();
		lcm = (n1 > n2) ? n1 : n2;
		
		while(true) {
			if(lcm % n1 == 0 &&  lcm % n2 == 0) {
				System.out.println("The lcm of " +n1+ " and " +n2+ " is " +lcm);
				break;  
			}
			++lcm;
		}
		

	}

}
