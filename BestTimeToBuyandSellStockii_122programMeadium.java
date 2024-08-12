package LeetCodeImportantInterviewQus;

public class BestTimeToBuyandSellStockii_122programMeadium {
public static void main(String[] args) {
	int prices[]= {7,1,5,3,6,4};
	
}
 
 public static int getMaximuProfit(int []price) {
	 
	 int buy_prices = price[0];
	 int profit = 0;
	 
	 for(int i=1;i<price.length;i++) {
		 if(price[i]<buy_prices) {
			 buy_prices=price[i];
			 
		 }else {
			
		 }
	 }
	 
	 
	 return 1;
 }


}
