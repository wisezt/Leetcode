public class Solution01 {

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }


        ListNode result = new ListNode();
        result.next = head.next;


        ListNode preHead = new ListNode();
        preHead.next = head;


        while (preHead.next != null && preHead.next.next != null) {
            ListNode tmpA = preHead.next;
            ListNode tmpB = preHead.next.next;
            ListNode tmpC = preHead.next.next.next;


            preHead.next = tmpB;
            tmpB.next = tmpA;
            tmpA.next = tmpC;


            ListNode test = preHead.next;


            preHead = tmpA;



        }


        return result.next;
    }

}
