package Arrays;

public class CloneArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intArray[]= {1,2,3};
		
		int cloneArray[] = intArray.clone();
		
		System.out.println(intArray==cloneArray);
		for(int i=0;i<cloneArray.length;i++) {
			System.out.println(cloneArray[i]+" ");
		}

	}

}
