import java.util.Scanner;
public class Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		char alphabet;
		System.out.println("Enter a character");
		alphabet=scan.next().charAt(0);
		String alpha=(alphabet >= 'a' && alphabet <='z') || (alphabet>='A' && alphabet <= 'z')?"alphabet": "not a alphabet";
		System.out.println(alphabet+ " is a " +alpha);

	}

}
