public class Question_21_Merge_Two_Sorted_Lists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode theHead = new ListNode(0);
        ListNode result = theHead;


        while(l1 != null || l2 != null){

            if ( l1 == null ){
                // theHead.next = new ListNode(l2.val);
                // theHead = theHead.next;
                // l2 = l2.next;
                // continue;

                while (l2 != null){
                    theHead.next = new ListNode(l2.val);
                    theHead = theHead.next;
                    l2 = l2.next;
                }

                break;


            }

            if ( l2 == null ){
                // theHead.next = new ListNode(l1.val);
                // theHead = theHead.next;
                // l1 = l1.next;
                // continue;

                while (l1 != null){
                    theHead.next = new ListNode(l1.val);
                    theHead = theHead.next;
                    l1 = l1.next;
                }

                break;


            }

            if ( l1.val < l2.val){
                theHead.next = new ListNode(l1.val);
                theHead = theHead.next;
                l1 = l1.next;
                continue;


            }

            if ( l1.val > l2.val){
                theHead.next = new ListNode(l2.val);
                theHead = theHead.next;
                l2 = l2.next;
                continue;


            }

            if ( l1.val == l2.val){
                theHead.next = new ListNode(l1.val);
                theHead = theHead.next;
                l1 = l1.next;

                theHead.next = new ListNode(l2.val);
                theHead = theHead.next;
                l2 = l2.next;
                continue;


            }












//             val1 = -1;
//             val2 = -1;

//             if ( l1 != null) {
//                 val1 = l1.val;

//                 l1 = l1.next;

//             }

//             if ( l2 != null ){
//                 val2 = l2.val;

//                 l2 = l2.next;
//             }


//             if ( val1 == -1 ){
//                 val = val2;
//             } else if ( val2 == -1){
//                 val = val1;
//             } else if ( val1 < val2 ){
//                  theHead.next = new ListNode(val1);
//                 theHead = theHead.next;
//                 val = val2;

//             } else if ( val1 > val2){
//                 theHead.next = new ListNode(val2);
//                 theHead = theHead.next;
//                 val = val1;

//             } else if ( val1 == val2){
//                 val = val1;
//                 theHead.next = new ListNode(val1);
//                 theHead = theHead.next;
//             }

//                 theHead.next = new ListNode(val);
//                 theHead = theHead.next;

        }

        result = result.next;

        return result;

    }






}
