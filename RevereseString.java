public class RevereseString {

	public static  void reverseString() {
		String str = "i.like.much";
		str = str.replace(".", ",");
		System.out.println("The reverse string is "+str);
		String [] strArray = str.split(",");
		String rev="";
		System.out.println("The reverse string is "+strArray[2]);
		
		for(int i =strArray.length-1;i>=0;i--) {
			rev = rev + strArray[i]+".";
			
		}
		System.out.println("The reverse string is "+rev);
	}
	
	
	public static void main(String[]args) {
		reverseString();
		
	}
}

