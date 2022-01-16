package Function;



public class PassByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int c=56;
		int d=67;
//		
		swap(c, d);
		System.out.println(c+" "+d);

		
		
		
		
	}
	
	static void swap(int a,int b) {
		int temp=a;
		a=b;
		b=temp;
		
	}
	
	
	
	}

	




