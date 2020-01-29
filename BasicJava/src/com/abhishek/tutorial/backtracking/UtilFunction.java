package com.abhishek.tutorial.backtracking;

public class UtilFunction {

    /* A utility function to print solution */
    void printSolution(int board[][])
    {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++)
                System.out.print(" " + board[i][j]
                        + " ");
            System.out.println();
        }
    }

    public static void printSudoku(int[][] board, int N) {
        // we got the answer, just print it
        for (int r = 0; r < N; r++) {
            for (int d = 0; d < N; d++) {
                System.out.print(board[r][d]);
                System.out.print(" ");
            }
            System.out.print("\n");

            if ((r + 1) % (int) Math.sqrt(N) == 0) {
                System.out.print("");
            }
        }
    }
}
