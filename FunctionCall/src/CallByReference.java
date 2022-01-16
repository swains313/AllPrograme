
public class CallByReference {
	static void abc (int[] a) {
		int t = a[0];
		a[0]  = a[1];
		a[1]  = t;
		
	}
	public static void main(String args[]) {
	int a[]= {10,20};
	abc (a);
	for(int i=0;i<=1;i++) {
	System.out.println(a[i]);	
	}
	
	}

}
