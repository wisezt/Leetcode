// Worked !!!

import java.util.*;

public class Question_15_3Sum_Solution_4 {


    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        int j = 1, k = nums.length - 1, i = 0;

        Set<List<Integer>> theSet = new HashSet<>();

        Arrays.sort(nums);

        //   for (int num : nums){
        //   System.out.print(num + " ");


        ///  }

        //  System.out.println();



        while (i < (nums.length - 2)){






            j = i + 1;
            k = nums.length - 1;



            while (j < k){



                //  System.out.println("i: " + i + " j: " + j + " k: " + k);
                if ((nums[i] + nums[j] + nums[k]) < 0){
                    //   System.out.println("<0 " +" i: " + i + " j: " + j + " k: " + k);

                    do { j++;} while (nums[j] == nums[j - 1] && j < k);



                } else if ((nums[i] + nums[j] + nums[k]) > 0) {
                    //  System.out.println(">0 " +" i: " + i + " j: " + j + " k: " + k);
                    do { k--;} while (nums[k] == nums[k + 1] && j < k);

                    //  System.out.println(">0 " +" i: " + i + " j: " + j + " k: " + k);



                } else {
                    theSet.add(Arrays.asList(nums[i], nums[j], nums[k]));


                    do { j++;} while (nums[j] == nums[j - 1] && j < k);

                    do { k--;} while (nums[k] == nums[k + 1] && j < k);

                }




            }

            i++;

            while ((nums[i] == nums[i - 1]) && nums[i] == nums[i +1] && (i <nums.length -2)){
                i++;
            }


        }

        for (List<Integer> theList : theSet){
            result.add(theList);

        }


        return result;
    }











}
