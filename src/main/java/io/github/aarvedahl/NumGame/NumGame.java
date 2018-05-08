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

/*
Rotate by +90:

    Transpose
    Reverse each row

Rotate by -90:

    Reverse each row
    Transpose

 */

// Can only merge once per swipe, need to adjust this
// Either own boolean array for this or a hashmap
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
        } else if(move == 1) {
            numbers = rotateRight(numbers);
            for(int i = 0; i<numbers.length; i++) {
                for(int j = 0; j<numbers[i].length; j++) {
                    if (j < 3) {
                        if (numbers[i][j + 1] == 0) {
                            numbers[i][j + 1] = numbers[i][j];
                            numbers[i][j] = 0;
                        } else if (numbers[i][j + 1] == numbers[i][j]) {
                            numbers[i][j + 1] += numbers[i][j];
                            numbers[i][j] = 0;
                        }
                    }
                }
                for (int j = numbers[i].length - 1; j >= 0; j--) {
                    if (j > 0) {
                        if (numbers[i][j] == 0) {
                            numbers[i][j] = numbers[i][j - 1];
                            numbers[i][j - 1] = 0;
                        }
                    }
                }
            }
            numbers = rotateLeft(numbers);
        } else if(move == 2) {
            for(int i = 0; i<numbers.length; i++) {
                for(int j = 0; j<numbers[i].length; j++) {
                    if (j < 3) {
                        if (numbers[i][j + 1] == 0) {
                            numbers[i][j + 1] = numbers[i][j];
                            numbers[i][j] = 0;
                        } else if (numbers[i][j + 1] == numbers[i][j]) {
                            numbers[i][j + 1] += numbers[i][j];
                            numbers[i][j] = 0;
                        }
                    }
                }
                for (int j = numbers[i].length - 1; j >= 0; j--) {
                    if (j > 0) {
                        if (numbers[i][j] == 0) {
                            numbers[i][j] = numbers[i][j - 1];
                            numbers[i][j - 1] = 0;
                        }
                    }
                }
            }
        } else if(move == 3) {
            numbers = rotateLeft(numbers);
            for(int i = 0; i<numbers.length; i++) {
                for (int j = 0; j < numbers[i].length; j++) {
                    if (j < 3) {
                        if (numbers[i][j + 1] == 0) {
                            numbers[i][j + 1] = numbers[i][j];
                            numbers[i][j] = 0;
                        } else if (numbers[i][j + 1] == numbers[i][j]) {
                            numbers[i][j + 1] += numbers[i][j];
                            numbers[i][j] = 0;
                        }
                    }
                }
                for (int j = numbers[i].length - 1; j >= 0; j--) {
                    if (j > 0) {
                        if (numbers[i][j] == 0) {
                            numbers[i][j] = numbers[i][j - 1];
                            numbers[i][j - 1] = 0;
                        }
                    }
                }
            }
            numbers = rotateRight(numbers);
        }
        return numbers;
    }

    public void print(int[][] list) {
        for (int i = list.length - 1; i >= 0; i--) {
            for (int j = list[i].length - 1; j >= 0; j--) {
                System.out.println(list[i][j]);
            }
        }
    }

    public void print2(int[][] list) {
        for(int i=0; i<list.length; i++) {
            for(int j=0; j<list[i].length; j++) {
                System.out.println(list[i][j]);
            }
        }
    }

    public int[][] transposeMatrix(int [][] m){
        int[][] temp = new int[m[0].length][m.length];
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[0].length; j++)
                temp[j][i] = m[i][j];
        return temp;
    }


    public int[] reverseArray(int[] result) {
        int [] tmp = new int[result.length];
        List<Integer> list = new ArrayList<>();
        for(int i = result.length -1; i >= 0; i--) {
            list.add(result[i]);
        }
        for(int i = 0; i<list.size(); i++) {
            tmp[i] = list.get(i);
        }
        return tmp;
    }

    public int[][] rotateLeft(int[][] num) {
        int[][] tmp = new int[num.length][num.length];
        for(int i = 0; i<num.length; i++) {
            tmp[i] = reverseArray(num[i]);
        }
        return transposeMatrix(tmp);
    }

    public int[][] rotateRight(int[][] num) {
        int[][] tmp1 = new int[num.length][num.length];
        int[][] tmp = transposeMatrix(num);
        for(int i=0; i<tmp.length; i++) {
            tmp1[i] = reverseArray(tmp[i]);
        }
        return tmp1;
    }
}
