import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Solution01Tests {

    Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution01();
    }


    @Test
    void Test01() throws Exception {


        int[] intArr = new int[]{4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        int fact = solution.search(intArr,target);
        int expect = 4;

        Assertions.assertEquals(expect,fact,"The result should be: " + expect);

    }

    @Test
    void Test02() throws Exception {


        int[] intArr = new int[]{4, 5, 6, 7, 0, 1, 2};
        int target = 3;

        int fact = solution.search(intArr,target);
        int expect = -1;

        Assertions.assertEquals(fact,expect,"The result should be: " + expect);

    }


    @Test
    void Test03() throws Exception {


        int[] intArr = new int[]{1,3};
        int target = 2;

        int fact = solution.search(intArr,target);
        int expect = -1;

        Assertions.assertEquals(fact,expect,"The result should be: " + expect);

    }

    @Test
    void Test04() throws Exception {


        int[] intArr = new int[]{1,3};
        int target = 1;

        int fact = solution.search(intArr,target);
        int expect = 0;

        Assertions.assertEquals(fact,expect,"The result should be: " + expect);

    }

}
