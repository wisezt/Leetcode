import java.util.List;

public class Solution01 implements Solution {


    public void rotate(int[][] matrix) {


        // length
        int l = matrix.length;
        // half length
        int hl = l / 2;


        rotate4Points(matrix, 0, 0, l, hl);


    }


    // row index: n
    // column index: m
    private void rotate4Points(int[][] matrix, int n, int m, int l, int hl) {


        if (n > hl) {
            return;
        }


        int tmp;

        for (int i = m; i < l - 1 - m; i++) {

            // the most important part for this solution is know which 4 points have to be shifted
            // matrix[n][m],
            // matrix[l - 1 - m][n]
            // matrix[l - 1 - n][l - 1 - m]
            // matrix[m][l - 1 - n]
            tmp = matrix[n][i];
            matrix[n][i] = matrix[l - 1 - i][n];
            matrix[l - 1 - i][n] = matrix[l - 1 - n][l - 1 - i];
            matrix[l - 1 - n][l - 1 - i] = matrix[i][l - 1 - n];
            matrix[i][l - 1 - n] = tmp;


        }


        rotate4Points(matrix, ++n, ++m, l, hl);

    }

    private void printMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

    }

    public static <T> void println(T t) {
        System.out.println(t);
    }

    public static <T> void println(String names, T... vals) {
        String[] strs = names.split(",");
        for (int i = 0; i < vals.length; i++) {
            System.out.print(strs[i] + ": " + vals[i] + "\t");
        }
        System.out.println();
    }

    public static <T> void printArr(T[] ts) {
        for (int i = 0; i < ts.length; i++) {
            System.out.printf("ts[%s]: %s\t", i, ts[i]);
        }
        System.out.println();
    }


    public static <T> void printList(List<T> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("list[%s]: %s\t", i, list.get(i));
        }
        System.out.println();
    }


}
