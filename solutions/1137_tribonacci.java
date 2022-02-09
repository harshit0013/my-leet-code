// https://leetcode.com/problems/n-th-tribonacci-number/

class Solution {
    HashMap<Integer, Integer> tribHash = new HashMap<Integer, Integer>();
    
    public int tribonacci(int n) {
        if(n == 0)
            return 0;
        if(n < 3)
            return 1;
        if(tribHash.containsKey(n))
            return tribHash.get(n);
        int ans = tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
        tribHash.put(n, ans);
        return ans;
    }
}
