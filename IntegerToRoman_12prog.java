package LeetCodeImportantInterviewQus;

public class IntegerToRoman_12prog {
public static void main(String[] args) {
	int num=3749;
	int num1 = 58;
	System.out.println(intToRoman(num));
	System.out.println(intToRoman(num1));
}

public static String intToRoman(int num) {
	String[] u= {"","I","II","III","IV","V","VI","VII","VIII","IX"};
	String[] t= {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
	String[] h= {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CH"};
	String[] th= {"","M","MM","MMM"};
	
	String res = th[num/1000]+h[(num%1000)/100]+t[(num%100)/10]+u[num%10];
	return res;
			
	}
}
