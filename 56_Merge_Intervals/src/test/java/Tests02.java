import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Tests02 {

    Solution solution;

    @BeforeEach
    void setup() {

        solution = new Solution02();
    }


    @Test
    void test01() {


        int[][] intss = new int[][]{
                new int[]{1, 3}
                , new int[]{2, 6}
                , new int[]{8, 10}
                , new int[]{15, 18}
        };



        intss = solution.merge(intss);


        System.out.println("\nPrinting the result:");
        for (int[] ints : intss) {
            for(int v: ints){
                System.out.printf("%s\t",v);
            }
            System.out.println();
        }

    }


    @Test
    void test02(){
        List<Integer> list = new ArrayList<>();
        System.out.println("Before: " + list );
        addNumsToList(list,1);
        System.out.println("After: "+ list);




    }

    private void addNumsToList(List<Integer> list, int i) {
        list.add(i);
        list = new ArrayList<>();
        list.add(2);
    }


    @Test
    void test03() {


        int[][] intss = new int[][]{
                new int[]{1, 4}
                , new int[]{4, 6}

        };



        intss = solution.merge(intss);


        System.out.println("\nPrinting the result:");
        for (int[] ints : intss) {
            for(int v: ints){
                System.out.printf("%s\t",v);
            }
            System.out.println();
        }

    }

    @Test
    void test04() {


        int[][] intss = new int[][]{
                new int[]{1, 4}
                , new int[]{0, 1}

        };



        intss = solution.merge(intss);


        System.out.println("\nPrinting the result:");
        for (int[] ints : intss) {
            for(int v: ints){
                System.out.printf("%s\t",v);
            }
            System.out.println();
        }

    }
}
