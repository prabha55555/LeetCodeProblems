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
 //  iterative method prabha ..


        // ListNode curr=head;
        // ListNode prev=null;
        // ListNode next=null;
        
        // while(curr!=null){
        //      next=curr.next;
        //     curr.next=prev;
        //     prev=curr;
        //     curr=next;
        // }
        // return prev;


    // recursive method;

    if(head==null || head.next==null){
        return head;
    }

    ListNode nn = reverseList(head.next);

    head.next.next=head;
    head.next=null;
    return nn;
        

    }
}