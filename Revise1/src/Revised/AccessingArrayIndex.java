package Revised;

public class AccessingArrayIndex {
	public static void main(String args[]) {
		
		int arr[]=new int[5];
		
		arr[0]=5;
		arr[1]=2;
		arr[2]=53;
		arr[3]=54;
		//arr[5]=5;
		arr[4]=57;
		for(int i=0;i<arr.length;i++) {
			System.out.println(i);
		}
	}

}
