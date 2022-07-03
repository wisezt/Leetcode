package com.leetcode;

import java.util.List;
import java.util.ArrayList;


public class Solution02 implements Solution {

    public void setZeroes(int[][] matrix) {

        int rowNum = matrix.length;
        int colNum = matrix[0].length;

        List<Integer> listRow = new ArrayList<>();


        List<Integer> listCol = new ArrayList<>();

//        Set<Integer> rowSet = new HashSet<>();
//        Set<Integer> colSet = new HashSet<>();


        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < colNum; j++) {
                if (matrix[i][j] == 0) {
                    listRow.add(i);
                    listCol.add(j);
                }
            }
        }


        for (Integer rowIndex : listRow
        ) {
            for (int i = 0; i < colNum; i++) {
                matrix[rowIndex][i] = 0;
            }

        }
        for (Integer colIndex : listCol
        ) {
            for (int i = 0; i < rowNum; i++) {
                matrix[i][colIndex] = 0;
            }

        }


    }


}
