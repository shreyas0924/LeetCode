/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast.next != null && fast.next.next != null){    //Find the mid ele of linkedlist
            slow = slow.next;
            fast = fast.next.next;
        }
        
        
        //reverse the second part
        
        ListNode prev = null;
        ListNode curr = slow.next;
        
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        
        //compare the two lists
        
        ListNode L1 = head;
        ListNode L2 = prev;
        while (L2 != null) {
            if (L1.val != L2.val) {
                return false;
            }
        L1 = L1.next;
        L2 = L2.next;
        }

        return true;
    }
}