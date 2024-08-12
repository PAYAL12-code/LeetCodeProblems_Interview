package LeetCodeImportantInterviewQus;

public class TrappingRainwater_42program {
public static void main(String[] args) {
	//Given n non-negative integers representing an elevation map where 
	//the width of each bar is 1, compute how much water it can trap after raining.
//Output: 6
	//Explanation: The above elevation map (black section) 
	//is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. 
	//In this case, 6 units of rain water (blue section) are being trapped.
	 
	int[] arr= {0,1,0,2,1,0,1,3,2,1,2,1};
	System.out.println(rainWater(arr));
	
}
public static int rainWater(int[] a) {
	int n = a.length;
	int left[] = new int[n];
	int right[] = new int[n];
	//we are checking in aaray right and lefft side wich one is max by take right and left array and 
	left[0] = a[0];
	for(int i=1;i<n;i++) {
		left[i]= Math.max(left[i-1], a[i]);
	}
	right[n-1]= a[n-1];
	
	for(int i=n-2;i>=0;i--) {
		right[i] = Math.max(right[i+1], a[i]);
	}
	//we take right and left array now we compare in this wich on less so those value will be - by a[i value
	int val= 0;
	for(int i=0;i<n;i++) {
		
		//jo sabse chota hoga whi pani jma hoskta h to hm whi lekr + kre g or value retune kr dege
		val+=(Math.min(left[i],right[i])-a[i]);
	}
	return val;
}

}
