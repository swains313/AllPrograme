package ObjectOrientedProgrammingSystem;


	
	class Dog{
		String breed,name;
		
		public void jump() {
			System.out.println("My "+name+" jumped "  );
		}
		public void descrition() {
			System.out.println(" my dog name  "+name + " breed is "+breed);
		}
	}
	public class DogsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog hussky=new Dog();
		Dog poodle=new Dog();
		
		hussky.breed="husky";
		hussky.name="browny";
		
		poodle.breed="poodle";
		poodle.name="seru";
		
		hussky.jump();
		hussky.descrition();
		
		poodle.jump();
		poodle.descrition();
		
		
		
			
		
		

	}

}
