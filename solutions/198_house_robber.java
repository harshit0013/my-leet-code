// https://leetcode.com/problems/house-robber/

class Solution {
    HashMap<Integer, Integer> dp;
    
    int max(int a, int b)
    {
        return a > b ? a : b;
    }
    
    int startRob(int[] nums, int i)
    {
        int houses = nums.length;
        if(i >= houses)
            return 0;
        if(dp.containsKey(i))
            return dp.get(i);
        int ans = nums[i] + max(startRob(nums, i + 2), startRob(nums, i + 3));
        dp.put(i, ans);
        return ans;
    }
    
    public int rob(int[] nums) {
        int houses = nums.length;
        dp = new HashMap<Integer, Integer>();
        return max(startRob(nums, 0), startRob(nums, 1));
    }
}
