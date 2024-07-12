package Hw;

class MaxSumSubarray {
    int a = 0;
    int b = 0;
    public int sum (int[] nums){
        if (nums.length == 1) b = nums[0];
        else {
            for (int i = 0; i < nums.length; i++) {
                a += nums[i];
                if (a < 0) a = 0;
                if (b < a) b = a;
            }
        }
        return b;
    }
}

class BestBuyStock {
    int profit = 0;
    public int maxprofit (int[] prices){
        int buy = prices[0];
        for (int i = 1; i < prices.length; i++) {
            int CurrProfit = prices[i] - buy;
            if (CurrProfit > profit) profit = CurrProfit;
            buy = Math.min(buy, prices[i]);
        }
        return profit;
    }
}


public class hw_buoi5_1007 {
    public static void main(String[] args) {
//        Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//        Output = 6
        int[] nums1 = {-2,1,-3,4,-1,2,1,-5,4};
        MaxSumSubarray sumarr1 = new MaxSumSubarray();
        int maxsub1 = sumarr1.sum(nums1);
        System.out.println("Max Subarray Method Result 1: " + maxsub1);

//        Input: nums = [5,4,-1,7,8]
//        Output: 23
//        Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
        int[] nums2 = {5,4,-1,7,8};
        MaxSumSubarray sumarr2 = new MaxSumSubarray();
        int maxsub2 = sumarr2.sum(nums2);
        System.out.println("Max Subarray Method Result 2: " + maxsub2);

//        Input: nums = [1]
//        Output: 1
//        Explanation: The subarray [1] has the largest sum 1.
        int[] nums3 = {1};
        MaxSumSubarray sumarr3 = new MaxSumSubarray();
        int maxsub3 = sumarr3.sum(nums3);
        System.out.println("Max Subarray Method Result 3: " + maxsub3);


//        Best time to buy stock
//        Input: prices = [7, 1, 5, 3, 6, 4]
//        Output: 5
//        Explanation: Buy at day 2nd (1) and sell at price day 5th (6). Max profit: 6 - 1 = 5
        int[] prices = {7, 1, 5, 3, 6, 4};
        BestBuyStock bestbuy = new BestBuyStock();
        int profit_max = bestbuy.maxprofit(prices);
        System.out.println("Maximum profit is : " + profit_max);

    }
}
