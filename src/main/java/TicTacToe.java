import java.util.Scanner;

public class TicTacToe {
    static char[][] map;
    static final int SIZE = 3;
    static final char DOT_PLAYER = 'X';
    static final char DOT_AI = '0';
    static final char DOT_EMPTY = ' ';

    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        prepareMap();
        showMap();
        prepareMap();
    }

    // 0 1 2 3
    // 1 * *
    // 2 * X *
    // 3 * * *


    public static void showMap(){
        for(int i = 0; i<= SIZE; i++){
            System.out.print(i+" ");
        }
        System.out.println(" ");

        for (int i = 0; i < map.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j]+" ");

            }
            System.out.println();
        }
    }

    public static void prepareMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void turnPlayer(char player) {
        System.out.println("Player " + player + ", enter row and column: ");
        int row = sc.nextInt() - 1;
        int col = sc.nextInt() - 1;
        if (checkEmptyCell(row, col)) {
            map[row][col] = player;
        } else {
            System.out.println("That cell is already taken. Try again.");
            turnPlayer(player);
        }
    }

    public static boolean checkEmptyCell(int row, int col) {
        return map[row][col] == DOT_EMPTY;
    }


}