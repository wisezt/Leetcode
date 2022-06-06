public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode preHead = new ListNode();
        preHead.next = head;
        ListNode listNode = preHead;


        for (int i = 0; i < n - 1; i++) {
            head = head.next;
        }

        while (head != null && head.next != null) {

            head = head.next;
            listNode = listNode.next;

        }

        if (listNode != null) {
            listNode.next = (listNode.next == null) ? null : listNode.next.next;
        }


        return preHead.next;
    }
}
