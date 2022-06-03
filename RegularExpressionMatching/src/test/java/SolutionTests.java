import com.regularExpressionMatching.Solution;
import com.sun.nio.sctp.Association;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTests {



    @Test
    void testEquals(){

        Solution solution = new Solution();

        boolean expect = true;

        Assertions.assertEquals(expect, solution.isMatch("aaabbbsssccdd",".*dd"));
        Assertions.assertEquals(expect, solution.isMatch("aaabbbsssccdd",".*dd*"));
        Assertions.assertEquals(expect, solution.isMatch("aaabbbsssccdd",".*a*b*d*"));
        Assertions.assertEquals(expect, solution.isMatch("aaabbbsssccdd",".aaaab*d*"));

    }
}
