package LeetCodeImportantInterviewQus;

import java.util.Arrays;

public class LongestCommonPrefix_14prog {
public static void main(String[] args) {
 String[] s = {"flower","flow","flight"};
 String[] s1 = {"dog","recoder","car"};// in this case we get empty
 String[] s3 = {"clue","club","cluon"};
			//Output: "fl"
 System.out.println(getLongestCommonPrefix(s));
 System.out.println(getLongestCommonPrefix(s1));
 System.out.println(getLongestCommonPrefix(s3));
	
}
public static String getLongestCommonPrefix(String[] s) {
	StringBuilder result = new  StringBuilder();
	//first we sort Array so it will arrange proper like flight,flow,flower
	Arrays.sort(s);
	
	//now we get the first and last string
	char[] first = s[0].toCharArray(); //flight
	char[] last = s[s.length-1].toCharArray();//flower
	
	//start comparing
	for(int i=0;i<first.length;i++) {
		if(first[i]!=last[i]) // f !=f false append in result 
			break;
		result.append(first[i]);
	}
	
	return result.toString();
	
}

}
