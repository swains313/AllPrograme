import java.util.Scanner;
public class Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		int marks;
		System.out.println("Enter the mark");
		marks=scan.nextInt();
		
		//USING TERNARY OPERATOR
		String result = (marks >= 30)?"pass":"fail";
		System.out.println("You " +result+ " in the exam");

	}

}
