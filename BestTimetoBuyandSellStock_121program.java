package LeetCodeImportantInterviewQus;

public class BestTimetoBuyandSellStock_121program {

	public static void main(String[] args) {
		int prices[] = {7,6,4,3,6,4};
		int prices2[] = {7,6,4,3,1};//in this aaray we got 0 beacuse after qe buy on 6 there is no chance to get max on 6
		//in this program buyer have to buy stock on minimum element
		//and selling it on maximum amount in array and return maxmimum elment profit
	System.out.println("get profit ="+getProfit(prices));
	System.out.println("get profit ="+getProfit(prices2));
		
	}
	
	public static int getProfit(int[] price) {
		int buy_price = price[0];//we holde buying elemnt first
		
		int profit = 0;
		
		for(int i=1;i<price.length;i++) {
			if(price[i]<buy_price) {// in this we are checking if on 1 index elemnt is 0 index so buyer will buy on minimum price 
				//in aaray 1 is less than 7 so buyin on 1;
				buy_price=price[i];
			}else {
				//we check if we can get better proffit
				int current_profit = price[i]-buy_price;// 5-1=4
				profit = Math.max(current_profit, profit);//it will select maxmimum value in two variable like profit is 0 and current is 4 so 4 came like wise array trawel
			}
		}
		
		return profit;
	}
	
}
