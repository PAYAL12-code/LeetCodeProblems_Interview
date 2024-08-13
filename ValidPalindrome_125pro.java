package LeetCodeImportantInterviewQus;

public class ValidPalindrome_125pro {
public static void main(String[] args) {
	String s = "A man, a plan, a canal: Panama";
			//Output: true
			//Explanation: "amanaplanacanalpanama" is a palindrome.
		

			String s1 = "race a car";
			String s2="";
			//Output: false
			//Explanation: "raceacar" is not a palindrome.
			System.out.println(getPalidrom(s));
			System.out.println(getPalidrom(s1));
			System.out.println(getPalidrom(s2));
}
public static boolean getPalidrom(String s) {
	
	String val = "";
	StringBuilder s1;
	
	for(int i=0;i<s.length();i++) {
		if(s.isEmpty())
			return true;
		if(s.charAt(i)!=' ' && s.charAt(i)!='.' && s.charAt(i)!=':' && s.charAt(i)!=',')
		{
			val = val+s.charAt(i);
			
		}
		
	}
	String palidrom=val.toLowerCase();
	String reverse = new StringBuilder(palidrom).reverse().toString();
	System.out.println(reverse);
	if(palidrom.equals(reverse)) {
		return true;
	}
	
	return false;
}

}
