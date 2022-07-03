import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;


public class Tests {

    String name = "Ting Zheng";
    int weight;


    @Test
    void Test01() {

        Apple apple = new Apple();
//
//        Field[] fields = apple.getClass().getDeclaredFields();
//        System.out.println("Test!");
//        for (Field field : fields) {
//            System.out.println(field.getName());
//        }

        int a = 10;

        int b = 20;
        int c = 3;

        System.out.println(a);
        a = a >> 2 ;
        System.out.println(a);
        b = b >> 2;
        System.out.println(b);

//        println("a b c ", a, b,c);

//        printArr(new String[]{"a", "b"}, 1,2);

//        printSp("a,b,c",a,b,c);
//
//        Tools.PrintingMapPut("a",a);
//        Tools.printMap("a","a");
//        Tools.printMap("a","a","a");
//    }


    }


//    public static <T> void printFieldNames(Object obj, T... foos) {
//        System.out.println("Executed");
//        List<T> fooList = List.of(foos);
//        for (T o: fooList){
//            System.out.println(o);
//        }
//
////        System.out.println(obj.getClass().getName());
//
//        for (Field field : obj.getClass().getDeclaredFields()) {
//            System.out.println("field.getName: " + field.getName());
//            System.out.println("field: " + field);
//
//            for (T o : fooList) {
//                System.out.println("o: " + o);
//                try {
//                    if (fooList.contains(field.get(o))) {
//                        System.out.print(field.getName() + ": " + o + "\t");
//                    }
//                } catch (Exception e) {
//
//                    e.printStackTrace();
//
//                }
//
//            }
//
//        }
//    }


}
