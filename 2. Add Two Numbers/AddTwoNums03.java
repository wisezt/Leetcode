public class AddTwoNums03 {
    public static void main(String[] args) {

        Integer[] arr1 = { 5, 99999, 9, 9, 9, 9, 9, 99 };
        ListNode l1 = creatListNode(arr1);
        printLN(l1);

        Integer[] arr2 = { 5 };
        ListNode l2 = creatListNode(arr2);
        printLN(l2);

        ListNode result = addTwoNumbers(l1, l2);
        printLN(result);
    }

    private static void printLN(ListNode ln) {

        while (ln.next != null) {
            System.out.print(ln.val + "\t");
            ln = ln.next;
        }
        System.out.print(ln.val + "\t");
        System.out.println();
    }

    private static ListNode creatListNode(Integer[] arr) {
        ListNode head = new ListNode();
        ListNode cur = head;

        for (int i = 0; i < arr.length - 1; i++) {
            cur.val = arr[i];
            cur.next = new ListNode();
            cur = cur.next;
        }

        cur.val = arr[arr.length - 1];

        return head;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

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
