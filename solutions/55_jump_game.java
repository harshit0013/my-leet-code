// https://leetcode.com/problems/jump-game/

class Solution {
    public boolean canJump(int[] nums) {
        int N = nums.length;
        if(N == 1)
            return true;
        
        int j = N-1;
        for(int i = N-2; i >= 0; i--)
        {
            if(nums[i] + i >= j)
            {
                j = i;
            }
        }
        
        if (j == 0)
            return true;
        else
            return false;
    }
}
