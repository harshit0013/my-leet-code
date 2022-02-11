// https://leetcode.com/problems/min-cost-climbing-stairs/

class Solution {
    HashMap<Integer, Integer> dp;
    
    int min(int a, int b)
    {
        return a > b ? b : a;
    }
    
    int climb(int[] cost, int steps, int i)
    {
        if(i >= steps)
            return 0;
        if(dp.containsKey(i))
            return dp.get(i);
        else
        {
            int ans = cost[i] + min(climb(cost, steps, i + 1), climb(cost, steps, i + 2));
            dp.put(i, ans);
            return ans;
        }
    }
    
    public int minCostClimbingStairs(int[] cost) {
        int steps = cost.length;
        dp = new HashMap<Integer, Integer>();
        return min(climb(cost, steps, 0), climb(cost, steps, 1));
    }
}
