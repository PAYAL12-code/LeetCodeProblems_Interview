package LeetCodeImportantInterviewQus;

public class FindTheIndexOfTheFirstOccurrenceinString_28prog {
public static void main(String[] args) {
String haystack = "sadbutsad", needle = "sad";
			//Output: 0
			//Explanation: "sad" occurs at index 0 and 6.
			//The first occurrence is at index 0, so we return 0.
String haystack1= "leetcode", needle1 = "leeto";
//Output: -1
//Explanation: "leeto" did not occur in "leetcode", so we return -1.
System.out.println(getOccu(haystack,needle));

System.out.println(getOccu(haystack1,needle1));

}

public static int getOccu(String s1, String s2) {
	
	for(int i=0;i<s1.length()-s2.length()+1;i++) {
		  if(s1.charAt(i)==s2.charAt(0)) { // we check char s1 i is equle s2 o index 
			  if(s1.subSequence(i,s2.length()+i).equals(s2)) 
				  return i;
			  
		  }
	  }
	  
		return -1;
		
	
  
}

}
