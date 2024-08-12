package LeetCodeImportantInterviewQus;

public class ReverseWordInAString_151program {
public static void main(String[] args) {
	String s = "the sky is blue";
			//Output: "blue is sky the"
	String s1 = "  hello world  ";
			//Output: "world hello"
			//Explanation: Your reversed string should not contain leading or trailing spaces.
	
	
	System.out.println(getReverse(s));// this is reverse but not remove space wich come fist and las
	System.out.println(getReverse2(s1)); // this will remove space 
}

public static String getReverse(String s) {
	String[] s1  = s.split(" +"); //+" mease any number of space
	StringBuilder result  = new StringBuilder();
	
	for(int i = s1.length-1;i>=0;i--){
	    result.append(s1[i]);
	    if(i!=0) {
	    	result.append(" ");
	    }else {
	    	result.append("");
	    }
	    	
	}
	
	return result.toString();
}

public static String getReverse2(String s) {
	String[] s1  = s.split(" +"); //+" mease any number of space
	StringBuilder result  = new StringBuilder();
	
	for(int i = s1.length-1;i>=0;i--){
	    result.append(s1[i]);
	   result.append(" ");
	    	
	}
	
	return result.toString().trim();
}

}
