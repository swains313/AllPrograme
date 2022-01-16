package Revised;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
//		System.out.println("Enter the number");
//		
//	int num=scan.nextInt();
		
		
		
		int a[]= {2,3,4,5,5,666};
		int n=a.length;
		
		
	
		
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1;j++) {
				if(a[j+1]<a[j]) {
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(int item:a) {
			System.out.println(item+"  ");
		}

	}
	

}
