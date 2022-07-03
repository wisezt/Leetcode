import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Solution03Tests {

    Solution03 solution;

    @BeforeEach
    void setupBeforeEach() {

        solution = new Solution03();

    }


    @Test
    void Test01() {
//        Solution solution = new Solution();


        System.out.println(solution.divide(10, 3));


    }

    @Test
    void Test02() {
//        Solution solution = new Solution();


        System.out.println(solution.divide(7, -3));


    }


    @Test
    void Test03() {
//        Solution solution = new Solution();


        System.out.println(solution.divide(55, -11));


    }

    @Test
    void Test04() {
//        Solution solution = new Solution();

        System.out.println(Integer.parseInt("003"));

    }

    @Test
    void Test06() {
//        Solution solution = new Solution();


        System.out.println(solution.divide(55, -33));


    }

    @Test
    void Test07() {
//        Solution solution = new Solution();

        int expect = 0;
        int fact = solution.divide(0, 1);

        System.out.println("fact: " + fact);

        Assertions.assertEquals(expect, fact, "Should be " + expect);


    }


    @Test
    void Test08() {
//        Solution solution = new Solution();

        int expect = 6;
        int fact = solution.divide(222, 33);

        System.out.println("fact: " + fact);

        Assertions.assertEquals(expect, fact, "Should be " + expect);


    }

    @Test
    void Test09() {
//        Solution solution = new Solution();

        int expect = 2147483647;
        int fact = solution.divide(-2147483648, -1);

        System.out.println("fact: " + fact);

        Assertions.assertEquals(expect, fact, "Should be " + expect);


    }

    @Test
    void Test11() {
//        Solution solution = new Solution();

        int expect = -2147483648;
        int fact = solution.divide(-2147483648, 1);

        System.out.println("fact: " + fact);

        Assertions.assertEquals(expect, fact, "Should be " + expect);


    }


    @Test
    void Test10() {
//        Solution solution = new Solution();

        int expect = 0;
        int fact = solution.divide(1, 2);

        System.out.println("fact: " + fact);

        Assertions.assertEquals(expect, fact, "Should be " + expect);


    }

    @Test
    void Test12() {
//        Solution solution = new Solution();

        int expect = 1073741823;
        int fact = solution.divide(2147483647,2);

        System.out.println("fact: " + fact);

        Assertions.assertEquals(expect, fact, "Should be " + expect);


    }


}
