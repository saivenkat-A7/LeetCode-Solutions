class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        long sum = 0;  // use long to prevent overflow

        // initial window sum
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        long maxSum = sum;

        // slide the window
        for (int i = k; i < n; i++) {
           sum-=nums[i-k];
           sum+= nums[i];
            maxSum = Math.max(maxSum,sum);
        }

        return (double) maxSum / k;
    }
}
