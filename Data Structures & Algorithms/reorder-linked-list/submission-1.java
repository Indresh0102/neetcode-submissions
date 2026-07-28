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
        List<ListNode> nodes = new ArrayList<>();
        ListNode node = head;
        while(node!=null){
            nodes.add(node);
            node = node.next;
        }
        int i=0,j=nodes.size()-1;
        while(i<j){
            nodes.get(i).next = nodes.get(j);
            if(i+1<j){
                i++;
                nodes.get(j).next = nodes.get(i);
                j--;
                nodes.get(j).next = null;
            }else{
                break;
            }
        }
        return ;

        
    }
}
