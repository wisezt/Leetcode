import java.util.HashMap;
import java.util.Map;

public class Solution01 implements Solution {

    public int uniquePaths(int m, int n) {


        Map<String, Integer> map;
        map = new HashMap<>();

        int result = uniquePathsCache(m, n, map);


        return result;

    }

    private int uniquePathsCache(int m, int n, Map<String, Integer> map) {

        if (m == 1 || n == 1) {
            return 1;
        }


        int tmpM = Math.min(m, n);
        int tmpN = Math.max(m, n);


        StringBuilder sb01 = new StringBuilder();
        sb01.append(tmpM - 1);
        sb01.append(" ");
        sb01.append(tmpN);
        String key1 = sb01.toString();


        StringBuilder sb02 = new StringBuilder();
        sb02.append(tmpM);
        sb02.append(" ");
        sb02.append(tmpN - 1);
        String key2 = sb02.toString();


        int result1 = map.containsKey(key1) ? map.get(key1) : uniquePathsCache(tmpM - 1, tmpN, map);
        map.put(key1, result1);

        int result2 = map.containsKey(key2) ? map.get(key2) : uniquePathsCache(tmpM, tmpN - 1, map);
        map.put(key2, result2);
        int result = result1 + result2;

        String key = tmpM + " " + tmpN;
        map.put(key, result);


        return result;


    }
}
