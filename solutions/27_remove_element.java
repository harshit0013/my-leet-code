// https://leetcode.com/problems/remove-element/

class Solution {
    public int removeElement(int[] nums, int val) {
        int last = nums.length - 1, count = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == val)
            {
                while(last > 0 && nums[last] == val)
                {
                    last --;
                }
                nums[i] = nums[last];
                if(last > 0)
                    last --;
                count ++;
            }
        }
        return nums.length - count;
    }
}
