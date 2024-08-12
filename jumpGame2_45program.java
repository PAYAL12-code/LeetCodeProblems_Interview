package LeetCodeImportantInterviewQus;

public class jumpGame2_45program {
public static void main(String[] args) {
	int nums[] = {2,3,1,1,4};
		/*	Output: 2
			Explanation: The minimum number of jumps to reach the last index is 2. 
			Jump 1 step from index 0 to 1, then 3 steps to the last index.*/
	//Return the minimum number of jumps to reach nums[n - 1]. 
	//The test cases are generated such that you can reach nums[n - 1].
	System.out.println(sol(nums));  
}

public static int sol(int nums[]) {
	int totalJumps = 0;
	int destination  = nums.length-1;
	int coverage =0;
	int lastJumpIdx =0;
	//Base Case
	if(nums.length==0)return  0;
	
	for(int i=0;i<nums.length;i++) {
		coverage = Math.max(coverage, i+nums[i]);
		if(i==lastJumpIdx) {
			lastJumpIdx = coverage;
			totalJumps++;
			
			//check if we reached destination already
			if(coverage>=destination) {
				return totalJumps;
			}
			
		}
	}
	return totalJumps;
	
}
}
