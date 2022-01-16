import java.util.Scanner;
public class HowToUpdate {

	public static void main(String[] args) {
		double studentGPA = 4.56;
		System.out.println(" SAUMYA GPA " +studentGPA);
		
		//want to update
		System.out.println("What do you want to update it to");
		
		Scanner scan=new Scanner(System.in);
		studentGPA = scan.nextDouble();
		
		System.out.println("SAUMYA GPA " + studentGPA );
	}
}
