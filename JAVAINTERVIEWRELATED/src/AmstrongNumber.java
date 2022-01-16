import java.util.Scanner;
public class AmstrongNumber {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		int check, rem, sum= 0;
		System.out.println("Enter the number");
		num=scan.nextInt();
		check = num;
		while(check !=0) {
			rem = check % 10;
			sum = sum + (rem * rem * rem);
			check = check / 10;
		}
		if(sum == num)
			System.out.println("amstrong");
		else
			System.out.println("not an amstrong");
	}

}
