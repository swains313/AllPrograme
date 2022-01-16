package ObjectOrientedProgrammingSystem;



class Cat{
	boolean hasFur;
	String color,bread;
	int leg,eyes;
	public void walk(){
		System.out.println("Cat is walking");
	}
	
	public void eat() {
		System.out.println("Cat is eating");
	}
	public void description() {
		System.out.println("my cat is "+leg+" leg nad "+eyes+" eyes");
		
	}
} 

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat Cat1 = new Cat();
		Cat Cat2 = new Cat();
		
		
 		Cat1.walk();
		Cat2.eat();
		
		Cat1.leg=4;
		Cat1.eyes=2;
		
		Cat1.description();
		Cat2.description();
		

	}

}
