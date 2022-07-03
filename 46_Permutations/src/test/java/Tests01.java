import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class Tests01 {

    Solution solution;

    @BeforeEach
    void setup(){
        solution = new Solution01();
    }

    @Test
    public void test01(){

        int[] nums = new int[]{1,2,3};

        int count = 1;
        for (List<Integer> list : solution.permute(nums)){
            Tools.println(count + ":");
            count++;
            Tools.printList(list);
            Tools.println("");
        }



    }



    @Test
    public void test012(){




        List<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(2);
        list01.add(3);

        Tools.println("list01:");
        Tools.println(list01);

        List<Integer> list02 = new ArrayList<>(list01);
        list02.add(4);
        list02.remove(0);
        Tools.println("list02:");
        Tools.println(list02);

        Tools.println("list01:");
        Tools.println(list01);









    }




}
