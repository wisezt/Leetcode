import java.util.ArrayList;
import java.util.List;

public class Solution01 implements Solution {


    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int ri = 0;
        int ci = 0;


        result = AddOneRoundNums(matrix, ri, ci, result);


        return result;
    }

    private List<Integer> AddOneRoundNums(int[][] matrix, int ri, int ci, List<Integer> result) {


        if (ri < matrix.length - ri) {
            for (int i = ci; i < matrix[ri].length - ci; i++) {
                result.add(matrix[ri][i]);
//                System.out.print("->");
//                System.out.print(matrix[ri][i] + "\t");


            }
        }

        if (ci < matrix[ri].length - ci) {
            for (int i = ri + 1; i < matrix.length - ri; i++) {
                result.add(matrix[i][matrix[ri].length - ci - 1]);
//                System.out.print("V");
//                System.out.print(matrix[i][matrix[ri].length - ci - 1] + "\t");
            }

        }


        if (ri < matrix.length -1- ri) {
            for (int i = matrix[ri].length - 2 - ci; i >= ci; i--) {
                result.add(matrix[matrix.length - 1 - ri][i]);
//
//                System.out.print("<-");
//                System.out.print(matrix[matrix.length - 1 - ri][i] + "\t");

            }
        }


        if (ci < matrix[ri].length - ci - 1) {
            for (int i = matrix.length - 2 - ri; i > ri; i--) {
                result.add(matrix[i][ci]);
//                System.out.print("^");
//                System.out.print(matrix[i][ci] + "\t");

            }
        }

//
//        System.out.println();

        if (matrix.length / 2 <= ri || matrix[ri].length / 2 <= ci) {
//            System.out.printf("ri: %s\tci: %s\t\n", ri, ci);
            return result;
        }


        return AddOneRoundNums(matrix, ++ri, ++ci, result);
    }
}
