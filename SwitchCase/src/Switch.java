import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner (System.in);
		char ch;
		System.out.println("Enter a character");
		ch=scan.next().charAt(0);
		switch(ch){
		case'a':
		case'e':
		case'i':
		case'o':
		case'u':
			System.out.println(ch+" It is vowel");
			break;
		
		default:
			System.out.println(ch+" It is consonant");
			break;
		}
	}

}
