package Revised;

import java.util.Random;
import java.util.Scanner;

public class InsertingMultidArrayDuringRunTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int totalTestCasr,eachTestCasrValues;
		
		totalTestCasr=scan.nextInt();
		
		int arrayMain[][]=new int[totalTestCasr][];
		
		
		for(int i=0;i<arrayMain.length;i++) {
			eachTestCasrValues=scan.nextInt();
			arrayMain[i]=new int[eachTestCasrValues];
			for(int j=0;j<arrayMain[i].length;j++) {
				arrayMain[i][j]=scan.nextInt();
			}
		}
		
		for(int i=0;i<arrayMain.length;i++) {
			int nEvenNumber=0,nOddNumber=0;
			
			System.out.println("Testcase "+i+" with "+arrayMain[i].length+" values: ");
			for(int j=0;j<arrayMain[i].length;j++) {
				System.out.println(arrayMain[i][j]+" ");
				
				if(arrayMain[i][j]%2==0) {nEvenNumber++;}
				else {nOddNumber++;}
			}
			System.out.println();
			System.out.println("Total even Number "+nEvenNumber+" Tota odd number "+nOddNumber);
		}
		

	}

}
