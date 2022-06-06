import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SolutionTests {


    @Test
    void test01(){
        Solution solution = new Solution();

        List<String> expect = List.of("ad","ae","af","bd","be","bf","cd","ce","cf");
//        System.out.println(solution.letterCombinations("23"));
        Assertions.assertIterableEquals(expect,solution.letterCombinations("23"), "Should be " + expect);

    }


}
