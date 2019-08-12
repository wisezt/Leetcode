//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
//
//        You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//
//        Example:
//
//        Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//        Output: 7 -> 0 -> 8
//        Explanation: 342 + 465 = 807.
//


public class Question_2_AddTwoNumbers {

    public static void main(String[] strings) {


        Question_2_AddTwoNumbers test = new Question_2_AddTwoNumbers();

        ListNode ln01 = test.new ListNode(9);
        ListNode head01 = ln01;
        ln01.next = test.new ListNode(2);
        ln01 = ln01.next;
        ln01.next = test.new ListNode(2);
        ln01 = ln01.next;
        ln01.next = test.new ListNode(4);
        ln01 = ln01.next;


        ListNode ln02 = test.new ListNode(2);
        ListNode head02 = ln02;
        ln02.next = test.new ListNode(3);
        ln02 = ln02.next;
        ln02.next = test.new ListNode(5);
        ln02 = ln02.next;
        ln02.next = test.new ListNode(4);
        ln01 = ln02.next;


        test.AddTwoNumbers(head01, head02);


    }


    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    public ListNode AddTwoNumbers(ListNode l01, ListNode l02) {
        ListNode result = new ListNode(0);
        ListNode p = l01, q = l02, r = result;
        ListNode carry = result;

        int sum = 0, module;


        while (p != null || q != null) {
            System.out.println("result.val: " + result.val);
            System.out.println("carry.val: " + carry.val);
            sum += (p != null) ? p.val : 0;
            sum += (q != null) ? q.val : 0;

            module = sum % 10;
            r.val = module;


            if (p != null) {
                p = p.next;

            }
            if (q != null) {
                q = q.next;

            }
            sum = (sum - module) / 10;
            if (p != null || q != null || sum > 0) {

                System.out.println("sum: " + sum);

                r.next = new ListNode(sum);
                r = r.next;

            }


        }

        while (carry != null) {
            System.out.println("carry: " + carry.val);
            carry = carry.next;
        }


        return result;
    }
}
