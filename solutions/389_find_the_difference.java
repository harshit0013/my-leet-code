// https://leetcode.com/problems/find-the-difference/

class Solution {
    public char findTheDifference(String s, String t) {
        int s_sum = 0, t_sum = 0, i;
        for(i = 0; i < s.length(); i++)
        {
            s_sum += s.charAt(i);
            t_sum += t.charAt(i);
        }
        t_sum += t.charAt(i);
        return (char)(t_sum - s_sum);
    }
}
