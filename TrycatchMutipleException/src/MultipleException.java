
public class MultipleException {
	
	public static void main(String args[]) {
		System.out.println("Program starts");
		int[] myArray = {3,45,8,10};
		try {
			int result =myArray[1]/0;
		}catch(ArrayIndexOutOfBoundsException|ArithmeticException exception) {
			System.out.println(exception);
		}finally {
			System.out.println("The finallly block always executed");
		}
		System.out.println("Program ends");
	}

}
