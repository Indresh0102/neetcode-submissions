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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null || head.next.next==null){
            return ;
        }
        ListNode place=head,node,temp;
        while(place.next!=null && place.next.next!=null){
            node = place;
            while(node.next.next!=null){
                node=node.next;
            }
            temp = place.next;
            place.next = node.next;
            place.next.next = temp;
            node.next = null;
            place = temp;
        }
        return;

    }
}
