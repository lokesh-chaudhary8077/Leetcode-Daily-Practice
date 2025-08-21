// Last updated: 8/21/2025, 9:03:25 PM
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
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        if(n == size){
            head = head.next;
            return head;
        }
        int i = 1;
        ListNode prev = head;
        int toNode = size - n;
        while(i < toNode){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
    }
}