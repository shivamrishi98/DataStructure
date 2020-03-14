package com.company.SudokuSolver;

import java.util.Scanner;

public class sudokuSolver {

    private int[][] board;
    public static final int EMPTY = 0;
    public static final int SIZE = 9;

    sudokuSolver(int[][] board)
    {
        this.board = new int[SIZE][SIZE];

        for(int i=0;i<SIZE;i++)
        {
            for(int j=0;j<SIZE;j++)
            {
                this.board[i][j] = board[i][j];
            }
        }
    }

    private boolean isInRow(int row,int number)
    {
        for(int i=0;i<SIZE;i++)
        {
            if(board[row][i]==number)
            {
                return true;
            }
        }


        return false;

    }


    private boolean isInCol(int col,int number)
    {
        for(int i=0;i<SIZE;i++)
        {
            if(board[i][col]==number)
            {
                return true;
            }
        }

        return false;

    }

    private boolean isInBox(int row,int col,int number)
    {
        int r = row - row%3;
        int c = col - col%3;

        for(int i=r;i<r+3;i++)
        {
            for(int j=c;j<c+3;j++)
            {
                if(board[i][j]==number)
                {
                    return true;
                }

            }
        }

        return false;


    }


    private boolean isValid(int row,int col,int number)
    {
        return !isInRow(row,number) && !isInCol(col, number) && !isInBox(row, col, number);
    }

    private boolean solve()
    {

        for(int row=0;row<SIZE;row++) {
            for (int col = 0; col < SIZE; col++) {

                if (board[row][col] == EMPTY) {

                    for (int number = 1; number <= SIZE; number++) {
                        if (isValid(row, col, number)) {
                            board[row][col] = number;

                            if (solve()) {
                                return true;
                            } else {
                                board[row][col] = EMPTY;

                            }
                        }
                    }
                    return false;
                }

            }
        }

        return true;

    }


    public void display()
    {

        for(int i=0;i<SIZE;i++)
        {
            for(int j=0;j<SIZE;j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }


        System.out.println();
    }

    public static void main(String[] args) {


        int[][] grid = new int[SIZE][SIZE];

        Scanner sc = new Scanner(System.in);

        for(int i=0;i<SIZE;i++)
        {
            for(int j=0;j<SIZE;j++)
            {
                grid[i][j]=sc.nextInt();
            }
        }


        sudokuSolver sudoku = new sudokuSolver(grid);
        System.out.println("Before Solved");
        sudoku.display();

        if (sudoku.solve()) {
            System.out.println("After Solved");
            sudoku.display();
        } else {
            System.out.println("Unsolvable");
        }

    }







}
