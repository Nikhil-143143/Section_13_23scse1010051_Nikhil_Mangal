//Brute force:-

class Solution {
    public int maxProfit(int[] prices) {
        int index = 0;
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
                index = i;
            }
        }
        for (int j = index + 1; j < prices.length; j++) {
            if (prices[j] > min) {
                if (prices[j] > max) {
                    max = prices[j];
                }
            }
        }
        if (max > min) {
            return max - min;
        }
        return 0;
    }
}