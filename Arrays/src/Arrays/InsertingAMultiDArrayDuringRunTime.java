package Arrays;

import java.util.Scanner;

public class InsertingAMultiDArrayDuringRunTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int totalTestCase,eachTestCaseValues;
		
		totalTestCase=scan.nextInt();
		
		int [][] arrayMain=new int[totalTestCase][];
		
		for(int i=0;i<arrayMain.length;i++) {
			eachTestCaseValues=scan.nextInt();
			arrayMain[i] = new int[eachTestCaseValues];
			for(int j=0;j<arrayMain[i].length;j++) {
				arrayMain[i][j]=scan.nextInt();
			}
		}
		for(int i=0;i<arrayMain.length;i++) {
			int nEvenNumber=0,nOddNumber=0;
			System.out.println("Testcase "+i+" with "+arrayMain[i].length+" values  ");
			for(int j=0;j<arrayMain[i].length;j++) {
				System.out.println(arrayMain[i][j]+" ");
				if(arrayMain[i][j]%2==0) {nEvenNumber++;}
				else {nOddNumber++;}
			}
			System.out.println();
			System.out.println("Total even number: "+nEvenNumber +" Total odd number "+nOddNumber);
		}

	}


}
