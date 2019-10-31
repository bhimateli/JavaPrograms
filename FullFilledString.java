/*
 * 
 * Exmaple abdaabcd -> abcd
 */
import java.util.HashSet;

public class FullFilledString {

	static HashSet<Character>set = new HashSet<Character>();

	/*
	 * how many chars in the string-non repeated. use set
	 */
	public static void noDuplicateChars(String str) {
		
		for(int i =0; i<=str.length()-1;i++) {
		set.add(str.charAt(i));
		}
		
		System.out.println("The non duplicate of characters are"+set);
	}
	
	/*
	 * Finding the substring - passing length of the set(non repeated chars)
	 */
	
	
	public static boolean findTheSubString(String str) {
		HashSet<Character> set2= new HashSet<Character>();
		System.out.println("First String to verify "+str);
		for(int i=0;i<=str.length()-1;i++) {
			
			set2.add(str.charAt(i));
		}
		if(set2.size() ==set.size() ) {
			
			System.out.println("Substring is "+str);
			return true;
			
		}else
			System.out.println("No sustring found");
		return  false;
	}
	
	public static void main(String[] args) {
		
		
		boolean flag=false;
		String str ="abcdefghijklmnopqrstuvwxyz" ;//"aabcba";//"aaaabcbcdbca";
		noDuplicateChars(str);
	
		/*
		 * pass substring which length is number of non repeated chars.
		 */
		for(int i =0;i<=str.length()-1;i++) {
			for(int j=i;j<str.length()-3;j++) {
			 flag=	findTheSubString(str.substring(j,j+set.size()));
			if(flag)
				break;
			}
			if(flag)
				break;
		}

	}

}

