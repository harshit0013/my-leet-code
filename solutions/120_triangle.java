// https://leetcode.com/problems/triangle/

// Solved in April Challenge:
// https://leetcode.com/explore/challenge/card/april-leetcoding-challenge-2021/595/week-3-april-15th-april-21st/3715/

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        for(int i = triangle.size()-2; i >= 0; i--)
            for(int j = triangle.get(i).size()-1; j >= 0; j--)
            {
                int min = Math.min(triangle.get(i+1).get(j), triangle.get(i+1).get(j+1));
                triangle.get(i).set(j, triangle.get(i).get(j) + min);
            }
        return triangle.get(0).get(0);
    }
}