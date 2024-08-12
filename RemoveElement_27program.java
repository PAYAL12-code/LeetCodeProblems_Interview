package LeetCodeImportantInterviewQus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveElement_27program {
//in this proble i have to remove val element in array and print the how many elemnt pregetn after remove 
	public static void main(String[] args) {
	int num[]= {0,1,2,2,3,0,4,2};
	int val = 2;
	 
    int count = 0;
	for(int i =0;i<num.length;i++) {
		if(num[i]==val) {
		num[i]=-1;
		
	}
	}
	for(int i =0;i<num.length;i++) {
		
		if(num[i]!=-1) {
			
			System.out.print(num[i]+",");
			count++;
		}
	}
	System.out.println();
	System.out.println(count);
	
	//chat gpt 
	 int[] expectedNums1 = {2, 2};
	 test(num, val, expectedNums1);
	//or
	 System.out.println(removeEle(num,val));
	
	
	}
//or
	public static int removeEle(int nums[],int val) {
		int count=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=val) {
				nums[count]=nums[i];
				count++;
			}
		
		}
	return count;
	}
	
	//chat gpt solution
	 public static int removeElement(int[] nums, int val) {
	        int k = 0; // Index to place the next element that is not equal to val
	        for (int i = 0; i < nums.length; i++) {
	            if (nums[i] != val) {
	                nums[k] = nums[i];
	                k++;
	            }
	        }
	        return k;
	    }

	    private static void test(int[] nums, int val, int[] expectedNums) {
	        int k = removeElement(nums, val);
	        assert k == expectedNums.length;
	        // Sort the first k elements of nums to compare with expectedNums
	        java.util.Arrays.sort(nums, 0, k);
	        for (int i = 0; i < k; i++) {
	            assert nums[i] == expectedNums[i];
	        }
	        System.out.println("Test passed!");
	    }
	}
	
	
