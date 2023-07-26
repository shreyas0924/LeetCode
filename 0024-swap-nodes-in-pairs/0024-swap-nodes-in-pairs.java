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
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;
        
        while (current.next != null && current.next.next != null) {
            ListNode first = current.next;
            ListNode second = current.next.next;
            
            first.next = second.next;
            current.next = second;
            current.next.next = first;
            
            current = current.next.next;
        }
        
        return dummy.next;
    }
}

/*


This Java code defines a method swapPairs within a class Solution. The purpose of this method is to swap adjacent pairs of nodes in a singly linked list. The method takes the head node of the linked list as input and returns the new head node of the modified linked list.

Let's go through the code step by step:

Check the base case: If the head is null or there is only one node (i.e., head.next is null), there's nothing to swap, so it returns the head as it is.

Create a dummy node and set its next to the original head. The dummy node is used as a placeholder and helps to handle the edge cases where the head itself needs to be swapped.

Create a pointer current and initialize it with the dummy node. This pointer will be used to traverse the list while performing swaps.

Enter the loop: As long as there are at least two more nodes after the current node (current.next != null and current.next.next != null), we continue the swapping process.

Within the loop:
a. Store the first node to be swapped in the first variable (i.e., current.next).
b. Store the second node to be swapped in the second variable (i.e., current.next.next).

Note: The linked list structure before swapping: current -> first -> second -> next ...

c. Update the pointers to perform the swap:

Set the next pointer of first to the node after second, so it connects to the remaining list after swapping.
Set the next pointer of current to second, making the second node the new head of this pair.
Set the next pointer of second to first, completing the swap.
Note: The linked list structure after swapping: current -> second -> first -> next ...

d. Move the current pointer two nodes ahead to continue the next iteration.

After the loop completes, the linked list has been fully swapped in pairs. The dummy.next node points to the new head of the linked list after swapping, so return dummy.next.

The algorithm works efficiently by traversing the linked list only once, and each swap operation takes constant time. Therefore, the overall time complexity of this swapPairs method is O(n), where n is the number of nodes in the linked list.


*/