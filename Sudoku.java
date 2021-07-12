'''
isLegalSudoku(board)
Write a function isLegalSudoku(board) that takes a n**2 x n**2 board where n is an odd number and return True  if this board is a legal sudoku and False otherwise.

Hint:
areLegalValues(values): This function takes a 1d list of values, which you should verify is of length N2 for some positive integer N and contains only integers in the range 0 to N2 (inclusive). These values may be extracted from any given row, column, or block in a Sudoku board (and, in fact, that is exactly what the next few functions will do -- they will each call this helper function). The function returns True if the values are legal: that is, if every value is an integer between 0 and N2, inclusive, and if each integer from 1 to N2 occurs at most once in the given list (0 may be repeated, of course). Note that this function does not take a 2d Sudoku board, but only a 1d list of values that presumably have been extracted from some Sudoku board.
isLegalRow(board, row): This function takes a Sudoku board and a row number. The function returns True if the given row in the given board is legal (where row 0 is the top row and row (N2-1) is the bottom row), and False otherwise. To do this, your function must create a 1d list of length N2 holding the values from the given row, and then provide these values to the areLegalValues function you previously wrote. (Actually, because areLegalValues is non-destructive, you do not have to copy the row; you may use an alias.)
isLegalCol(board, col): This function works just like the isLegalRow function, only for columns, where column 0 is the leftmost column and column (N2-1) is the rightmost column. Similarly to isLegalRow, this function must create a 1d list of length N2 holding the values from the given column, and then provide these values to the areLegalValues function you previously wrote.
isLegalBlock(board, block): This function works just like the isLegalRow function, only for blocks, where block 0 is the left-top block, and block numbers proceed across and then down, as described earlier. Similarly to isLegalRow and isLegalCol, this function must create a 1d list of length N2 holding the values from the given block, and then provide these values to the areLegalValues function you previously wrote.
isLegalSudoku(board): This function takes a Sudoku board (which you may assume is a N2xN2 2d list of integers), and returns True if the board is legal, as described above. To do this, your function must call isLegalRow over every row, isLegalCol over every column, and isLegalBlock over every block. See how helpful those helper functions are? Seriously, this exercise is a very clear demonstration of the principle of top-down design and function decomposition.
'''

public class Sudoku {
    /**
     * This function takes a Sudoku board (which you may assume 
     * is a N2xN2 2d list of integers), and 
     * returns True if the board is legal, as described above. 
     * To do this, your function must call isLegalRow over every 
     * row, isLegalCol over every column, and isLegalBlock over every block.
     * See how helpful those helper functions are? Seriously, 
     * this exercise is a very clear demonstration of the principle of 
     * top-down design and function decomposition.
     */
    public boolean isLegalSudoku(int[][] board) {
        // Your code goes here...
        return false;
    }

    // This function takes a 1d list of values, which you should verify is of length N2 for some positive integer N and contains only integers in the range 0 to N2 (inclusive). These values may be extracted from any given row, column, or block in a Sudoko board (and, in fact, that is exactly what the next few functions will do -- they will each call this helper function). The function returns True if the values are legal: that is, if every value is an integer between 0 and N2, inclusive, and if each integer from 1 to N2 occurs at most once in the given list (0 may be repeated, of course). Note that this function does not take a 2d Sudoku board, but only a 1d list of values that presumably have been extracted from some Sudoku board.
    public boolean areLegalValues(int[] lst) {
        // Your code goes here...
        return false;
    }

    // This function takes a Sudoku board and a row number. The function returns True if the given row in the given board is legal (where row 0 is the top row and row (N2-1) is the bottom row), and False otherwise. To do this, your function must create a 1d list of length N2 holding the values from the given row, and then provide these values to the areLegalValues function you previously wrote. (Actually, because areLegalValues is non-destructive, you do not have to copy the row; you may use an alias.)
    public boolean isLegalRow(int[][] board, int rowNum) {
        // Your code goes here...
        return false;
    }

    // This function works just like the isLegalRow function, only for columns, where column 0 is the leftmost column and column (N2-1) is the rightmost column. Similarly to isLegalRow, this function must create a 1d list of length N2 holding the values from the given column, and then provide these values to the areLegalValues function you previously wrote.
    public boolean isLegalCol(int[][] board, int colNum) {
        // Your code goes here...
        return false;
    }

    // This function works just like the isLegalRow function, only for blocks, where block 0 is the left-top block, and block numbers proceed across and then down, as described earlier. Similarly to isLegalRow and isLegalCol, this function must create a 1d list of length N2 holding the values from the given block, and then provide these values to the areLegalValues function you previously wrote.
    public boolean isLegalBlock(int[][] board, int block) {
        // Your code goes here...
        return false;
    }
}
