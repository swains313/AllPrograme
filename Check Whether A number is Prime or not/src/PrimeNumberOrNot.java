import java.util.Scanner;
public class PrimeNumberOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		int num,temp = 0;
		System.out.println("Enter the number");
		num=scan.nextInt();
		for(int i = 2; i<= num-1;i++) {
			if(num % i == 0) {
				temp = temp+1;
			}
				
		}
		
		if(temp > 0) {
			System.out.println(num+" Is not a prime number");	
		}else
				System.out.println(num+ "is a prime number");
		

	}

}
