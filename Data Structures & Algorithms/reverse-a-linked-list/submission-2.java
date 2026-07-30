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
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }
        List<ListNode> node_arr = new ArrayList<>();
        ListNode node = head;
        while(node!=null){
            node_arr.add(node);
            node=node.next;
        }
        ListNode ans_node, p;
        ans_node = node_arr.get(node_arr.size()-1);
        p=ans_node;
        for(int i=node_arr.size()-2;i>=0;i--){
            p.next = node_arr.get(i);
            p=p.next;
        }
        p.next = null;
        return ans_node;
    }
}
