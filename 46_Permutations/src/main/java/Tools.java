import java.util.List;

public class Tools {


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
