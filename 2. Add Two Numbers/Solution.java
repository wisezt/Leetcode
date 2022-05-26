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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    
        ListNode result = new ListNode();
        ListNode resultHead = result;
        int sum;
        int onePlus = 0;
        // Part 1: Both ListNode have value
        while (l1.next != null && l2.next != null) {

            sum = l1.val + l2.val + onePlus;

            if (sum > 9) {
                onePlus = 1;
            } else {
                onePlus = 0;
            }

            result.val = sum % 10;
            l1 = l1.next;
            l2 = l2.next;
            result.next = new ListNode();
            result = result.next;

        }

        // Part 2: At least, one of the ListNode doesn't have next node.
        sum = l1.val + l2.val + onePlus;
        result.val = sum % 10;

        if (l1.next == null) {
            result.next = l2.next;
        } else {
            result.next = l1.next;
        }

        if (sum > 9) {
            onePlus = 1;
            if (result.next == null) result.next = new ListNode();
            result = result.next;
        } else {
            onePlus = 0;
        }

        while (result.next != null) {
            sum = result.val + onePlus;

            if (sum > 9) {
                onePlus = 1;
            } else {
                onePlus = 0;
            }

            result.val = sum % 10;
            result = result.next;

        }

        // Part 3:  Last Node
        sum = result.val + onePlus;
        result.val = sum % 10;

        if (sum > 9) {
            onePlus = 1;
            result.next = new ListNode();
            result.next.val = 1;
        }

        return resultHead;
    }
}