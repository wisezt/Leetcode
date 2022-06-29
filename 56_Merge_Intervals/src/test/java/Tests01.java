import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Tests01 {

    Solution solution;

    @BeforeEach
    void setup() {

        solution = new Solution01();
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

}
