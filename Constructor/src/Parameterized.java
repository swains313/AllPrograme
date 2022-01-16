
class Vehicless {
	
	int wheels;
	
	
	Vehicless(int noOfWheels){
		
		wheels=noOfWheels;
	}
	
}

public class Parameterized {
	
	
	
	
//	Parameterized() {
//		System.out.println("object is now created");
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	MyConstructor obj=new MyConstructor();
	Vehicless car=new Vehicless(5);	
		
	System.out.println(car.wheels);
	

	}

}
