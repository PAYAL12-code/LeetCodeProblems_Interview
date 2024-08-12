package LeetCodeImportantInterviewQus;

import java.util.Arrays;

public class RomanToInteger_13prog {
public static void main(String[] args) {
	String s = "III";
	String s1 = "IV";
   String s2= "LVIII";
	//Output: 3
	//Explanation: III = 3.
	
	System.out.println(romanToInt(s)); // if before  value is greaterthan or equal so + operation perform
 	System.out.println(romanToInt(s1));//if before value is less than than - operation will perform
 	System.out.println(romanToInt(s2));
}
public static int getVal(char ch) {
	// this value is given by code
	switch(ch) {
	
	case 'I':return 1;
	case 'V':return 5;
	case 'X':return 10;
	case 'L':return 50;
	case 'C':return 100;
	case 'D':return 500;
	case 'M':return 1000;
	default : return 0;
	}
}
public static int romanToInt(String s) { // ex s = IV
	int n = s.length();//2
	int sum = 0;
	//we are checking char is less or grater so if less do - if grater do+
	for(int i =0;i<n;i++) {
		char ch1=s.charAt(i);//I 2. V
		
		if((i+1)<n && getVal(ch1)<getVal(s.charAt(i+1)))//(0+1)<2 && 1<5 true perform - 
			                                            //(1+1)<2 && 5<false 
			sum = sum-getVal(ch1); // sum = 0-1 = -1
		else
			sum = sum+getVal(ch1);// sum = -1+5 = 4
	}
	return sum;// 4
	
	
}
}
