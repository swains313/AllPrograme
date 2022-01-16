package Arrays;

public class ex {
	public static void main(String args[]) {
		
				int[][][] arr = { { { 1, 2 ,8}, { 3, 4,7 } } ,{{ 5, 6,90 }, { 7, 8,80 }},{{2,4,5} ,{4,6,7} }};
 

				for (int i = 0; i <arr.length; i++)
					for (int j = 0; j <arr[i].length; j++)
						
						for (int z = 0; z <arr[i][j].length; z++)
							System.out.println("arr[" + i
											+ "]["
											+ j + "]["
											+ z + "] = "
											+ arr[i][j][z]);
			
		


		
	}

}
