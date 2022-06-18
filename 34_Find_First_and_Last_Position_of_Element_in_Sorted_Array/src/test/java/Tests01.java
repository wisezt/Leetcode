import com.leetcode.Solution;
import com.leetcode.Solution01;
import com.leetcode.Tools;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Tests01 {

    Solution solution;

    @BeforeEach
    void setupBeforeEach(){
        solution = new Solution01();
    }



    @Test
    void test01(){

        int[] intArr = new int[]{1,2,2,3,3,3,4,4,4,4};




//        System.out.println(Tools.searchLeft(intArr, 4, 0, 8));



    }



    @Test
    void test02(){

        int[] intArr = new int[]{1};




//        System.out.println(Tools.searchLeft(intArr, 4, 0, 0));



    }


    @Test
    void test03(){

        int[] intArr = new int[]{5,7,7,8,8,10};





        Integer[] integers = Arrays.stream(solution.searchRange(intArr, 8)).boxed().toArray(Integer[]::new);



        Tools.printArr(integers);
        System.out.println();



    }

    @Test
    void test04(){

        int[] intArr = new int[]{1,4};





        Integer[] integers = Arrays.stream(solution.searchRange(intArr, 4)).boxed().toArray(Integer[]::new);



        Tools.printArr(integers);
        System.out.println();



    }

}
