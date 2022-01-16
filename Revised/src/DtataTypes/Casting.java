package DtataTypes;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//Widening casting(automatically)
		int myInt =9;
		double myDouble=myInt;
		System.out.println(myInt);
		System.out.println(myDouble);
		
		//Narrowing casting(manually)
		double mDouble=9.67d;
		int mInt=(int)myDouble;
		System.out.println(mDouble);
		System.out.println(mInt);

	}

}
