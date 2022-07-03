import java.util.HashMap;
import java.util.Map;

public class Tools {

    static Map<Object, Object> printingMap = new HashMap<>();


//    static <T> void println(String name, T... variables) {
//
//        System.out.print(name + ": ");
//        for (T v : variables) {
//            System.out.print(v + "\t");
//        }
//
//        System.out.println();
//
//
//
//
//    }

    static <T> void println(String names, T... vals) {
        String[] strs = names.split(",");

        for (int i = 0; i < vals.length; i++){
            System.out.print(strs[i] + ": " +vals[i] + "\t");
        }

        System.out.println();


    }

    static <K,V> void printingMapPut(K k, V v){
        printingMap.put(k,v);
        System.out.print("Put "+k + ": " + printingMap.get(k) +" into PringtingMap\n");

    }


    static <K> void printMap(K k){
        System.out.print(k + ": " + printingMap.get(k) +"\t");
        System.out.print(k + ": " + printingMap.get(k) +"\t");
        System.out.println();
    }

    static <K> void printMap(K... ks){


        for (K k: ks){
            System.out.print(k + ": " + printingMap.get(k) +"\t");
        }

        System.out.println();



    }




}
