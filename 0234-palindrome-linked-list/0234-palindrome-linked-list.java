
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode second = reverse(slow);
        ListNode copySecond = second;

        ListNode first = head;
        while (second != null) {
            if (first.val != second.val) {
                reverse(copySecond);
                return false;
            }
            second = second.next;
            first = first.next;
        }

        reverse(copySecond);
        return true;
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null, curr = head, next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
