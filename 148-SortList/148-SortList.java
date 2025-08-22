// Last updated: 8/22/2025, 11:40:56 PM
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
    public ListNode sortList(ListNode head) {
        // base case
        if (head == null || head.next == null) {
            return head;
        }

        // step 1: find mid
        ListNode mid = getMid(head);
        ListNode rightHead = mid.next;
        mid.next = null;

        // step 2: recursive sort
        ListNode newLeft = sortList(head);
        ListNode newRight = sortList(rightHead);

        // step 3: merge
        return merge(newLeft, newRight);
    }

    // helper to find mid node
    public ListNode getMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // merge two sorted lists
    public ListNode merge(ListNode head1, ListNode head2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while (head1 != null && head2 != null) {
            if (head1.val <= head2.val) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }

        // attach remaining nodes
        if (head1 != null) temp.next = head1;
        if (head2 != null) temp.next = head2;

        return dummy.next;
    }
}
