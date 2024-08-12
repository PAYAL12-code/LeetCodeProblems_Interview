package LeetCodeImportantInterviewQus;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MajorityElement_169Program {

	public static void main(String[] args) {
		int num[]= {3,2,3,2,2,2};	//give maximum number of elemnt availble in aaray
		
		System.out.print(majorityEle(num));
		
		
		System.out.println();
		
	Map<Integer,Long>  l1 =Arrays.stream(num).boxed()
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		 
	List l2= l1.entrySet().stream()
	.filter(x->x.getValue()==Collections.max(l1.values()))
	.collect(Collectors.toList());
	
	System.out.print(l2);
	
	}
	
	//or do with loop
	public static int majorityEle(int num[]) {
		
		for(int i=0;i<num.length;i++) {
			int count =1;
			for(int j=i+1;j<num.length;j++) {
				if(num[i]==num[j]) {
					count++;
				}
			}
			if(count>num.length/2) {
				return num[i];
			}
		
		}
		
		
		return -1;
	}
	
}
