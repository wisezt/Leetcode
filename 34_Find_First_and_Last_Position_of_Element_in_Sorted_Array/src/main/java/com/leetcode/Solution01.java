package com.leetcode;

public class Solution01 implements Solution {

    int[] result;
    int indexL;
    int indexR;
    int indexCur;
    int numL;
    int numR;
    int numCur;

    @Override
    public int[] searchRange(int[] nums, int target) {

//        int targetIndexL;
//        int targetIndexR;


        result = new int[]{-1, -1};
        indexL = 0;
        indexR = nums.length - 1;
        indexCur = (indexL + indexR) / 2;


        // if nums is empty return [-1,-1]
        if (nums.length == 0) {
            return result;
        }

        // step 1 find target num
        int count = 0;
        while (indexL != indexR && count < 100) {
            indexCur = (indexL + indexR) / 2;
            numL = nums[indexL];
            numR = nums[indexR];
            numCur = nums[indexCur];

            println("1. indexL,indexCur,indexR,numL,numCur,numR", indexL, indexCur, indexR, numL, numCur, numR);

            if (numCur == target) {
//                targetIndexL = indexCur;
//                targetIndexR = indexCur;
                break;
            } else if (numL == target) {
                indexCur = indexL;
                break;
            } else if (numR == target) {
                indexCur = indexR;
                break;
            } else if (numCur < target) {
                indexL = indexCur;
            } else if (numCur > target) {
                indexR = indexCur;
            }

            count++;
        }

        // return [-1,-1] while doesn't find the target
        // In fact indexL = indexR = indexCur
//        indexCur = (indexL + indexR) / 2;
        if (nums[indexCur] != target) {
            return result;
        }

        // step 2 find the first target num

        result[0] = searchLeft(nums, target, indexL, indexCur);
        println(result[0]);


        // step 3 find the last target num
        result[1] = searchRight(nums, target, indexCur, indexR);


        return result;
    }

    private int searchRight(int[] nums, int target, int indexL, int indexR) {
        if (nums[indexR] == target) {
            return indexR;
        }

        int indexCur = (indexL + indexR) / 2;
        int numL = nums[indexL];
        int numR = nums[indexR];

        int numCur = nums[indexCur];


        if (nums.length == 1 && numCur == target) {
            return indexCur;
        }


        if (nums.length < 2) {
            return -1;
        }

        int numCur1 = nums[indexCur + 1];
        int count = 0;
        while (indexL != indexR && count < 100) {
            indexCur = (indexL + indexR) / 2;
            numL = nums[indexL];
            numR = nums[indexR];
            numCur = nums[indexCur];
            numCur1 = nums[indexCur + 1];

            println("2. indexL,indexR,indexCur,numL,numR,numCur,numCur1", indexL, indexR, indexCur, numL, numR, numCur, numCur1);


            if (numCur == target && numCur1 > target) {
                println("indexCur",indexCur);
                return indexCur;

            } else if (numCur == target) {
                indexL = indexCur;

            } else if (numCur > target) {
                indexR = indexCur;

            } else {

                System.out.println("There is an error at SearchRight");

            }

            count++;
        }


        return -1;
    }

    private int searchLeft(int[] nums, int target, int indexL, int indexR) {


        if (nums[indexL] == target) {
            return indexL;
        }

        int indexCur = (indexL + indexR) / 2;
        int numL = nums[indexL];
        int numR = nums[indexR];

        int numCur = nums[indexCur];


        if (nums.length == 1 && numCur == target) {
            return indexCur;
        }


        if (nums.length < 2) {
            return -1;
        }
        int numCur1 = nums[indexCur + 1];
        int count = 0;
        while (indexL != indexR && count < 100) {
            indexCur = (indexL + indexR) / 2;
            numL = nums[indexL];
            numR = nums[indexR];
            numCur = nums[indexCur];
            numCur1 = nums[indexCur + 1];

            println("3. indexL,indexR,indexCur,numL,numR,numCur,numCur1", indexL, indexR, indexCur, numL, numR, numCur, numCur1);


            if (numCur < target && numCur1 == target) {
                return indexCur + 1;

            } else if (numCur == target) {
                indexR = indexCur;

            } else if (numCur < target) {
                indexL = indexCur;

            } else {

                System.out.println("There is an error at SearchLeft");

            }

            count++;
        }


        return -1;

    }


    static <T> void println(T t) {
        System.out.println(t);
    }


    static <T> void println(String names, T... vals) {
        String[] strs = names.split(",");
        for (int i = 0; i < vals.length; i++) {
            System.out.print(strs[i] + ": " + vals[i] + "\t");
        }
        System.out.println();

    }
}
