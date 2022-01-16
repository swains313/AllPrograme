
public class CallByValue {
	 static int sum (int a,int b) {
		return a+b;
	}
	public static void main(String args[]) {
		int x=2,y=3;
		int c = sum (x,y);
		System.out.println(" sum "+c);
		
	}

}
