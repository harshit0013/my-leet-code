// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/

class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length, i = 1, j = 0, i_count = 0, j_count = 0;
        if(len < 3)
            return len;
        while(i < len && j < len - 1)
        {
            if(nums[j] == nums[j+1])
                j_count++;
            else
            {
                j_count = 0;
                nums[i] = nums[j+1];
                i++;
                j++;
                continue;
            }
            if(j_count < 2)
            {
                nums[i] = nums[j+1];
                i++;
                j++;
            }
            else
            {
                j++;
                i_count++;
            }
        }
        return len - i_count;
    }
}
