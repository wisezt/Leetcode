import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tests01 {



    @Test
    void test01(){

        Map<Integer[], Integer> map = new HashMap<>();
        Integer[] integers01 = new Integer[]{1,2};
        Integer[] integers02 = new Integer[]{1,2};



        map.put(integers01, 10);

        if (map.containsKey(integers01)){

            System.out.println(map.get(integers01));
            System.out.println(map.get(integers02));
        }



        List<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(2);


        List<Integer> list02 = new ArrayList<>();
        list02.add(1);
        list02.add(2);

        Map<List<Integer>, Integer> map02 = new HashMap<>();

        map02.put(list01, 10);


        if (map.containsKey(list02)){
            System.out.println(map.get(list01));
            System.out.println(map.get(list02));
        }



    }

    @Test
    void test02(){
        Solution solution = new Solution03();

        System.out.println(solution.uniquePaths(3,7));

    }

    @Test
    void test03(){
        Solution solution = new Solution03();

        System.out.println(solution.uniquePaths(3,2));

    }

    @Test
    void test04(){
        Solution solution = new Solution03();

        System.out.println(solution.uniquePaths(3,3));

    }

    @Test
    void test05(){
        Solution solution = new Solution03();

        System.out.println(solution.uniquePaths(6,2));

    }




}
