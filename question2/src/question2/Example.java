package question2;

public class Example {
	
	public static void main(String args[]) {
		float x=9;
		float y=5;
		int z=(int)(x/y);
		switch(z)
		{
		case 1:x=x+2;
		case 2:x=x+3;
		default:x=x+1;
		}
		System.out.println("value of x :" +x);
	}

}
