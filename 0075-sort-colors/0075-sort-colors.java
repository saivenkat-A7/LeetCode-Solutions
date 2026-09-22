class Solution {
    public void sortColors(int[] nums) {
        int zeros = 0;
        int ones =0;
        int two =0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                zeros++;
            }
            else if(nums[i]==1)
            {
                ones++;
            }
            else 
            {
                two++;
            }
        }

        int i=0;
        while(zeros-->0)
        {
            nums[i++] = 0;
        }
        while(ones-->0)
        {
            nums[i++] = 1;
        }
        while(two-->0)
        {
            nums[i++] =2;
        }



    }
    
}