class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode start = new ListNode();
        start.next = head;
        ListNode fast = start;
        ListNode slow = start;     

        for(int i = 1; i <= n; ++i)
            fast = fast.next;
        
        //1st traversal : fast=3, slow=1
        //2nd traversal : fast=4, slow=2
        
    
        while(fast.next != null)
        {
            fast = fast.next;
            slow = slow.next;
        }
        
        //3rd traversal : fast=5, slow=3
        //Now, the slow->next->next will be pointed to the slow->next
        
        slow.next = slow.next.next;
        
        return start.next;
    }
}