package com.company;

import java.util.HashMap;

public class 1_Two_Sum_Map {

    public static void main(String[] strings){

        int[] array = {0, 7 ,8, 2};

        twoSum(array, 9);



    }



    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> numsMap = new HashMap<>();

        // put the array value into the nums
        for (int i = 0 ; i < nums.length ; i++){
            numsMap.put(i, nums[i]);

        }

        for (int i = 1 ; i < nums.length ; i++){
            Integer complement = target - i;
            Boolean test = numsMap.containsValue(complement);
            if(test == true){
                result[0] = i;
                result[1] = complement;

            }


        }




        System.out.println(result[0] + " " + result[1]);
        return result;

    }







}
