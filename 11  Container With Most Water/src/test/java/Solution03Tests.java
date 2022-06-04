import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Solution03Tests {
    Solution03 solution;
    int[] intArr;
    int expect;



    @BeforeEach
    void  setupBeforeAll(){
        solution = new Solution03();
        String[] strArr = PropertiesUtil.getPropery("testArr").split(", ");
        int arrLength = strArr.length;
        intArr = new int[arrLength];

        for(int i = 0; i < arrLength; i++){
            intArr[i] = Integer.parseInt(strArr[i]);
//            System.out.printf("strArr[%s]: \'%s\'\tintArr[%s]: \'%s\'\n", i, strArr[i],i, intArr[i]);
        }

        expect = 402471897;

    }

    @Test
    void test01() {



        long startTime = System.currentTimeMillis();
        int fact = solution.maxArea(intArr);
        long endTime = System.currentTimeMillis();
        long costTime = endTime - startTime;
        System.out.println("fact: " + fact);
        System.out.println("cost time: " + costTime);
        Assertions.assertEquals( expect, fact, "The result should be " + expect);

    }

    @Test
    void test02() {


        intArr = new int[]{1,1};
        expect = 1;

        long startTime = System.currentTimeMillis();
        int fact = solution.maxArea(intArr);

        long endTime = System.currentTimeMillis();
        long costTime = endTime - startTime;
        System.out.println("fact: " + fact);
        System.out.println("cost time: " + costTime);
        Assertions.assertEquals( expect, fact, "The result should be " + expect);

    }


    @Test
    void test03() {


        intArr = new int[]{1,2};
        expect = 1;

        long startTime = System.currentTimeMillis();
        int fact = solution.maxArea(intArr);

        long endTime = System.currentTimeMillis();
        long costTime = endTime - startTime;
        System.out.println("fact: " + fact);
        System.out.println("cost time: " + costTime);
        Assertions.assertEquals( expect, fact, "The result should be " + expect);

    }

    @Test
    void test04() {


        intArr = new int[]{4,6,4,4,6,2,6,7,11,2};
        expect = 42;

        long startTime = System.currentTimeMillis();
        int fact = solution.maxArea(intArr);

        long endTime = System.currentTimeMillis();
        long costTime = endTime - startTime;
        System.out.println("fact: " + fact);
        System.out.println("cost time: " + costTime);
        Assertions.assertEquals( expect, fact, "The result should be " + expect);

    }

    @Test
    void test05() {


        intArr = new int[]{2,1};
        expect = 1;

        long startTime = System.currentTimeMillis();
        int fact = solution.maxArea(intArr);

        long endTime = System.currentTimeMillis();
        long costTime = endTime - startTime;
        System.out.println("fact: " + fact);
        System.out.println("cost time: " + costTime);
        Assertions.assertEquals( expect, fact, "The result should be " + expect);

    }


}
