package com.leetcode;

public class Solution02 implements Solution {

    public void sortColors(int[] nums) {
        int red = 0;
        int white = 0;
        int blue = 0;

        int len = nums.length;
        int left = 1;
        int right = len - 1;


        int color = nums[0];


        if (len == 1) {
            return;
        }

        while (left <= right) {


            switch (color) {
                case 0:


                    color = nums[left];
                    nums[red] = 0;
                    left++;
                    red++;

                    break;
                case 1:
                    white++;
                    color = nums[left];
                    left++;
                    break;
                case 2:
                    blue++;

                    color = nums[right];
                    nums[len - blue] = 2;
                    right--;

                    break;
                default:
                    System.out.print("Somthing Wrong!");
            }


        }

        switch (color) {
            case 0:


                nums[red] = 0;
                red++;


                break;
            case 1:
                white++;

                break;
            case 2:
                blue++;


                nums[len - blue] = 2;


                break;
            default:
                System.out.print("Somthing Wrong!");
        }


        for (int j = red; j < red + white; j++) {
            nums[j] = 1;
        }


    }
}
