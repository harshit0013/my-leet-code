// https://leetcode.com/problems/n-ary-tree-preorder-traversal/

// Solved in April Daily Challenge :
// https://leetcode.com/explore/challenge/card/april-leetcoding-challenge-2021/595/week-3-april-15th-april-21st/3714/

class Solution {
    List<Integer> myList = new LinkedList<Integer>();
    public List<Integer> preorder(Node root) {
        if(root != null)
        {
            myList.add(root.val);
            for(int i = 0; i < root.children.size(); i++)
                preorder(root.children.get(i));
        }
        return myList;
    }
}