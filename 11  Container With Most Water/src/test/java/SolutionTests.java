import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTests {

    @Test
    void test01(){
        Solution solution = new Solution();

        int expect = 49;
        int fact = solution.maxArea(new int[]{1,8,6,2,5,4,8,3,7});

        Assertions.assertEquals( expect, fact, "The test01 result should be " + expect);

    }


}
