public class StringNonRepeatingChar {

	public static void checkDuplicateChar() {
		
		String str = "YYCZDLLEE";
		int count=0;
		for(int i=0;i<=str.length()-1;i++) {
			count=0;
			for(int j=0;j<=str.length()-1;j++) {
				if(str.charAt(i) == str.charAt(j)) {
					count=count+1;
				
				}
				
				
			}
			if(count==1) {
				System.out.println("This is first no repeating char"+str.charAt(i));
				break;
			}
		}
		
	}
	
	public static void main(String[]args) {
		checkDuplicateChar();
	}
}

