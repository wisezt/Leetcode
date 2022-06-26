import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Tests01 {

    Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution01();
    }


    @Test
    void test01() {

        int[][] intArr = new int[3][3];


        int val = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                intArr[i][j] = val;
                val++;

            }
        }

        printMatrix(intArr);

        solution.rotate(intArr);

        printMatrix(intArr);


    }


    @Test
    void test02() {

        int[][] intArr = new int[4][4];


        int val = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                intArr[i][j] = val;
                val++;

            }
        }

        printMatrix(intArr);

        solution.rotate(intArr);

        printMatrix(intArr);


    }


    private void printMatrix(int[][] matrix) {

//        System.out.println("n: " + n);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]+ "\t");
            }
            System.out.println();
        }

        System.out.println();

    }

}
