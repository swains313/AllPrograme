package whileforconvert;

public class Convert {
	
	public static void main(String args[]) {
	//FOR LOOP	
		//int i,j;
		//for(i=1;i<=4;i++)
		{
			//for(j=1;j<=i;++j)
			///{
			//	System.out.println(i);
			//}
			//System.out.println();
	//	}
				
				//WHILE LOOP
				int i=1,j;
				while(i<=4) {
					j=1;
					while(j<=i)
					{
						System.out.println(j);
						++j;
					}i++;
					System.out.println();
				}
	}

}
}