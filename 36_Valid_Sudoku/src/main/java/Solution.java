public interface Solution {

    public boolean isValidSudoku(char[][] board);

    boolean isMatchedRows(char[][] chars);

    boolean isMatchedColumns(char[][] chars);

    boolean isMatchedBlocks(char[][] chars);
}
