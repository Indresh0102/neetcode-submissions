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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode p1=list1, p2=list2, prev=null, head = null;
        if(p1==null){
            return p2;
        }else if(p2==null){
            return p1;
        }
        if(p1.val<=p2.val){
            head = p1;
            p1=p1.next;
        }else{
            head = p2;
            p2=p2.next;
        }
        prev = head;
        while(p1!=null && p2!=null){
            if(p1.val<=p2.val){
                prev.next = p1;
                prev=prev.next;
                p1=p1.next;
            }else{
                prev.next = p2;
                prev = prev.next;
                p2=p2.next;
            }
        }
        if(p1==null){
            prev.next = p2;
        }else{
            prev.next = p1;
        }
        return head;
    }
}