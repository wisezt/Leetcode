import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    int n;

    public List<String> generateParenthesis(int n) {
        this.n = n;
        List<String> result = new ArrayList<>();
        Map<String, Integer[]> resultMap = new HashMap<>();
        resultMap.put("", new Integer[]{0,0});


        for (int i = 0; i < 2 * n; i++) {
            resultMap = addParenthesis(resultMap);
        }


        for (Map.Entry entry : resultMap.entrySet()) {

            result.add((String) entry.getKey());

        }


        return result;


    }

    private Map<String, Integer[]> addParenthesis(Map<String, Integer[]> resultMap) {
        Map<String, Integer[]> result = new HashMap<>();


        for (Map.Entry entry : resultMap.entrySet()) {


            System.out.println(entry.getKey());

            Integer[] IntArr = (Integer[]) entry.getValue();


            // Integer[] IntArr2 = (Integer[]) entry.getValue();
            // Integer countB2 =  IntArr2[1];
            // Integer countB1 =  IntArr2[0];

            Integer countOpen = IntArr[0];

            Integer countClose = IntArr[1];

            if (countOpen <n) {
                int newCountOpen = countOpen+ 1;

                Integer[] newArr = new Integer[]{
                        newCountOpen,countClose
                };

                StringBuilder sb1 = new StringBuilder((String) entry.getKey());
                sb1.append("(");
                result.put(sb1.toString(), newArr);
//                System.out.println("sb1.toString(): " + sb1.toString());
            }

//            Integer count2 = ((Integer[]) entry.getValue())[1];

            if (countOpen > countClose && countOpen >=1 ) {
                countClose++;

                Integer[] newArr = new Integer[]{
                        countOpen,countClose
                };

                StringBuilder sb2 = new StringBuilder((String) entry.getKey());
                sb2.append(")");
                result.put(sb2.toString(), newArr);
//                System.out.println("sb2.toString(): " + sb2.toString() + "\n");
            }


        }


        return result;


    }


}
