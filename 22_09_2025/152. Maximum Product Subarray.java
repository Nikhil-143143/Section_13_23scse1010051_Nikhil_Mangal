class Solution {
    public int maxProduct(int[] nums) {
        int product = 1;
        int maxproduct = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            product = 1;
            for(int j = i;j<nums.length;j++){
                product = product*nums[j];
                maxproduct = Math.max(maxproduct, product);
            }
        }
        return maxproduct;
    }
}