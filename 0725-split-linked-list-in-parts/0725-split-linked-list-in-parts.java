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
    public ListNode[] splitListToParts(ListNode head, int k) {
                ListNode[] res = new ListNode[k];
                int len=0;
                ListNode curr = head;
                while(curr!=null){
                    len++;
                    curr=curr.next;
                }
                
	            int partLength = len/k;
	            int remainder = len%k;
	            int r = remainder>0?1:0;
	            remainder--;
                int i=0;
                curr= head;
                ListNode prev = null;
	            while(curr!=null||i<k){
		            int n = partLength + r;
		            res[i]=curr;
		            for(int j=0;j<n&&curr!=null;j++){
                        prev = curr;
	                    curr=curr.next;
                    }
                    if(prev!=null){
                        prev.next=null;
                    }
                    if(remainder==0){
                        r=0;
                    }else{
                        remainder--;
                    }
                i++;
            }
        return res;
    }
}