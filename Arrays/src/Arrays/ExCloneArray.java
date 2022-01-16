package Arrays;

public class ExCloneArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intArray[][]= {{1,2,3},{1,2,3}};
		
		int cloneArray[][]=intArray.clone();
		
		System.out.println(intArray==cloneArray);
		
			
			System.out.println(intArray[0]==cloneArray[0]);
			
			System.out.println(intArray[1]==cloneArray[1]);
			

	}

}
