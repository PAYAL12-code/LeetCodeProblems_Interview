package LeetCodeImportantInterviewQus;

public class JumpGame_55Program {
public static void main(String[] args) {
	
	//You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.
   //Return true if you can reach the last index, or false otherwise.

  int[] nums = {2,3,1,1,4};
  int[] num2={2,2,1,0,4};
		/*Output: true
			Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.*/
	 //means like index 0 have 2 so you jum 2 time so you will reach on inde 2 value 1 than you can jump only 
	//1 time so you reach indesx 3 and value 1 so you jump again 1 and you reached end of index so it retun true
	// if in place of one is came so you cant jump and will not reach end than it retun false
    //reachable take o index and compare i index if it not less i than it take max value in between reachable and index and areay index value
  
  System.out.println(sol(nums));
   //System.out.println(sol(num2));
 
  }
  
  
  public static boolean sol(int[] nums) {
	  
	  int n = nums.length;
	  int reachable = 0;
	  
	  for(int i = 0; i<n;i++) {
		  if(reachable<i) // 1.reachable have 0 and i =0 , 2. reachble =2 ,i=1 true condision it will go max condision
			  return false;
		  reachable = Math.max(reachable,i+nums[i]);//0,0+2 reachable = 2; , 2. 2, 1+3=4 so reachable =4 like that check all 
		  //System.out.println(reachable+","+nums[i]);
			  
	  }
	  //if reachable is always >= i so its excute true and it reach end ; and reachable take max value;
	  return true;
  }
  
}
