import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class tests01 {

    Solution solution;

    @BeforeEach
    void setup(){
        solution = new Solution01();
    }



    @Test
    void test01(){
        System.out.println( solution.countAndSay(4));


    }

    @Test
    void test02(){
        System.out.println( solution.countAndSay(3));


    }
}
