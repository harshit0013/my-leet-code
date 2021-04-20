// https://leetcode.com/problems/maximum-depth-of-n-ary-tree/

class Solution {
    public int maxDepth(Node root) {
        if(root != null)
        {
            if(root.children.size() == 0)
            return 1;
            int max = 0;
            for(int i = 0; i < root.children.size(); i++)
            {
                int h = maxDepth(root.children.get(i));
                if(h > max)
                    max = h;
            }
            return max+1;
        }
        return 0;
    }
}