package io.github.aarvedahl.NumGame;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/*

The input is always a valid game state of a 2048 puzzle. The first four lines of input, that each contains four integers, describe the
16 integers in the 4×4 grid of 2048 puzzle. The j-th integer in the i-th line denotes the content of the cell located at the i-th row and the j

-th cell. For this problem, all integers in the input will be either {0, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024}. Integer 0 means an empty cell.

The fifth line of input contains an integer 0, 1, 2, or 3 that denotes a left, up, right, or down move executed by the player, respectively.

2 0 0 2             4 0 0 0
4 16 8 2            4 16 8 2
2 64 32 4           2 64 32 4
1024 1024 64 0  2048 64 0 0
0

 */

public class NumGame {

    Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        NumGame numGame = new NumGame();
    }

    int[][] numbers = new int[4][4];

    public NumGame() {
        //initList();
        //  playGame();
    }

    private void initList() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
    }


    public void playGame() {

        int move = sc.nextInt();
        performMove(move, numbers);
        if (move == 0) {
            // Move left
        } else if (move == 1) {
            // Move up
        } else if (move == 2) {
            // Move right
        } else if (move == 3) {
            // Move down
        }
    }

    private void writeOutput(int[][] finalList) {
    }


    public int[][] performMove(int move, int[][] numbers) {
        int[][] result = new int[4][4];
        if (move == 0) {
            for (int i = numbers.length - 1; i >= 0; i--) {
                for (int j = numbers[i].length - 1; j >= 0; j--) {
                    if (j > 0) {
                        if (numbers[i][j - 1] == 0) {
                            numbers[i][j - 1] = numbers[i][j];
                            numbers[i][j] = 0;
                        } else if (numbers[i][j - 1] == numbers[i][j]) {
                            numbers[i][j - 1] += numbers[i][j];
                            numbers[i][j] = 0;
                        }
                    }
                }
            }
        }
      //  print();
        return numbers;
    }

    public void print() {
        for (int i = numbers.length - 1; i >= 0; i--) {
            for (int j = numbers[i].length - 1; j >= 0; j--) {
                System.out.println(numbers[i][j]);
            }
        }
    }
}
