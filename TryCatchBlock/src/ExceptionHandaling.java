
public class ExceptionHandaling {
	
	public static void main(String args[]) {
		System.out.println("Program starts");
		int[] myArray = {2,3,5,1};
		try {
			System.out.println(myArray[4]);
		}catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println(exception);
			
		}finally {
			System.out.println("The finally block always executed");
		}
		System.out.println("Program ends");
	}

}
