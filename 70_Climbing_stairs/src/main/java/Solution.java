import java.util.Map;

public class Solution<Static> {

    public int climbStairs(int n) {

        if (n == 2) {
            return 2;
        } else if (n == 1) {
            return 1;
        }

        return climbStairs(n - 1) + climbStairs(n - 2);

    }

    //*****************************************

    static Map<Integer, Integer> cache;

    public int climbStairs02(int n) {


        if (n == 2) {
            return 2;
        } else if (n == 1) {
            return 1;
        }

        int result = cache.containsKey(n) ? cache.get(n) : climbStairsWithCache(n - 1, cache) + climbStairsWithCache(n - 2, cache);

        cache.put(n, result);


        return result;

    }

    private int climbStairsWithCache(int n, Map<Integer, Integer> cache) {
        if (n == 2) {
            return 2;
        } else if (n == 1) {
            return 1;
        }

        int result = cache.containsKey(n) ? cache.get(n) : climbStairsWithCache(n - 1, cache) + climbStairsWithCache(n - 2, cache);
        cache.put(n, result);
        return result;

    }

    //**************************************

    public int climbStairs03(int n) {

        int[] stepsArr = new int[n + 1];

        stepsArr[1] = 1;

        if (n <= 1) {
            return 1;
        }


        stepsArr[2] = 2;


        for (int i = 3; i <= n; i++) {

            stepsArr[i] = stepsArr[i - 1] + stepsArr[i - 2];

        }

        return stepsArr[n];


    }
}

