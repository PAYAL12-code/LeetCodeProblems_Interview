package LeetCodeImportantInterviewQus;

public class RotateArray_189program {
public static void main(String[] args) {
	int num[]= {-1,-100,3,99};
	int k=2;
	
	for(int i=1;i<=k;i++) {
		int last = num[num.length-1];
		for(int j=num.length-1;j>0;j--) {
			num[j]=num[j-1];
			
		}
		num[0]=last;
	}
	
		for(int n:num) {
			System.out.print(n+",");
		}
			
}
}
