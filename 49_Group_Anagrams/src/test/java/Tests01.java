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
        String[] strs = {"eat","tea","tan","ate","nat","bat"};




        solution.groupAnagrams(strs);


    }


    @Test
    void test02() {



    }



}
