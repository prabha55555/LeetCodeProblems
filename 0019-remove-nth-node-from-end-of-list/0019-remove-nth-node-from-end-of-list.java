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
        if(head==null )return null;


        ListNode temp=head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }

        int pos = count-n;
        if(pos==0)return head.next;

     ListNode curr=null;
          temp=head;

          for(int i=1;i<=pos && temp!=null;i++){
                curr=temp;
                temp=temp.next;


          }

         
            curr.next=temp.next;

          

          return head;
        
    }
}