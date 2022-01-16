
public class Nesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int  num1=34;
		int num2=56;
		int num3=6;
		int result=0;
		if(num1>num2 ) {
			if(num1>num3) {
				result =num1;
			}
			else {
				result = num3;
			}
			
			
			
		
		}
		else {
			if(num2>num3) {
				result = num2;
			}
			else {
				result =num3;
			}
		}
		System.out.println("Lrgest of the three number is "+result);
		
		//TERNARY OPERATOR
		//result = num1>num2 ? num1>num3? num1:num3:num2>num3?num2:num3;
		
				

	}

}
