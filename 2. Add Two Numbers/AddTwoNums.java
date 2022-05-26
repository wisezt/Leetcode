public class AddTwoNums {
    public static void main(String[] args) {

        Integer[] arr1 = { 2, 4, 3 };
        ListNode l1 = creatListNode(arr1);
        printLN(l1);

        Integer[] arr2 = { 5, 6, 4 };
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
        System.out.println();
    }

    private static ListNode creatListNode(Integer[] arr) {
        ListNode head = new ListNode();
        ListNode cur = head;

        for (int e : arr) {
            cur.val = e;
            cur.next = new ListNode();
            cur = cur.next;
        }

        
        return head;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode cur1 = l1;
        if (cur1.next == null)
            return null;
        int i = 0;
        int sum1 = 0;
        while (cur1.next != null) {
            sum1 += cur1.val * Math.pow(10, i);
            System.out.println("sum1: " + sum1);
            i++;
            cur1 = cur1.next;
        }

        ListNode cur2 = l2;
        if (cur2.next == null)
            return null;
        int j = 0;
        int sum2 = 0;
        while (cur2.next != null) {
            sum2 += cur2.val * Math.pow(10, j);
            System.out.println("sum2: " + sum2);
            j++;
            cur2 = cur2.next;
        }

        int value = sum1 + sum2;

        System.out.println(value);
        ListNode head = new ListNode();
        ListNode cur = head;
       
        while ( value > 0 ) {
            int rd = value % 10;
            cur.val = value % 10;
            cur.next = new ListNode();
            cur = cur.next;
            value = (value -rd)/10;
        }

        return head;

    }

}
