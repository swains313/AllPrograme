package Arrays;

public class DirectArrayDeclaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][][]arr = {{{1,2,13},{3,4,44}},{{5,6,77},{7,8,77}}};
		
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				for(int k=0;k<3;k++)
				
					
					System.out.println("arr ["+i+"] ["+j+ "]  ["+k+"]="+arr[i][j][k]);
				}
			}
		}

	}


