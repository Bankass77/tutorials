package certification.tutorials.algorithm;

public class BuySellStock {
	
	
	private static int maxiProfit(int [] prices) {
		
		int maxProfit =0, min= Integer.MAX_VALUE;
		
		
		for (int price : prices) {
			int profit= price-min;
			
			if (profit>maxProfit) {
				
				maxProfit= profit;
			
			}
			
			min= Math.min(min, price);
		}
		
		return maxProfit;
		
		
	}

	public static void main(String[] args) {
		
		int[] prices1 = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {7, 6, 4, 3, 1};
        
        System.out.println("price2: "+ maxiProfit(prices2));
        System.out.println("price1: "+ maxiProfit(prices1));

	}

}
