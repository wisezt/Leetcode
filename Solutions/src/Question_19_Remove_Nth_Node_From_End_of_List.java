// faster than 100%



/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Question_19_Remove_Nth_Node_From_End_of_List {


    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode theNode = new ListNode(0), tempNode = head, theNewHead;


        for (int i = 0 ; i < n ; i++){
            tempNode = tempNode.next;
        }

        theNode.next = head;
        theNewHead = theNode;

        while(tempNode != null){

            tempNode = tempNode.next;
            theNode = theNode.next;



        }


        theNode.next = theNode.next.next;



        return theNewHead.next;




    }



}
