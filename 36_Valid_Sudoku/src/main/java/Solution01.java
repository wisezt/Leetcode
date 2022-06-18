import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution01 implements Solution {


    public boolean isValidSudoku(char[][] board) {

        boolean result;

        // 1. Valid the rows

        result = isMatchedRows(board);

        if (!result) return result;

        // 2. Valid the columns

        result = isMatchedColumns(board);

        if (!result) return result;


        //3. Valid the blocks
        result = isMatchedBlocks(board);

        if (!result) return result;


        return result;
    }

    public boolean isMatchedColumns(char[][] board) {
        List<Set<Character>> list = getSetList();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
//                System.out.println(""+i + j);
                char tmpChar = board[i][j];
//                System.out.print(tmpChar + "\t");
                if (tmpChar != '.' && !list.get(j).remove(tmpChar)) {
//                    System.out.println("False");
                    System.out.println(tmpChar);
                    return false;
                }
            }
//            System.out.println();
        }

//        System.out.println("is True");
        return true;
    }

    public boolean isMatchedBlocks(char[][] board) {
        List<Set<Character>> list = getSetList();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                char tmpChar = board[i][j];
                if (tmpChar != '.') {
                    if (0 <= i && i <3) {
                        if (0 <= j && j < 3) {
                            if (!list.get(0).remove(tmpChar)) {
                                System.out.println("0" + i+ j + ": " + tmpChar);
                                return false;
                            }
                        } else if (3 <= j && j <6) {
                            if (!list.get(1).remove(tmpChar)) {
                                System.out.println("1" + i+ j + ": " + tmpChar);
                                return false;
                            }
                        } else if (6 <= j && j < 9) {
                            if (!list.get(2).remove(tmpChar)) {
                                System.out.println("2" + i+ j + ": " + tmpChar);
                                return false;
                            }
                        }

                    } else if (3 <= i && i <6) {
                        if (0 <= j && j <3) {
                            if (!list.get(3).remove(tmpChar)) {
                                System.out.println("3" + i+ j + ": " + tmpChar);
                                return false;
                            }
                        } else if (3 <= j && j <6) {
                            if (!list.get(4).remove(tmpChar)) {
                                System.out.println("4" + i+ j + ": " + tmpChar);
                                return false;
                            }
                        } else if (6 <= j && j <9) {
                            if (!list.get(5).remove(tmpChar)) {
                                System.out.println("5" + i+ j + ": " + tmpChar);
                                return false;
                            }
                        }
                    } else if (6 <= i && i < 9) {
                        if (0 <= j && j < 3) {

                            if (!list.get(6).remove(tmpChar)) {
                                System.out.println("6" + i+ j + ": " + tmpChar);
                                return false;
                            }
                        } else if (3 <= j && j < 6) {
//                            System.out.println("7" + i+ j + ": " + tmpChar);
                            if (!list.get(7).remove(tmpChar)) {
                                System.out.println("7" + i+ j + ": " + tmpChar);
                                return false;
                            }
                        } else if (6 <= j && j < 9) {
                            if (!list.get(8).remove(tmpChar)) {
                                System.out.println("8" + i+ j + ": " + tmpChar);
                                return false;
                            }
                        }
                    }


                }
            }
//            if (list.get(i).size() > 0) return false;
        }


        return true;
    }

    public boolean isMatchedRows(char[][] board) {

        List<Set<Character>> list = getSetList();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                char tmpChar = board[i][j];
                if (tmpChar != '.' && !list.get(i).remove(board[i][j])) {
//                    System.out.println(board[i][j]);
                    return false;
                }
            }
//            if (list.get(i).size() > 0) return false;
        }

        return true;
    }


    static Set<Character> getNumsSet() {
        Set<Character> set = new HashSet<>();

        for (int i = 1; i <= 9; i++) {
            set.add(Integer.toString(i).charAt(0));
        }

        return set;

    }

    static List<Set<Character>> getSetList() {
        List<Set<Character>> list = new ArrayList<>();

        for (int i = 0; i <= 9; i++) {
            list.add(getNumsSet());
        }

        return list;
    }


}
