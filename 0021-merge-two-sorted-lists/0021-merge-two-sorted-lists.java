//Recursivve
// class Solution {
//     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//         if(list1==null)return list2;
//         if(list2==null)return list1;

//         if(list1.val<list2.val){
//             list1.next=mergeTwoLists(list1.next,list2);
//             return list1;
//         }
//         else{
//             list2.next=mergeTwoLists(list1,list2.next);
//             return list2;
//         }

        
//     }
// }

//Iterative
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;
        
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            }else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
       tail.next = (list1 != null) ? list1 : list2; 
        return dummyHead.next;
        
        
    }
}