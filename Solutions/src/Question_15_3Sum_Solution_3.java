// This should be a reasonable solution, unfortunately, it exceeds the runtime at Leetcode.

import java.util.*;

public class Question_15_3Sum_Solution_3 {



    public List<List<Integer>> threeSum(int[] nums) {





        int length = nums.length;





        List<List<Integer>> result = new ArrayList<>();

        if ( nums.length < 3) {
            return result;
        }


        List<Integer> tempList = new ArrayList<>();


        int num01, num02, num03, rightIndex = 2, leftIndex = 0;

        Set<List<Integer>> theSet = new HashSet<>();


        Arrays.sort(nums);






        for (int i = nums.length -1 ; i > 2 ; i--){
            if (nums[i]  <= 0 ){
                rightIndex = i;
                //  System.out.println(rightIndex);
                break;
            }

        }



        for (int i = 0 ; i < nums.length ; i++){
            if (nums[i] >= 0 ){
                leftIndex = i ;
                //  System.out.println(rightIndex);
                break;
            }

        }





        for (int i = rightIndex ; i < nums.length  ; i++){
            num01 = nums[i];

            for (int j = 0 ; j <= leftIndex ; j++){
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
