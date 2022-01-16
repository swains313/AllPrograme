package Function;



class Dog{
	int legs;

}


public class ExPassByReference {
	
	
	
	
	public static void main(String args[] ){
		
		
		
//		Dog c=new Dog();
//		c.legs=4;
//		Dog d=new Dog();
//		d.legs=3;
//		
		//swap(c,d);
		
		
		Dog a=new Dog();
		a.legs=4;
		chageDog(a);
		System.out.println(a.legs);
		//System.out.println(c.legs+" "+d.legs);
		
		
		
		
		
	}
//	static void swap(int a,int b) {
//		int temp=a;
//		a=b;
//		b=temp;
//		
//	}
	
	 static void swap(Dog a, Dog b) {
		Dog temp=a;
		a=b;
		b=temp;
	}
	static void chageDog(Dog dog) {
		dog.legs=6;
	}
	
	
	}
