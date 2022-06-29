import java.util.ArrayList;
import java.util.List;

public class Solution02 implements Solution {
    List<Integer> startNums = new ArrayList<>();
    List<Integer> endNums = new ArrayList<>();

    public int[][] merge(int[][] intervals) {


        List<int[]> list = new ArrayList<>();


        if (intervals.length == 1) {
            return intervals;
        }

//
//        List<Integer> startNums = new ArrayList<>();
//        List<Integer> endNums = new ArrayList<>();


        startNums.add(intervals[0][0]);
        endNums.add(intervals[0][1]);


        for (int[] ints : intervals) {

            manageIntervals(ints);


        }

        int[][]result = new int[startNums.size()][2];
        for(int i = 0; i < startNums.size();i++){
            result[i][0]= startNums.get(i);
            result[i][1] = endNums.get(i);

        }




        return result;
    }

    private void manageIntervals(int[] ints) {
        List<Integer> tmpStartList = new ArrayList<>();
        List<Integer> tmpEndList = new ArrayList<>();
        boolean isFoundStartPosition = false;
        boolean isFoundEndPosition = false;
        System.out.println();
        System.out.println("StartNums: " + startNums);
        System.out.println("EndNums: " + endNums);
        System.out.println("ints[0]: " + ints[0]);
        System.out.println("ints[1]: " + ints[1]);



        for (int i = 0; i < startNums.size(); i++) {
            System.out.println("i: " +i);
            System.out.println("startNums.get(i): " + startNums.get(i));
            System.out.println("endNums.get(i): " + endNums.get(i));
            System.out.println("isFoundStartPosition: " + isFoundStartPosition);
            System.out.println("isFoundEndPosition: " + isFoundEndPosition);
            System.out.println("tmpStartList " + tmpStartList);
            System.out.println("tmpEndList " + tmpEndList);

            if (!isFoundStartPosition) {

                // check startNums list
                if (startNums.get(i) > ints[0]) {
                    tmpStartList.add(ints[0]);
                    isFoundStartPosition = true;
                } else {
                    tmpStartList.add(startNums.get(i));
                }


                // check endNums list
                if (endNums.get(i) < ints[0]) {
                    tmpEndList.add(endNums.get(i));

                } else {
                    isFoundStartPosition = true;

                }


            } else if (!isFoundEndPosition) {
                if (startNums.get(i) < ints[1]) {

                } else{
                    tmpStartList.add(startNums.get(i));
                    isFoundEndPosition = true;
                }


                // check endNums list
                if (endNums.get(i) < ints[1]) {


                } else {
                    tmpEndList.add(endNums.get(i));
                    isFoundStartPosition = true;

                }



            } else if (isFoundEndPosition) {
                tmpStartList.add(startNums.get(i));
                tmpEndList.add(endNums.get(i));
            }

        }





        if (!isFoundStartPosition ) {
            // If doesn't find the start Position
            tmpStartList.add(ints[0]);
            tmpEndList.add(ints[1]);
            isFoundStartPosition=true;
        } else if (!isFoundEndPosition) {
            // If doesn't find the end Position
            tmpEndList.add(ints[1]);
            isFoundStartPosition=true;
        }


        startNums = tmpStartList;
        endNums = tmpEndList;

    }


}
