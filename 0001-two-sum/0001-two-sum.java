class Solution {
    public int[] twoSum(int[] nums, int target) {
      int n = nums.length;
      HashMap<Integer, Integer> hm = new HashMap<>();

      for(int i=0;i<n;i++)
      {
        int req = target-nums[i];
        if(hm.containsKey(req))
        {
            int index = hm.get(req);
            return new int[]{i,index};
        }

        hm.put(nums[i],i);

      }
      return new int[]{-1,-1};
    }
}