// https://leetcode.com/problems/palindrome-linked-list/

// Solved in April Daily Challenge :
// https://leetcode.com/explore/challenge/card/april-leetcoding-challenge-2021/593/week-1-april-1st-april-7th/3693/

class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        LinkedList<Integer> ll = new LinkedList<Integer>();
        while(temp != null)
        {
            ll.push(temp.val);
            temp = temp.next;
        }
        temp = head;
        while(temp != null)
        {
            if(temp.val != (int)ll.pop())
                return false;
            temp = temp.next;
        }
        return true;
    }
}