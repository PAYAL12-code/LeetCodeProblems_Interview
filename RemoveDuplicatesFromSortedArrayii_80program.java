package LeetCodeImportantInterviewQus;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromSortedArrayii_80program {

	public static void main(String[] args) {
		int[] num= {1,1,1,2,2,2,3,3,0,0};//remove elemnt if thay came grate than 2 like 1 is came 3 time so remobve one 1 and only allow two dublicate elemnt in same array
		// print lenth of aaray after remove 3 time repeat elemnet
		System.out.println();
		System.out.println("after remove length is:"+getTwiceEle(num));
		
		
		
	}
	public static int getTwiceEle(int num[]) {
// we are not checking array starting 1, 2 element because twice is ok
		//but if  it come third time than remove
		//so we are checking if array index 3 elemnent is == than i-2 means on 0 index than dont print 
          int i=0;
       for(int n:num) {
    	   if(i<2 || n!=num[i-2]) {
    		   num[i++]=n;
    		   System.out.print(num[i]);
    	   }
       }
        	  
          
		return i++;
	}
}
	
	

