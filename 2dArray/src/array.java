
public class array {
	
	public static void main(String args[]) {
		int [][] myFirst2DArray = {
				{3,5,7,8},
				{5,6,8,2},
				{4,5,1,2},
		};
		for(int row=0;row<myFirst2DArray.length;row++) {
			for(int column=0;column<myFirst2DArray[row].length;column++) {
				System.out.println(myFirst2DArray[row][column] + " ");
			}
			System.out.println();
		}
	}

}
