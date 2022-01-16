package Arrays;

public class Ex0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[][] arr = new int[10][20];
//		//arr[0][0]=1;
//		arr[9][19]=34;
//		System.out.println("Arr[0][0] " +arr[9][19]);
		//class GFG {
		//	public static void main(String[] args)
		//	{

				int[][][] a = { { { 10, 20 }, {30, 40 },{70,80},{4,5} } };

				
				for(int i=0;i<a.length;i++) {
					for(int j=0;j<a[i].length;j++) {
						for(int k=0;k<a[i][j].length;k++) {
							System.out.println("arr"+i+" "+j+" "+k+" ="+a[i][j][k]);
						}
						System.out.println();
					}
				}
			
		            
		//	}
		//}

//		

	}

}
