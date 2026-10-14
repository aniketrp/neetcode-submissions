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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy=new ListNode(-1,head);
        ListNode prev=dummy;
        ListNode cur=head;

        while(cur!=null){
            ListNode nxt=cur.next;
            if(cur.val==val){
                prev.next=nxt;
            }else{
                prev=cur;
            }
            cur=nxt;
        }
        return dummy.next;
    }
}