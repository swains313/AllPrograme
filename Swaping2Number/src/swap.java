
public class swap {
	
	public static void main(String args[]) {
		
		int a =10;
		int b = 20;
		System.out.println("Before swaping value of a& b respectively..  "+a+" " +b);
		
		//Logic -1 -->  Using Third variable
		int t=a;
		a=b;
		b=t;
		
		System.out.println("Ater swaping value of a& b are respectively..  " +a+ " " +b);
		
		//Logic-2 --> Using+  & - without using third variable
		a=a+b; //20+10=30
		b=a-b; //30-10=20
		a=a-b; //30-20=10
		System.out.println("After swapping value of a & b respectively "+a+ " " +b );
		
		//Logic-3 --> Using*  & - without using third variable
		//here a & b value should not be zero
		a=a*b; //10*20=200
		b=a/b; //200/20=10
		a=a/b; //200/10=20
		System.out.println("After swappimg value a & b are respectively.. " +a+" " +b);
		
		//Logic-4 -->bitwise operator XOR(^)
		a=a^b; //20^10=30
		b=a^b; //30^10=20
		a=a^b; //30^20=10
		System.out.println("After swapping value of a & b are respectively.. "+a+ " " +b);
		
		//Logic-5 -->Single statement
		//a=10 b=20
		b=a+b-(a=b);
		System.out.println("After swapping value a & b are respectively "+a+ " " +b);
	}

}
