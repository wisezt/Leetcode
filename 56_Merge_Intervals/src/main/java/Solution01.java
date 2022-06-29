import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution01 implements Solution {

    public int[][] merge(int[][] intervals) {

        List<int[]> list = new ArrayList<>();


        if (intervals.length == 1) {
            return intervals;
        }

        int[] intArr01 = intervals[0];
        int[] intArr02;
        int[] tmpArr = new int[2];
        boolean isAdded = false;
        for (int i = 1; i < intervals.length; i++) {

            // update intArr02
            intArr02 = intervals[i];


            System.out.printf("i:%s\tintArr01: %s %s\tintArr02: %s %s\t\n", i, intArr01[0], intArr01[1], intArr02[0], intArr02[1]);


            if (intArr01[1] < intArr02[0]) {

                // not merge
//                list.add(Arrays.stream(intArr01).boxed().collect(Collectors.toList()));
//                list.add(Arrays.stream(intArr02).boxed().collect(Collectors.toList()));
                list.add(intArr01);
//                list.add(intArr02);

                // update intArr01
                intArr01 = intArr02;

//                i++;

            } else {

                // merge
//
                int[] tmpInts = new int[2];
                if (intArr01[0] <= intArr02[0]) {
                    if (intArr01[1] <= intArr02[1]) {

                        tmpInts = new int[]{intArr01[0], intArr02[1]};
                        list.add(tmpInts);

                    } else if (intArr01[1] >= intArr02[1]) {

                        tmpInts = new int[]{intArr01[0], intArr01[1]};
                        list.add(tmpInts);
                    } else {
                        System.out.println("Something is wrong!");
                    }


                } else {
                    if (intArr01[1] >= intArr02[1]) {
                        tmpInts = new int[]{intArr02[0], intArr01[1]};
                        list.add(tmpInts);
                    } else if (intArr01[1] <= intArr02[1]) {
                        tmpInts = new int[]{intArr02[0], intArr02[1]};
                        list.add(tmpInts);
                    } else {
                        System.out.println("Something is wrong!");
                    }
                }




                // update intArr01
                intArr01 = tmpInts;

//                i++;
            }

            System.out.println(intArr01[0]+ " "+ intArr01[1]);

        }

        int[][] result = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }


        return result;
    }
}
