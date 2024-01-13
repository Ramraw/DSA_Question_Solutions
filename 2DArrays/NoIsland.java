class Solution {
    public int numIslands(char[][] grid) {
        int rows = grid.length;

        if (rows == 0) {
            return 0;
        }

        int cols = grid[0].length;
        int no_island = 0;

        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                if (grid[i][j] == '1') {
                    mark_cur_island(grid, i, j, rows, cols);
                    no_island += 1;
                }
            }
        }
        return no_island;
    }

    void mark_cur_island(char[][] mat, int i, int j, int rows, int cols) {
        if (i < 0 || i >= rows || j < 0 || j >= cols || mat[i][j] != '1') {
            return;
        }
        mat[i][j] = '2';
        mark_cur_island(mat, i + 1, j, rows, cols);
        mark_cur_island(mat, i - 1, j, rows, cols);
        mark_cur_island(mat, i, j + 1, rows, cols);
        mark_cur_island(mat, i, j - 1, rows, cols);
    }
}
