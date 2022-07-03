import org.junit.jupiter.api.Test;

public class SolutionTest {


    @Test
    void Test01(){
        Solution solution = new Solution();
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));

        ListNode result = solution.swapPairs(listNode);

        while(result != null){
            System.out.print(result.val+ "\t");
            result = result.next;
        }



    }

}
