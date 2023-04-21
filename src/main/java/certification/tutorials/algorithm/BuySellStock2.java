package certification.tutorials.algorithm;

public class BuySellStock2 {

	private static int maxiProfit(int[] prices) {

		if (prices == null || prices.length == 0) {

			return 0;
		}

		int minPrice = prices[0];
		int maxiProfit = 0;
		for (int i = 0; i < prices.length; i++) {
			
			minPrice= Math.min(minPrice, prices[i]);
			maxiProfit=Math.max(maxiProfit, prices[i]-minPrice);
			
		}
		return maxiProfit;

	}
	
	public static void main(String[] args) {
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println(maxiProfit(prices1)); // expected output: 5
        System.out.println(maxiProfit(prices2)); // expected output: 0
    }

}
