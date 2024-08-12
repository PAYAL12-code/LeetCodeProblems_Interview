package LeetCodeImportantInterviewQus;

import java.util.Arrays;

public class LengthOfLastWord_58program {
public static void main(String[] args) {
	String s = "Hello World";
	String s2 = "java is proper";
			//Output: 5
			//Explanation: The last word is "World" with length 5.
	
	
	
	System.out.println(getLen(s));
	System.out.println(getLen(s2));
}
public static int getLen(String s) {
	String[] s1 = s.split(" ");
	int len=0;
	for(int i = s1.length-1;i>=0;i--) {
		 len = s1[i].length();
           break;
	}
	return len;
}

}
