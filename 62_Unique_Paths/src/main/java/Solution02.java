import java.util.HashMap;
import java.util.Map;

public class Solution02 implements Solution {

    public int uniquePaths(int m, int n) {


        int[][] ints = new int[m + 1][n + 1];


        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {

                ints[i][j] = -1;

            }
        }


        int result = uniquePathsCache(m, n, ints);


        return result;

    }

    private int uniquePathsCache(int m, int n, int[][] ints) {

        if (m == 1 || n == 1) {
            return 1;
        }


        int tmpM = Math.min(m, n);
        int tmpN = Math.max(m, n);


        int result1 = (ints[tmpM - 1][tmpN] != -1) ? ints[tmpM - 1][tmpN] : uniquePathsCache(tmpM - 1, tmpN, ints);
        ints[tmpM - 1][tmpN] = result1;

        int result2 = (ints[tmpM][tmpN - 1] != -1) ? ints[tmpM][tmpN - 1] : uniquePathsCache(tmpM, tmpN - 1, ints);
        ints[tmpM][tmpN - 1] = result2;

        int result = (ints[tmpM][tmpN - 1] != -1) ? result1 + result2 : uniquePathsCache(tmpM, tmpN, ints);


        return result;


    }
}
