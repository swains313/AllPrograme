import java.util.Scanner;
public class FindLargestNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1,num2,num3,largestnumber;
		System.out.println("Enter the first number");
		num1=scan.nextInt();
		System.out.println("Enter the second number");
		num2 = scan.nextInt();
		System.out.println("Enter the third number");
		num3=scan.nextInt();
		
		
		if(num1 > num2 && num1 > num3) /*temp = num1>num2 ? num1:num2;
                                        *result = num3>temp ? num3:temp;
                                        *System.out.println("Largest Number is:"+result);*/
		System.out.println(num1+" is a largest numer");
		else if(num2 > num3 && num2 > num1 )
			System.out.println(num2+ " is a largest number");
		else
			System.out.println(num3+" is a largest number");
		
		
		
	}
	

}
