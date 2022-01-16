
class Vehicle {
	
	int wheels;
	int headLight;
	
	
	
	Vehicle(int Wheels){
		
		this.wheels=Wheels;
		headLight=2;
	}
	
	
	
}

public class ThisConstructor {



	
	
	
//	
//   ThisConstructor() {
//		System.out.println("object is now created");
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	MyConstructor obj=new MyConstructor();
	Vehicle car=new Vehicle(7);	
		
	System.out.println(car.wheels);
	

	}

}

