package Arrays;

public class PassingArrayMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {1,5,6,8,3,9};
		
		sum(arr);

	}
	
	public static void sum(int[] arr){
		
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum +=arr[i];
			
		}
		System.out.println("Sum of array  values "+sum);
	}

}
