import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SolutionTests {
    Solution solution;
    @BeforeEach
    void setupBeforeEach(){
         solution = new Solution();

    }


    @Test
    void test01(){

        ListNode head = new ListNode(1, new ListNode(2,new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode expect = new ListNode(1, new ListNode(2,new ListNode(3, new ListNode(5))));
        while (expect != null){
            System.out.printf(expect.val+"\t");
            expect = expect.next;
        }

        System.out.println();

        ListNode result = solution.removeNthFromEnd(head, 2);
        while (result != null){
            System.out.printf(result.val+"\t");
            result = result.next;
        }

        Assertions.assertEquals(expect, result, "should be " + expect);

    }
}
