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

    int [] [] numbers = new int [4][4];
    public NumGame() {
        //initList();
      //  playGame();
    }

    private void initList(){
        for(int i=0; i <4; i++) {
            for(int j=0; j<4; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
    }



    public void playGame(){

        int move = sc.nextInt();
        performMove(move, numbers);
        if(move == 0) {
            // Move left
        } else if (move == 1) {
            // Move up
        } else if (move ==2) {
            // Move right
        } else if (move == 3) {
            // Move down
        }
    }

    private void writeOutput(int[][] finalList) {
    }

    // Alternativt en hashmap
    // Skapa en ny 2d array där man lägger till det slutgiltliga svaret
    private List<List<Integer>> performMove(int move, int[][] numbers) {
        List<List<Integer>> lists = new ArrayList<>();

        for(int[] list: numbers) {
            for(int num: list) {
                if(move == 0) {
                  //  if(num == list.get(num+1)) {

                   // }
                }
                for(int num2: list) {

                }
            }
        }


        return lists;
    }
}
