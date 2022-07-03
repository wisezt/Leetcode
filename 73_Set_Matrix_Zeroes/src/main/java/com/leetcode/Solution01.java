package com.leetcode;


import java.util.HashSet;

import java.util.Set;

public class Solution01 implements Solution{

    public void setZeroes(int[][] matrix) {


        Set<String> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        // recording the position of 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if ( matrix[i][j] == 0){
                    sb.append(i);
                    sb.append(" ");
                    sb.append(j);
                    set.add(sb.toString());
//                    sb.delete(0, sb.length());
                    sb.setLength(0);
                }
            }
        }


        setZeroesBySet(matrix, set);



    }

    private void setZeroesBySet(int[][] matrix, Set<String> set) {

        int i;
        int j;
        for (String str: set){
            String[] strs = str.split(" ");
            i = Integer.valueOf(strs[0]);
            j = Integer.valueOf(strs[1]);

            covertColRow(matrix, i,j);

        }



    }

    private void covertColRow(int[][] matrix, int i, int j) {
        for (int k = 0; k < matrix.length; k++) {
            matrix[k][j] = 0;

        }
        for (int k = 0; k < matrix[0].length; k++) {
            matrix[i][k] = 0;

        }

    }
}
