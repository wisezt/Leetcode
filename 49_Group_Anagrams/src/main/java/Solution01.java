import java.util.*;

public class Solution01 implements Solution{

    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();



        map = getGroupAnagrams(map, strs);



        for (Map.Entry entry : map.entrySet()){

            System.out.print(entry.getKey() + "\t");
            result.add((List<String>) entry.getValue());
        }




        return result;
    }

    private Map<String, List<String>> getGroupAnagrams(Map<String, List<String>> map, String[] strs) {

        char[] chars;
        for (String str: strs){
            chars = str.toCharArray();
            Arrays.sort(chars);
            String tmp = new String(chars);

            if (map.containsKey(tmp)){
                map.get(tmp).add(str);
            }else{
                map.put(tmp, new ArrayList<>());
                map.get(tmp).add(str);
            }

        }

        return map;

    }
}
