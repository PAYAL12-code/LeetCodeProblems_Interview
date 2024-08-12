package LeetCodeImportantInterviewQus;

public class RemoveDublicateFromSortedArray_26program {
public static void main(String[] args) {
	int nums[]= {1,1,2,3,3,3};//remove dublicate and print unique elemtnt count;
	
	System.out.print(getlen(nums));
}

public static int getlen(int nums[]) {
	
	int l=0; //{1,1,2} so l is pointing o and k is 1 index pointing
	         // condision 
	for(int k = 1;k<nums.length;k++) {
		if(nums[l]!=nums[k]) {
			l++;
		
		nums[l]=nums[k];
		}
	
	}
	return l+1;
}

}