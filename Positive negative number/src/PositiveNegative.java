import java.util.Scanner;
public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int num;
		System.out.println("Enter a number");
		num=scan.nextInt();
		String positivenegative=(num > 0)?"positive":"negative";
		System.out.println(positivenegative);

	}

}
