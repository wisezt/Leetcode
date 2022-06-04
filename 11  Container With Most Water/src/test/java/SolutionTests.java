import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTests {

    @Test
    void test01() {
        Solution solution = new Solution();

        int expect = 49;
        int fact = solution.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});

        Assertions.assertEquals(expect, fact, "The test01 result should be " + expect);

    }


    @Test
    void test02() {

        Solution solution = new Solution();

        int expect = 49;
        String[] strArr = PropertiesUtil.getPropery("testArr").split(", ");
        int arrLength = strArr.length;
        int[] intArr = new int[arrLength];

        for(int i = 0; i < arrLength; i++){
            intArr[i] = Integer.parseInt(strArr[i]);
//            System.out.printf("strArr[%s]: \'%s\'\tintArr[%s]: \'%s\'\n", i, strArr[i],i, intArr[i]);
        }

        long startTime = System.currentTimeMillis();
        int fact = solution.maxArea(intArr);

        long endTime = System.currentTimeMillis();
        long costTime = endTime - startTime;
        System.out.println("fact: " + fact);
        System.out.println("cost time: " + costTime);
//        Assertions.assertEquals( expect, fact, "The test01 result should be " + expect);

    }


//    @Test
//    void test03{
//        String[] strArr = new String[]{"123","456','55555'};
//
//    }


    @Test
    void test03() {

        Solution02 solution = new Solution02();

        int expect = 49;
        String[] strArr = PropertiesUtil.getPropery("testArr").split(", ");
        int arrLength = strArr.length;
        int[] intArr = new int[arrLength];

        for(int i = 0; i < arrLength; i++){
            intArr[i] = Integer.parseInt(strArr[i]);
//            System.out.printf("strArr[%s]: \'%s\'\tintArr[%s]: \'%s\'\n", i, strArr[i],i, intArr[i]);
        }

        long startTime = System.currentTimeMillis();
        int fact = solution.maxArea(intArr);

        long endTime = System.currentTimeMillis();
        long costTime = endTime - startTime;
        System.out.println("fact: " + fact);
        System.out.println("cost time: " + costTime);
        Assertions.assertEquals( 402471897, fact, "The result should be " + expect);

    }

}
