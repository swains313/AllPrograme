package StringIntroduction;

public class FunctionInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="saumya";
		String cars="bmw,benz,suzuki,ferrari,rangerover,ford";
		String allCars[]=cars.split(",");
		String name2=new String("saumya");
		System.out.println(name.charAt(0));
		System.out.println(name.length());
		System.out.println(name.substring(2));
		System.out.println(name.substring(2, 4));
		System.out.println(name.contains("z"));
		System.out.println(name.equals(name2));
		System.out.println(name.isEmpty());
		System.out.println(name.concat("ranjan"));
		System.out.println(name.replace("saumya", "apple"));
		System.out.println(name.indexOf("u"));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name);
		System.out.println(name.trim());
		
		for(String car:allCars) {
			System.out.print(car+" ");

		}
				
	}

}
