import java.util.Scanner;
public class Ex1 {
	public static void main(String args[]) {
		
	Scanner scan=new Scanner(System.in);
	int a;
	System.out.println("Enetr the num");
	a=scan.nextInt();
	if(a%2==0)
		a/=2;
	else if(a%3==0)
		a/=3;
	if(a%5==0)
	a/=5;
	System.out.println(+a);
	
	
	}
}
