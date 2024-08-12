package LeetCodeImportantInterviewQus;

import java.util.Arrays;

public class Candy_135prog {
public static void main(String[] args) {
	//There are n children standing in a line. Each child is assigned a rating
//    value given in the integer array ratings.

//You are giving candies to these children subjected to the following requirements:

//Each child must have at least one candy.
//Children with a higher rating get more candies than their neighbors.
//Return the minimum number of candies you need to have to distribute the candies to the children.
	//Output: 5
	//Explanation: You can allocate to the first, second and third child with 2, 1, 2 candies respectively.
	int rating[] = {1,0,2};
	int ratings[]= {1,2,2};
	System.out.println(getCandy(rating));
	System.out.println(getCandy(ratings));
	
}

public static int getCandy(int[] rating) {
	int sum=0;
	int[] left = new int[rating.length];
	int[] right = new int[rating.length];
	
	Arrays.fill(left, 1);//atlist have 1 candy for all 
	Arrays.fill(right, 1);
	//now we compare in aaray rating wich on have grater rating compare nebor 
	//SO we can give more candy that so for we take left and right aaray and compare both side
	for(int i=1;i<rating.length;i++) { // we start form 1 because index 0 befor no elment 
		if(rating[i]>rating[i-1]) {
			left[i]=left[i-1]+1; // yha pr phale wali elemnet me + kre g mtlb 2,1,2 so 2 is grate 1 so in left index 0 value is 1+1 =2
 		}}
	//same right side
	for(int i=rating.length-2;i>=0;i--) {// back side s
		if(rating[i]>rating[i+1]) {
			right[i]=right[i+1]+1; // 2,1,2 so 2>1 yes index end 1+1=2 so rifht =  1,1,2(1+1)
		}
	}
	
	//now we comapre wich have max value + and put in sum and we get total candy
	for(int i=0;i<rating.length;i++) {
		sum+=Math.max(left[i], right[i]);
	}
	  return sum;
}
}
