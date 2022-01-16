
public class CopyDemo {
	
	public static void main(String args[]) {
		
		char[] copyFrom = { 's','a','u','m','y','a',
				'r','a','n','j','a','n'};
		
		
		//EITHER THIS ONE
		char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2,9 );
		
		//EITHER THIS ONE(THESE 2 LINE))
		//char[] copyTo = new char[9];
		//System.arraycopy(copyFrom, 2, copyTo, 0, 9);
		
		
		System.out.println(new String(copyTo));
		}
	}


