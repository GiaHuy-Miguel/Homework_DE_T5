package Leetcode;

public class Array_Best_Time_To_Buy_Stock {
    public static void main(String[] args) {
//        int[] nums = {7, 1, 5, 3, 6, 4};
//        int max_profit = 0;
//        for (int n = 0; n <= nums.length; n++) {
//            for (int i = n+1; i <= nums.length - 1; i++) {
//                int profit = nums[i] - nums[n];
//                if (profit > max_profit) max_profit = profit;
//            }
//        }
//        System.out.println(max_profit);
        int[] prices = {7, 1, 5, 3, 6, 4};
        int profit = 0;
        int buy = prices[0];
        for (int i = 1; i < prices.length; i++) {
            int CurrProfit = prices[i] - buy;
            if (CurrProfit > profit) profit = CurrProfit;
            buy = Math.min(buy, prices[i]);
        }
        System.out.println(profit);
    }
}
