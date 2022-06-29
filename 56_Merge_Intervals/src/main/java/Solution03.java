import java.util.ArrayList;
import java.util.List;

public class Solution03 implements Solution {
    List<Integer> startNums = new ArrayList<>();
    List<Integer> endNums = new ArrayList<>();
    List<Integer> tmpStartList = new ArrayList<>();
    List<Integer> tmpEndList = new ArrayList<>();

    public int[][] merge(int[][] intervals) {


        List<int[]> list = new ArrayList<>();


        if (intervals.length == 1) {
            return intervals;
        }


        startNums.add(intervals[0][0]);

        endNums.add(intervals[0][1]);

        tmpStartList.add(intervals[0][0]);
        tmpEndList.add(intervals[0][1]);


        for (int[] ints : intervals) {

            manageIntervals(ints);


        }

        int[][] result = new int[startNums.size()][2];
        for (int i = 0; i < startNums.size(); i++) {
            result[i][0] = startNums.get(i);
            result[i][1] = endNums.get(i);

        }


        return result;
    }

    private void manageIntervals(int[] ints) {

        boolean isFoundStartPosition = false;
        boolean isFoundEndPosition = false;

        tmpStartList = new ArrayList<>();
        tmpEndList = new ArrayList<>();

        System.out.println();
        System.out.println("StartNums: " + startNums);
        System.out.println("EndNums: " + endNums);
        System.out.println("ints[0]: " + ints[0]);
        System.out.println("ints[1]: " + ints[1]);


        System.out.println("Start Index: ");
        int startVal = ints[0];
        int endValue = ints[1];
        int oldStartVal;
        int oldEndVal;
        for (int i = 0; i < startNums.size(); i++) {


            System.out.println("i: " + i);
            System.out.println("startNums: " + startNums);
            System.out.println("endNums: " + endNums);
            System.out.println("startVal: " + startVal);
            System.out.println("endValue: " + endValue);
            oldStartVal = startNums.get(i);
            oldEndVal = endNums.get(i);

            System.out.println("oldStartVal: " + oldStartVal);
            System.out.println("oldEndVal: " + oldEndVal);
            System.out.println("isFoundStartPosition: " + isFoundStartPosition);
            System.out.println("isFoundEndPosition: " + isFoundEndPosition);

            System.out.println("tmpStartList " + tmpStartList);
            System.out.println("tmpEndList " + tmpEndList);


//            System.out.printf("1***startVal: %s\tstartNums.get(i): %s\n", startVal, startNums.get(i));
            if (isFoundStartPosition) {
                if (isFoundEndPosition) {
                    tmpStartList.add(oldStartVal);
                    tmpEndList.add(oldEndVal);
                } else {
                    if (endValue < oldStartVal) {
                        tmpEndList.add(endValue);
                        tmpStartList.add(oldStartVal);
                        tmpEndList.add(oldEndVal);
                        isFoundEndPosition = true;
                        System.out.println("1***isFoundEndPosition: " + isFoundEndPosition);

                    } else if (endValue <= oldEndVal) {
                        tmpEndList.add(oldEndVal);
                        isFoundEndPosition = true;
                        System.out.println("endValue: " + endValue);
                        System.out.println("oldEndVal: " + oldEndVal);
                        if (endValue <= oldEndVal) {
                            System.out.printf("%s <= %s\n", endValue, oldEndVal);
                        }

                    }

                    System.out.println("2***isFoundEndPosition: " + isFoundEndPosition);
                }

            } else if (!isFoundStartPosition) {
//                System.out.printf("2***startVal: %s\tstartNums.get(i): %s\n", startVal, startNums.get(i));
                if (startVal < oldStartVal) {
//                    System.out.printf("3***startVal: %s\tstartNums.get(i): %s\n", startVal, startNums.get(i));
                    tmpStartList.add(startVal);
//                    tmpStartList.add(oldStartVal);
                    isFoundStartPosition = true;

                    if (endValue < oldStartVal) {
                        tmpEndList.add(endValue);
                        isFoundEndPosition = true;
                        System.out.println("3***isFoundEndPosition: " + isFoundEndPosition);
                        tmpStartList.add(oldStartVal);
                        tmpEndList.add(oldEndVal);
                    } else if (oldStartVal <= endValue && endValue <= oldEndVal) {
                        tmpEndList.add(oldEndVal);
                        isFoundEndPosition = true;
                        System.out.println("4***isFoundEndPosition: " + isFoundEndPosition);
                    }


                } else if (startNums.get(i) <= startVal && startVal <= endNums.get(i)) {

                    // between start index and end index
                    tmpStartList.add(startNums.get(i));
                    isFoundStartPosition = true;

                    if (oldStartVal <= endValue && endValue <= oldEndVal) {
                        tmpEndList.add(oldEndVal);
                        isFoundEndPosition = true;
                        System.out.println("5***isFoundEndPosition: " + isFoundEndPosition);
                    }


                } else {
                    tmpStartList.add(oldStartVal);
                    tmpEndList.add(oldEndVal);
                }

            }


            System.out.println("End:");
            System.out.println("tmpStartList " + tmpStartList);
            System.out.println("tmpEndList " + tmpEndList);

        }


        if (!isFoundStartPosition) {
            tmpStartList.add(startVal);
            tmpEndList.add(endValue);
        } else if (!isFoundEndPosition) {
            tmpEndList.add(endValue);
        }

        System.out.println("End Loop: ");
        System.out.println("tmpStartList " + tmpStartList);
        System.out.println("tmpEndList " + tmpEndList);


        startNums = tmpStartList;
        endNums = tmpEndList;


    }


}
