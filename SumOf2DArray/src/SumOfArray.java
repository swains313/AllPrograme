
public class SumOfArray {
	
	public static void main(String args[]) {
		int[][] myFirst2DArray = {
				{3,5,1,9},
				{10,15,3,0},
				{11,1,31,90},
				{2,51,1,9},
		};
		
		int sum=0;
		for(int row=0;row<myFirst2DArray.length;row++) {
			for(int column=0;column<myFirst2DArray[row].length;column++) {
				sum =sum+myFirst2DArray[row][column];
				
				System.out.println(myFirst2DArray[row][column]+ " ");
			}
			System.out.println();
		}
		System.out.println("Sum is: " +sum);
	}

}
