package com.newjuncai.demo.algorithm;

/**
 * 买卖股票的最佳时机 II
 * <p>
 * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2zsx1/
 * </p>
 *
 * @author liujc
 * @create 2020-10-20 14:41:36
 **/
public class MaxProfit {
    /**
     * [2,1,2,0,1]
     *
     * @param prices
     * @return
     */
    public int solution(int[] prices) {
        int profit = 0;
        //后置位数字大于当前数字就可以买入当前
        for (int i = 1; i < prices.length; i++) {
            if (prices[i - 1] < prices[i] ) {
                profit += prices[i] - prices[i-1];
            }
        }
        return profit;
    }
}
