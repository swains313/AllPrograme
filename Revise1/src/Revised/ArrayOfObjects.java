package Revised;

class student
 {
	 int roll_no;
	String name;
	student(int roll_no,String name){
		this.roll_no=roll_no;
		this.name=name;
	}
	}

 public class ArrayOfObjects{
	 public static void main(String args[]) {
		 
		 student[] arr=new student[5];
		 arr[0]=new student (1,"aman");
		 arr[1]=new student (2,"aman");
		 arr[2]=new student (3,"aman");
		 arr[3]=new student (4,"aman");
		 arr[4]=new student (5,"aman");
		 
		 for(int i=0;i<arr.length;i++) 
			 System.out.println("Element at "+i+" ; "+arr[i].roll_no+" " +arr[i].name);
		 
		 
		 
	 }
	
}


