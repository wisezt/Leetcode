// not finish yet!

import java.util.*;

public class Question_15_3Sum_Solution_3 {


    public List<List<Integer>> threeSum(int[] nums) {





        int length = nums.length;





        List<List<Integer>> result = new ArrayList<>();

        if ( nums.length < 3) {
            return result;
        }


        List<Integer> tempList = new ArrayList<>();


        int num01, num02, num03, rightIndex = length-1;

        Set<List<Integer>> theSet = new HashSet<>();


        Arrays.sort(nums);






        for (int i = 3 ; i < nums.length ; i++){
            if (nums[i]  > 0 ){
                rightIndex = i - 1;
                //  System.out.println(rightIndex);
                break;
            }

        }




        for (int i = rightIndex ; i < nums.length  ; i++){
            num01 = nums[i];

            for (int j = 0 ; j < rightIndex ; j++){
                num02 = nums[j];

                for (int k = j + 1 ; k < i ; k++){
                    num03 = nums[k];

                    //System.out.println("num01: " + num01 + "  num02: " + num02 +  "  num03: " + num03);

                    if ( num01 + num02 + num03 == 0){
                        tempList = new ArrayList<>();
                        tempList.add(num01);
                        tempList.add(num02);
                        tempList.add(num03);
                        Collections.sort(tempList);

                        theSet.add(tempList);



                        break;
                    }







                }

            }


        }













        for (List<Integer> theList : theSet){
            result.add(theList);

        }



        return result;

    }

}
