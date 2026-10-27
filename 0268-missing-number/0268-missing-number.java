class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expSum = n*(n+1)/2;
        int actualSum=0;

        for(int val : nums)
        {
          actualSum += val;

        }

        return expSum-actualSum;

        
    }
}