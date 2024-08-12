package Interview;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FindSecondStringUsingJava8 {
	public static void main(String[] args) {
  String s = "java css sprintboot html";
  String[] words = s.split(" ");
  
  // Reverse the array of words
  StringBuilder reversedString = new StringBuilder();
  for (int i = words.length - 1; i >= 0; i--) {
      reversedString.append(words[i]);
      if (i != 0) {
          reversedString.append(" ");
      }
  }
   
   String newSt=reversedString.toString();

   System.out.println(newSt);
 List<String> s2 =  Arrays.stream(newSt.split(" " )).skip(1).limit(1).collect(Collectors.toList());
   System.out.println(s2);
   
   System.out.print(findSecondWord(s));
   
    
}
	
	//or
	public static String findSecondWord(String str) {
        // Split the string into words
        String[] words = str.split(" ");
        
        // Check if there are at least two words
        if (words.length < 3) {
            throw new IllegalArgumentException("The input string must contain at least three words.");
        }
        
        // Return the third word
        return words[2];
    }
	
}