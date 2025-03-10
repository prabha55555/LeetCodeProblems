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
    public ListNode removeNodes(ListNode head) {

        ListNode temp=reverse(head);
        ListNode curr=temp;
        int max=temp.val;

        while(temp!=null &&temp.next!=null  ){
            
            if(temp.next.val>=max){
               temp=temp.next;
               max=temp.val;

            }
            else{
                temp.next=temp.next.next;

            }
           
        }
        return reverse(curr);

        
        
    }
    public static ListNode reverse(ListNode head){
          ListNode curr=head;
          ListNode prev=null;
          ListNode temp=null;
          ListNode next=null;

          while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        
            
          }
          return prev;

    }
}