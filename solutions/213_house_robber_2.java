// https://leetcode.com/problems/house-robber-ii/

class Solution {
    HashMap<Integer, Integer> dp;
    
    int max(int a, int b)
    {
        return a > b ? a : b;
    }
    
    int startRob(int[] nums, int i, int houses)
    {
        if(i >= houses)
            return 0;
        if(dp.containsKey(i))
            return dp.get(i);
        int ans = nums[i] + max(startRob(nums, i + 2, houses), startRob(nums, i + 3, houses));
        dp.put(i, ans);
        return ans;
    }
    
    public int rob(int[] nums) {
        int houses = nums.length;
        if(houses == 1)
            return nums[0];
        if(houses == 2)
            return max(nums[0], nums[1]);
        dp = new HashMap<Integer, Integer>();
        int include_1st = startRob(nums, 0, houses - 1);
        dp = new HashMap<Integer, Integer>();
        int exclude_1st = startRob(nums, 1, houses);
        dp = new HashMap<Integer, Integer>();
        int one_more = startRob(nums, 2, houses);
        return max(max(include_1st, exclude_1st), one_more);
    }
}
