public class Solution03 implements Solution {


    public int uniquePaths(int m, int n) {


        int min = Math.min(m, n);
        int max = Math.max(m, n);


        int[][] ints = new int[min][max];

        ints[0][0] = 1;

        for (int i = 0; i < max; i++) {
            ints[0][i] = 1;
        }

        printInts(min, max, ints);


        for (int i = 0; i < min; i++) {
            ints[i][0] = 1;
        }

        System.out.println();

        printInts(min, max, ints);


        for (int i = 1; i < min; i++) {
            for (int j = i; j < min; j++) {
                ints[i][j] = ints[i][j - 1] + ints[i - 1][j];
                ints[j][i] = ints[i][j];

            }
        }

        printInts(min, max, ints);

        for (int i = 1; i < min; i++) {
            for (int j = min; j < max; j++) {

                System.out.println("i: "+ i + "\tj: " + j);
                if (j <= 0) continue;

                ints[i][j] = ints[i][j - 1] + ints[i - 1][j];

            }


        }

        printInts(min, max, ints);

        return ints[min - 1][max - 1];
    }

    private void printInts(int min, int max,int[][] ints) {
        System.out.println();

        for (int i = 0; i < min; i++) {
            for (int j = 0; j < max; j++) {
                System.out.print(ints[i][j] + "\t");

            }
        System.out.println();

        }


    }
}
