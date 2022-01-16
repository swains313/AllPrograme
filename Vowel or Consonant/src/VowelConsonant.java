import java.util.Scanner;
public class VowelConsonant {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		char i;
		System.out.println("Enter a character");
		i = scan.next().charAt(0);
		String alphabet = ( i == 'a' || i == 'e'|| i == 'i' || i == 'o'|| i == 'u') ? "vowel" : "consonant";
		System.out.println(i+ " is " +alphabet);
		
	} 

}
