package com.leetcode;

public class Solution01 implements Solution{


    public void sortColors(int[] nums) {
        int red = 0;
        int white = 0;
        int blue =0;

        int len = nums.length;
        int left = 0;
        int right = len - 1;


        int i;
        int Color = nums[0];
        int tmp;
//        while (left <= right){
//
//
//            Color = nums[i];
//
//            switch(Color){
//                case 0:
//                    red++;
//                    tmp=nums[left];
//                    nums[left]=0;
//                    left++;
//                    i = left;
//
//                    break;
//                case 1:
//                    white++;
//                    tmpColor = nums[i];
//                    nums[i] = 1;
//                    i++;
//                    break;
//                case 2:
//                    blue++;
//                    tmpColor = nums[right];
//                    nums[right]=2;
//                    right--;
//                    i = right
//                    break;
//                default: System.out.print("Somthing Wrong!");
//            }
//
//
//
//
//

//        }

        for (int c:nums) {
            switch(c){
                case 0:
                    red++;
                    break;
                case 1:
                    white++;

                    break;
                case 2:
                    blue++;
                    break;
                default: System.out.print("Somthing Wrong!");
            }
        }


        for (int j = 0; j < red; j++) {
            nums[j] = 0;
        }


        for (int j = red; j < red + white; j++) {
            nums[j] = 1;
        }


        for (int j = red+white; j < red + white+blue; j++) {
            nums[j] = 2;
        }



    }
}
