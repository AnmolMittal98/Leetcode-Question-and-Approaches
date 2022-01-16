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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next==null){
            return null;
        }
        
        ListNode slow=head;
        ListNode fast=head;
        
        int i=0;
        while(i<n){
            fast=fast.next;
            i++;
        }
        if(fast==null){
            ListNode temp=head.next;
            head.next=null;
            head=temp;
            return head;
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;        
        return head;
    }
}