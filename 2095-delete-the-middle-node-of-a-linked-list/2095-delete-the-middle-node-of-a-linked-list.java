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
    public ListNode deleteMiddle(ListNode head) {
               if(head.next==null) return null;
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        int middle=count/2;
         temp=head;
        for(int i=1;i<middle && temp!=null;i++){
               temp=temp.next;
        }
        if(temp.next!=null)
        temp.next=temp.next.next;
          
        
return head;

        
    }
}