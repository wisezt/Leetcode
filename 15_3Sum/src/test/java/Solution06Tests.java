import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Solution06Tests {

    Solution06 solution;

    @BeforeEach
    void setupBeforeEach(){
        solution = new Solution06();
    }


    @Test
    void test01() {


        List<List<Integer>> result = solution.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
//        System.out.println(result);

//        Assertions.assertEquals("[[-1, -1, 2], [-1, 0, 1]]", (String)result );


        List<List<Integer>> expct = List.of(List.of(-1, -1, 2), List.of(-1, 0, 1));
//        List<List<Integer>> expct02 = List.of(  List.of(-1,-1,3),   List.of(-1,0,1));
        List<List<Integer>> expct03 = List.of(List.of(-1, 0, 1), List.of(-1, -1, 2));
        System.out.println(result);
        Assertions.assertIterableEquals(expct, result, "The result should be" + expct);
//        Assertions.assertIterableEquals(expct02, result, "The result should be" + expct);
//        Assertions.assertIterableEquals(expct03, result, "03: The result should be" + expct);


    }

    @Test
    void test02() {

        List<List<Integer>> result = solution.threeSum(new int[]{0, 0, 0});
//        System.out.println(result);

//        Assertions.assertEquals("[[-1, -1, 2], [-1, 0, 1]]", (String)result );


        List<List<Integer>> expct = List.of(List.of(0, 0, 0));
//        List<List<Integer>> expct02 = List.of(  List.of(-1,-1,3),   List.of(-1,0,1));
        List<List<Integer>> expct03 = List.of(List.of(-1, 0, 1), List.of(-1, -1, 2));

        Assertions.assertIterableEquals(expct, result, "The result should be" + expct);
//        Assertions.assertIterableEquals(expct02, result, "The result should be" + expct);
//        Assertions.assertIterableEquals(expct03, result, "03: The result should be" + expct);
        System.out.println(result);

    }

    @Test
    void test03() {

        List<List<Integer>> result = solution.threeSum(new int[]{-1, 0, 1});
//        System.out.println(result);

//        Assertions.assertEquals("[[-1, -1, 2], [-1, 0, 1]]", (String)result );


        List<List<Integer>> expct = List.of(List.of(-1, 0, 1));
//        List<List<Integer>> expct02 = List.of(  List.of(-1,-1,3),   List.of(-1,0,1));
        List<List<Integer>> expct03 = List.of(List.of(-1, 0, 1), List.of(-1, -1, 2));
        System.out.println(result);

        Assertions.assertIterableEquals(expct, result, "The result should be" + expct);
//        Assertions.assertIterableEquals(expct02, result, "The result should be" + expct);
//        Assertions.assertIterableEquals(expct03, result, "03: The result should be" + expct);
        System.out.println(result);

    }


    @Test
    void test04() {



        String[] strArr = PropertyUtils.getPropery("testArray").split(",");
        int arrLength = strArr.length;
        int[] intArr = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
//            System.out.printf("strArr[%s]: \'%s\'\tintArr[%s]: \'%s\'\n", i, strArr[i],i, intArr[i]);
        }


        Solution03 solution = new Solution03();

        List<List<Integer>> result = solution.threeSum(intArr);


        System.out.println(result);

    }

    @Test
    void test05() {

        Solution03 solution = new Solution03();
        List<List<Integer>> result = solution.threeSum(new int[]{0,0});

        List<List<Integer>> expct = List.of();

        System.out.println(result);

        Assertions.assertIterableEquals(expct, result, "The result should be" + expct);


    }


    @Test
    void test06() {


        List<List<Integer>> result = solution.threeSum(new int[]{-1,0,1,0});

        List<List<Integer>> expct =  List.of( List.of(-1, 0, 1) );

        System.out.println(result);

        Assertions.assertIterableEquals(expct, result, "The result should be" + expct);


    }

    @Test
    void test07() {


        List<List<Integer>> result = solution.threeSum(new int[]{
                -4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6});

        List<List<Integer>> expct =  List.of( List.of(-4,-2,6),List.of(-4,0,4),List.of(-4,1,3),List.of(-4,2,2),List.of(-2,-2,4),List.of(-2,0,2));

        System.out.println(result);

        Assertions.assertIterableEquals(expct, result, "The result should be" + expct);


    }

    @Test
    void test08() {


        List<List<Integer>> result = solution.threeSum(new int[]{
                1,1,-2});

        List<List<Integer>> expct =  List.of( List.of(-2,1,1));

        System.out.println(result);

        Assertions.assertIterableEquals(expct, result, "The result should be" + expct);


    }


    @Test
    void test09() {


        List<List<Integer>> result = solution.threeSum(new int[]{
                -4,-2,1,-5,-4,-4,4,-2,0,4,0,-2,3,1,-5,0});

        List<List<Integer>> expct =  List.of( List.of(-5,1,4),List.of(-4,0,4),List.of(-4,1,3),List.of(-2,-2,4),List.of(-2,1,1),List.of(0,0,0));

        System.out.println(result);

        Assertions.assertIterableEquals(expct, result, "The result should be" + expct);


    }


}
