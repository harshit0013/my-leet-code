package LeetCode;
import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

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