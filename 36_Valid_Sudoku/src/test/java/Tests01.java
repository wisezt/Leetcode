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


        String[][] strings = new String[][]{
                {"5", "3", ".", ".", "7", ".", "7", ".", "."},
                {"6", ".", ".", "1", "9", "5", ".", ".", "."},
                {".", "9", "8", ".", ".", ".", ".", "6", "."},
                {"8", ".", ".", ".", "6", ".", ".", ".", "3"},
                {"4", ".", ".", "8", ".", "3", ".", ".", "1"},
                {"7", ".", ".", ".", "2", ".", ".", ".", "6"},
                {".", "6", ".", ".", ".", ".", "2", "8", "."},
                {".", ".", ".", "4", "1", "9", ".", ".", "5"},
                {".", ".", ".", ".", "8", ".", ".", "7", "9"}};


        char[][] chars = new char[10][10];


        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                chars[i][j] = strings[i][j].charAt(0);
//            chars[i][j]=Integer.toString(j).charAt(0);
//            System.out.print(j + "\t");
//            }
//            System.out.println();
            }

        }

        if (solution.isMatchedRows(chars)) System.out.println("is True");
    }

    @Test
    void test02() {


        String[][] strings = new String[][]{
                {"5", "3", ".", ".", "7", ".", "7", ".", "."},
                {"6", ".", ".", "1", "9", "5", ".", ".", "."},
                {".", "9", "8", ".", ".", ".", ".", "6", "."},
                {"8", ".", ".", ".", "6", ".", ".", ".", "3"},
                {"4", ".", ".", "8", ".", "3", ".", ".", "1"},
                {".", ".", ".", ".", "2", ".", ".", ".", "6"},
                {"7", "6", ".", ".", ".", ".", "2", "8", "."},
                {".", ".", ".", "4", "1", "9", ".", ".", "5"},
                {".", ".", ".", ".", "8", ".", ".", "7", "9"}};


        char[][] chars = new char[10][10];


        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                chars[i][j] = strings[i][j].charAt(0);
//                chars[i][j] = Integer.toString(j).charAt(0);
                System.out.print(chars[i][j] + "\t");

            }
            System.out.println();
        }

        if (solution.isMatchedColumns(chars)) System.out.println("no repeated chars");
    }

    @Test
    void test03() {


        String[][] strings = new String[][]{
                {"5", "3", ".", ".", "7", ".", "7", ".", "."},
                {"6", ".", ".", "1", "9", "5", ".", ".", "."},
                {".", "9", "8", ".", ".", ".", ".", "6", "."},
                {"8", ".", ".", ".", "6", ".", ".", ".", "3"},
                {"4", ".", ".", "8", ".", "3", ".", ".", "1"},
                {".", ".", ".", ".", "2", ".", ".", ".", "6"},
                {"7", "6", ".", ".", ".", ".", "2", "8", "."},
                {".", ".", ".", "4", "1", "9", ".", ".", "5"},
                {".", ".", ".", ".", "8", ".", ".", "7", "9"}};


        char[][] chars = new char[9][9];


        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                chars[i][j] = strings[i][j].charAt(0);
//                chars[i][j] = Integer.toString(j).charAt(0);
                System.out.print(chars[i][j] + "\t");

            }
            System.out.println();
        }

        if (solution.isMatchedBlocks(chars)) System.out.println("no repeated chars");
    }


    @Test
    void test04() {


        String[][] strings = new String[][]{
                {".",".",".",".",".",".","5",".","."},
                {".",".",".",".",".",".",".",".","."},
                {".",".",".",".",".",".",".",".","."},
                {"9","3",".",".","2",".","4",".","."},
                {".",".","7",".",".",".","3",".","."},
                {".",".",".",".",".",".",".",".","."},
                {".",".",".","3","4",".",".",".","."},
                {".",".",".",".",".","3",".",".","."},
                {".",".",".",".",".","5","2",".","."}
        };


        char[][] chars = new char[9][9];


        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                chars[i][j] = strings[i][j].charAt(0);
//                chars[i][j] = Integer.toString(j).charAt(0);
                System.out.print(chars[i][j] + "\t");

            }
            System.out.println();
        }

        if (solution.isMatchedBlocks(chars)) System.out.println("no repeated chars");
    }


}
