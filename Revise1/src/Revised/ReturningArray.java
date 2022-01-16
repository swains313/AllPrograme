package Revised;

public class ReturningArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] =m1();
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		

	}
	
	public static int[] m1() {
		
		//Rturning array
		return new int[] {1,2,3};
	}

}
