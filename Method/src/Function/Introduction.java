package Function;

public class Introduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int firstNumber = 345;
		int secondNumber=890;
		
		int result=maxOf(firstNumber,secondNumber);
		maxOf(100, 200);

		
		System.out.println(result);
		
		sayHi();
		sayHi();
		

	}
	
	
	static int maxOf(int a, int b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}	
	}
	static void sayHi() {
		System.out.println("hii");
		System.out.println("Good morning");
	}

}
