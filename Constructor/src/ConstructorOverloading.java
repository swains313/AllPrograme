class Vehiclee {
	
	int wheels;
	int headLight;
	String color;
	
	
	Vehiclee(int Wheels){
		
		this.wheels=Wheels;
		headLight=2;
	}
	Vehiclee(int Wheels,String color){
		this.wheels=Wheels;
		this.color=color;
		headLight=2;
		
	}
	
	
}

public class ConstructorOverloading {
	
	
//	ConstructorOverloading() {
//		System.out.println("object is now created");
//	}

	public static void main(String[] args) {
		
		
	//	MyConstructor obj=new MyConstructor();
	//Vehiclee car=new Vehiclee(7);	
	
	Vehiclee eRikshaw =new Vehiclee(5, "yellow");
		
	System.out.println(+eRikshaw.wheels+ " wheels "+eRikshaw.color+" color");
	

	}

}





