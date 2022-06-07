public class Solution {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {


        ListNode result = new ListNode();

        ListNode head = result;

//        result = result.next;

        if (list1 ==null){
            result.next = list2;
        } else if(list2 == null){
            result.next = list1;
        }


        while (list1 != null && list2 != null) {

//            System.out.printf("list1.val: %s\tlist2.val: %s\tresult.val: %s\n",list1.val, list2.val,result.val);

            if (list1.val <= list2.val) {
                result.next = list1;
                result = result.next;
                if (list1.next != null) {
                    list1 = list1.next;
                } else {
                    result.next = list2;
                    break;
                }

            } else {
                result.next = list2;
                result = result.next;
                if (list2.next != null) {
                    list2 = list2.next;
                } else {
                    result.next = list1;
                    break;
                }

            }
//            System.out.printf("list1.val: %s\tlist2.val: %s\tresult.val: %s\n\n",list1.val, list2.val,result.val);

        }


        return head.next;
    }
}
