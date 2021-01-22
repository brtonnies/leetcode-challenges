public class StockMaxProfit {
//    private StockTrader trader = new StockTrader();

    public int maxProfit(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }

        return maxprofit;
    }

    public static void main(String[] args) {
        StockMaxProfit trader = new StockMaxProfit();
        int[] prices = { 7, 1, 5, 3, 6, 4 };
//        int output = 5;
        int[] prices2 = { 7, 6, 4, 3, 1 };
        int output = 0;
        int[] prices3 = { 1, 2 };
//        int output = 1;

        int ret = trader.maxProfit(prices2);
        if (ret == output)
            System.out.println("PASSED TEST FOR INPUT");
        else
            System.out.println("FAILED TEST FOR INPUT: Expected " + output + ", Received " + ret);
    }
}
