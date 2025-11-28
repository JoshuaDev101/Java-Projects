import java.util.*;

public class TicTacToe {
    static char[][] board = new char[3][3];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char currentPlayer;
        int row = 0, col = 0;

        // DETERMINE WHICH PLAYER STARTS THE GAME
        int cP = (int) (Math.random() * 2);
        if (cP == 0)
            currentPlayer = 'X';
        else
            currentPlayer = 'O';

        loadBoard();

        for (int turn = 1; turn <= 9; ++turn) {
            do {
                System.out.print("Player " + currentPlayer + ", Enter row (0-2): ");
                row = sc.nextInt();
                System.out.print("Player " + currentPlayer + ", Enter col (0-2): ");
                col = sc.nextInt();

                if (!isSpotAvailable(row, col)) {
                    System.out.println("That spot is already taken! Try again.");
            }

            } while (!isSpotAvailable(row, col));

            board[row][col] = currentPlayer;
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            
            printBoard();

            if (board[0][0] + board[0][1] + board[0][2] == 264 || board[0][0] + board[0][1] + board[0][2] == 237) { // across first row
                System.out.println("Player " + ((currentPlayer == 'X') ? 'O' : 'X') + " wins across");
                System.exit(1);
            }
            if (board[1][0] + board[1][1] + board[1][2] == 264 || board[1][0] + board[1][1] + board[1][2] == 237) { // across second row
                System.out.println("Player " + ((currentPlayer == 'X') ? 'O' : 'X') + " wins across");
                System.exit(1);
            }
            if (board[2][0] + board[2][1] + board[2][2] == 264 || board[2][0] + board[2][1] + board[2][2] == 237) { // across third row
                System.out.println("Player " + ((currentPlayer == 'X') ? 'O' : 'X') + " wins across");
                System.exit(1);
            }
            if (board[0][0] + board[1][0] + board[2][0] == 264 || board[0][0] + board[1][0] + board[2][0] == 237) { // down first col
                System.out.println("Player " + ((currentPlayer == 'X') ? 'O' : 'X') + " wins down");
                System.exit(1);
            }
            if (board[0][1] + board[1][1] + board[2][1] == 264 || board[0][1] + board[1][1] + board[2][1] == 237) { // down second col
                System.out.println("Player " + ((currentPlayer == 'X') ? 'O' : 'X') + " wins down");
                System.exit(1);
            }
            if (board[0][2] + board[1][2] + board[2][2] == 264 || board[0][2] + board[1][2] + board[2][2] == 237) { // down third col
                System.out.println("Player " + ((currentPlayer == 'X') ? 'O' : 'X') + " wins down");
                System.exit(1);
            }
            if (board[0][0] + board[1][1] + board[2][2] == 264 || board[0][0] + board[1][1] + board[2][2] == 237) { // diagonal right
                System.out.println("Player " + ((currentPlayer == 'X') ? 'O' : 'X') + " wins diagonal");
                System.exit(1);
            }
            if (board[0][2] + board[1][1] + board[2][0] == 264 || board[0][2] + board[1][1] + board[2][0] == 237) { // diagonal left
                System.out.println("Player " + ((currentPlayer == 'X') ? 'O' : 'X') + " wins diagonal");
                System.exit(1);
            }
        }
        System.out.println("Tie");
    }
    
    // CREATE THE BOARD
    static void loadBoard() {
        int row = 0, col = 0;
        System.out.println("-[TIC TAC TOE]-");
        for (row = 0; row <= 2; ++row) {
            for (col = 0; col <= 2; ++col) {
                board[row][col] = '-';
            }
        }
    }

    static void printBoard() {
        int row = 0, col = 0;
        for (row = 0; row <= 2; ++row) {
            for (col = 0; col <= 2; ++col) {
                System.out.print(" [" + board[row][col] + "] ");
            }
            System.out.println();
        }
    }

    static boolean isSpotAvailable(int row, int col) {
    return board[row][col] == '-';
    }
}
