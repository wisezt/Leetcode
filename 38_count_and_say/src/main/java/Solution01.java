import java.util.List;

public class Solution01 implements Solution {

    public String countAndSay(int n) {


        String result = countAndSayStr("1", n);


        return result;
    }

    private String countAndSayStr(String s, int n) {

        String result = "";

//        println("s,n",s,n);


        if (1 == n) {
            return s;
        }

        n--;


        int count=1;
        for (int i = 0 ; i < s.length(); i++){
            if ( i + 1 < s.length()){
                if (s.charAt(i) ==  s.charAt(i+1)){
                    count++;
                }else {
                    result = result + count + s.charAt(i);
                    count = 1;
                }
            } else {
                result = result + count + s.charAt(i);
                count = 1;
            }



        }


//        System.out.println(result);
        return countAndSayStr(result
        ,n);
    }


    public static <T> void println(T t) {
        System.out.println(t);
    }

    public static <T> void println(String names, T... vals) {
        String[] strs = names.split(",");
        for (int i = 0; i < vals.length; i++) {
            System.out.print(strs[i] + ": " + vals[i] + "\t");
        }
        System.out.println();
    }
    public static <T> void printArr(T[] ts) {
        for (int i = 0; i < ts.length; i++) {
            System.out.printf("ts[%s]: %s\t", i, ts[i]);
        }
        System.out.println();
    }


    public static <T> void printList(List<T> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("list[%s]: %s\t", i, list.get(i));
        }
        System.out.println();
    }
}
