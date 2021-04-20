// https://leetcode.com/problems/n-ary-tree-postorder-traversal/

class Solution {
    List<Integer> myList = new LinkedList<Integer>();
    public List<Integer> postorder(Node root) {
        if(root != null)
        {
            for(int i = 0; i < root.children.size(); i++)
                postorder(root.children.get(i));
            myList.add(root.val);
        }
        return myList;
    }
}