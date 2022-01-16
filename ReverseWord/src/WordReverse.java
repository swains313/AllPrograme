
public class WordReverse {
	//public static void main(String args[]) {
	
      public void reverseWords(String s) {
		
		//s="hello";
		int i=s.length()-1;
		
		String ans=" ";
		
		while(i>=0) {
			
			while(i>=0 && s.charAt(i) == ' ') i--;
				int j=i;
				
				if(i<0)break;
				while(i>=0 && s.charAt(i)!= ' ')i--;
					
				if(ans.isEmpty()) {
					ans=ans.concat(s.substring(i+1, j+1));
				}else {
				   ans= ans.concat(" "+s.substring(i+1, j+1));
				}
				
			
		}
		//return ans;
		System.out.println(s);
		System.out.println(ans);
		
	//}
	}
      public static void main(String[] args) {
  		// TODO Auto-generated method stub
    	  WordReverse obj = new WordReverse();
    	  obj.reverseWords("hello sir");
  		

  	}

}
