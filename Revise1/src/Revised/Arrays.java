package Revised;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] cars= {"bmw","benz","ford","rangerover","fortuner"};
		
		System.out.println(cars[4]);
		//ChaneAnArrayElement
		cars[0]="tesla";
		System.out.println(cars[0]);
		System.out.println(cars.length);
//		for(int i=0;i<=cars.length;i++) {
//			System.out.println(cars[i]);
//			
//			
//		}
//		for(String j :cars) {
//			System.out.println(j);
//			
//			
//		}
//		
		int myNumbers[][]= {{1,2,3,4,},{5,6,7,8}};
		System.out.println(myNumbers[0][1]);
		for(int i=0;i<myNumbers.length;i++) {
			for(int j=0;j<myNumbers[i].length;j++) {
				System.out.println(myNumbers[i][j]);
			}
			
		}
}
}

	
