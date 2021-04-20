// https://leetcode.com/problems/n-ary-tree-level-order-traversal/

class Solution {
    List<Integer> levelList = new ArrayList<Integer>();
    List<List<Integer>> total = new ArrayList<List<Integer>>();
    
    int height(Node root)
    {
        if(root.children.size() == 0)
            return 1;
        int max = 0;
        for(int i = 0; i < root.children.size(); i++)
        {
            int h = height(root.children.get(i));
            if(h > max)
                max = h;
        }
        return max+1;
    }
    
    void levelorder(Node root, int height)
    {
        for(int i = 0; i < height; i++)
        {
            levelOrderUtil(root, i);
            total.add(levelList);
            levelList = new ArrayList();
        }
    }
    
    void levelOrderUtil(Node root, int level)
    {
        if(level == 0)
        {
            levelList.add(root.val);
            return;
        }
        for(int i = 0; i < root.children.size(); i++)
        {
            levelOrderUtil(root.children.get(i), level - 1);
        }
    }
    
    public List<List<Integer>> levelOrder(Node root) {
        if(root != null)
        {
            int h = height(root);
            levelorder(root, h);
        }
        return total;
    }
}