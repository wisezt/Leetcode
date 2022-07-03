public class Solution {

    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode preHead = new ListNode();
        ListNode test = new ListNode();
        preHead.next = head.next;
        ListNode preHead2 = new ListNode();
        preHead2.next = head;
        ListNode tmp1 = new ListNode();
        ListNode tmp2 = new ListNode();
        ListNode tmp3 = new ListNode();

        int count = 0;
        while (preHead2.next != null && preHead2.next.next != null) {
            test = preHead2.next;
            while (test != null) {
                System.out.print("**" + test.val + "\t");
                test = test.next;
            }
            System.out.println();
//            test = preHead.next;
//            while(test != null){
//                System.out.print("---"+test.val+ "\t");
//                test = test.next;
//            }
            System.out.println();
            count++;
            tmp1 = preHead2.next;
            tmp2 = preHead2.next.next;
            tmp3 = preHead2.next.next.next;


//            System.out.println("///" + tmp3.val);

            tmp1.next = tmp3;
            tmp2.next = tmp1;
            System.out.println("///" + tmp3.val);

            preHead2 = tmp1;
            test = preHead.next;
            while (test != null) {
                System.out.print("---" + test.val + "\t");
                test = test.next;
            }
//            System.out.println("///" + tmp3.next.val);
            System.out.println();


        }


        System.out.println();

        return preHead.next;


    }


}
