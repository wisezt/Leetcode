import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTests {


    @Test
    void test01(){
        Solution solution = new Solution();

        ListNode expect = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4))))));
        String expectStr ="";
        while(expect != null){

            expectStr = expectStr +  expect.val;
            expect = expect.next;
        }

        ListNode fact = solution.mergeTwoLists(new ListNode(1, new ListNode(2, new ListNode(4))), new ListNode(1, new ListNode(3, new ListNode(4))));
        String factStr="";
        while(fact != null){

            factStr = factStr +  fact.val;
            fact = fact.next;
        }

        Assertions.assertEquals(expectStr,factStr, "Should be "  + expectStr);


    }
}
