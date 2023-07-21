class Solution {
    public ListNode oddEvenList(ListNode head) {
        // edge cases
        if(head == null || head.next == null){
            return head;
        }
        
        // initialization
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;
        
        // iterate over the good linked list
        while(even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        
        // connect odd and even
        odd.next = evenHead;
        
        return head;
    }
}