package Revised;

public class PassingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,1,2,5,4};
	//Passing array to method	
	//	sum(arr);

	//}
	//public static void sum(int[] arr) {
		
	int sum=0;
	
	for(int i=0;i<arr.length;i++) {
		sum+=arr[i];
		
	}
	System.out.println("Sum of array values "+sum);

	
}
}