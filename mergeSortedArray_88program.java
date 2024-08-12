package LeetCodeImportantInterviewQus;

public class mergeSortedArray_88program {

	public static void main(String [] args) {
		
		int[] num1 = {1,2,3,0,0,0};
		int m = 3,n=3;// this m is for num1 number lenth and num 2 lenth given in problem
		int []num2 = {2,5,6};
		
		merge(num1,m,num2,n);
		for(int num:num1) {
			System.out.print(num+",");
		}
		
	}
	
	public static void merge(int[] num1, int m,int[] num2, int n) {
		int i = m-1;//pointer for num1

		int j = n-1;
		 int k = m+n-1; //pointer for merge aarya

		 //merger in reverse order
		 while(i>=0 && j>=0) {
			 
			 if(num1[i]>num2[j]) {
				 num1[k] = num1[i];
				 i--;
				 k--;
				 
			 }else {
				 
				 num1[k]= num2[j];
				 j--;
				 k--;
				 
			 }
			 }
	// if there reamining element in num2 array
	    while(i>=0)
	    	num1[k--]=num1[i--];
		 while(j>=0)
			 num1[k--]=num2[j--];
	}
	
}
	