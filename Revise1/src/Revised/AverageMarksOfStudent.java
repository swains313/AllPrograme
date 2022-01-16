package Revised;

import java.util.Scanner;

public class AverageMarksOfStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("Enter the number of students");
		int s=scan.nextInt();
		
		int marks[]=new int[s];
		
		System.out.println("Enter the marks");
		
		for(int i=0;i<s;i++) {
			marks[i]=scan.nextInt();
//			if(marks[i]>100) {
//				System.out.println(+marks[i]+"Enter The marks wrong plz type under 100 ");
//				continue;
//			}

			
		}
		int averageMarks=0;
		for(int i=0;i<s;i++) {
			averageMarks +=marks[i];
		}
			averageMarks /=s;
		System.out.println("The average marks are "+averageMarks);

	}

}
