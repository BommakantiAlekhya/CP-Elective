// matrixAdd(int[][], int[][]) [10 pts]
// Background: we can think of a 2d array in Java as a matrix in math. To add two matrices, L and M, they must have 
// the same dimensions. 
// Then, we loop over each row and col, and the result[row][col] is just the sum of L[row][col] and M[row][col]. For example:
// L = { {1,  2,  3},
//       {4,  5,  6} }
// M = { {21, 22, 23},
//       {24, 25, 26}}
// N = { {1+21, 2+22, 3+23},
//       {4+24, 5+25, 6+26}}
// assert(matrixAdd(L, M) == N)
// With this in mind, write the method matrixAdd(L, M) that takes two rectangular 2d array (that we will consider 
// to be matrices) that you 
// may assume only contain numbers, and returns a new 2d array that is the result of adding the two matrices. Return 
// null if the two matrices 
// cannot be added because they are of different dimensions.

public class MatrixAdd {
	public int[][] matrixAdd(int[][] L, int[][] M) {
		// your code goes here
		return new int[0][0];
	}
}