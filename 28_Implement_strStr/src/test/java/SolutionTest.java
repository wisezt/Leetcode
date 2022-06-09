import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    void Test01(){


        Solution solution = new Solution();

        System.out.print(solution.strStr("Hello", "ll"));


    }

    @Test
    void Test02(){


        Solution solution = new Solution();

        System.out.print(solution.strStr("aaa", "aaa"));


    }

    @Test
    void Test03(){


        Solution solution = new Solution();

        System.out.print(solution.strStr(
                "mississippi", "issip"));


    }

    @Test
    void Test04(){


        Solution solution = new Solution();

        System.out.print(solution.strStr(
                "mississippi", "pi"));


    }

    @Test
    void Test05(){


        Solution solution = new Solution();

        System.out.print(solution.strStr(
                "mississippi", "sippia"));


    }



}
