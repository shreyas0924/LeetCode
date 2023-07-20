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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode a = head;
        if (head == null)
        {
            return head;
        }
        while(a.next != null){
            if(a.val != a.next.val){
                a = a.next;
            }
            else {
                a.next = a.next.next;
            }
        }
        return head;
    }
}