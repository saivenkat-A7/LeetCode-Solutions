class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int ones =0;
        int maxOnes = Integer.MIN_VALUE;

        for(int i=0;i<n;i++)
        {
            
            if(nums[i]==1)
            {
                ones++;
            }
            else
            {

                maxOnes = Math.max(maxOnes,ones);
                ones=0;
               // System.out.println(one);

            }

        }
        maxOnes = Math.max(maxOnes,ones);
        return maxOnes;
        
    }
}