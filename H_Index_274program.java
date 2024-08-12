package LeetCodeImportantInterviewQus;

public class H_Index_274program {
 
	public static void main(String[] args) {
		int n[] = {3,0,6,1,5};
		int n1[] = {1,3,1};
		//Output: 3
		//Explanation: [3,0,6,1,5] means the researcher has 5 papers in total and each of them had received 3, 0, 6, 1, 5 citations respectively.
		//Since the researcher has 3 papers with at least 3 citations each and the remaining two with no more than 3 citations each, their h-index is 3.
		//means in this aaray we take the value wich have maximum like if we take 3 so 3,6,5 is equal and grater and thre value also
		//but if we select 5 so only 5,6 but only two value so in this 3 is max
		System.out.println(hIndex(n1));
		}
		
	public static int hIndex(int[] citation) {
		int n =citation.length; //5
		int[] arr= new int[n+1];//6 [0,0,0,0,0,0]
		 
		for(int c : citation) {
			if(c>n) //3>5 no else 
				arr[n]++;
			else
				arr[c]++; // so index 3 beacause c value is 3 so in 3 index we incress  end 
		}
		int count =0;
		for(int i=n;i>=0;i--) {
			count = count+arr[i];
			if(count>=i)
				//System.out.println(count);
				return i;
		}
		return 0;
}
}