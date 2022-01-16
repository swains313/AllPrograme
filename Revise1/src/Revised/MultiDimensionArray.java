package Revised;

import java.util.Scanner;


public class MultiDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter dimension");
		int row=scan.nextInt();
		int column=scan.nextInt();
		
		int a[][]=new int[row][column];
		int b[][]=new int[row][column];
		
		System.out.println("Enter he array a");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				a[i][j]=scan.nextInt();
			}
		}
		System.out.println("Enter the array of b");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				b[i][j]=scan.nextInt();		
			}
		}
		System.out.println("Result");
		int c[][]=new int[row][column];
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
		}
		System.out.println();

	}

}
