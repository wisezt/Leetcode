import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Tests02 {

    Solution solution;

    @BeforeEach
    void setup(){
        solution = new Solution02();
    }

    @Test
    public void test01(){

        int[] nums = new int[]{1,2,3};

//        int count = 1;
//        for (List<Integer> list : solution.permute(nums)){
//            Tools.println(count + ":");
//            count++;
//            Tools.printList(list);
//            Tools.println("");
//        }

        Tools.println(solution.permute(nums));

    }


    @Test
    public void test02(){

        int[] nums = new int[]{1,2,3,4,5};

//        int count = 1;
//        for (List<Integer> list : solution.permute(nums)){
//            Tools.println(count + ":");
//            count++;
//            Tools.printList(list);
//            Tools.println("");
//        }

        Tools.println(solution.permute(nums));

    }
}
