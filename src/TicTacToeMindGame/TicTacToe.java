package TicTacToeMindGame;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    static Scanner scanner = new Scanner(System.in);
    static Player player = new Player("Player1:", Cell.X);
    static Player computer = new Player("Computer:", Cell.O);
    static Cell[][] board = new Cell[3][3];

    static Player currentPlayer = player;

    public static void main(String[] args) {
        initializeBoard(board);
        playGame();
    }

    static void playGame() {
        boolean gameOver = false;
        while (!gameOver) {
            displayBoard();
            if (currentPlayer == player) {
                playerMove();
            } else {
                computerMove();
            }
            if (checkWin(board, currentPlayer.getCell())) {
                displayBoard();
                System.out.println(currentPlayer.getName() + " Wins");
                gameOver = true;
            } else if (isBoardFull(board)) {
                displayBoard();
                System.out.println("It's a draw");
                gameOver = true;
            } else {
                currentPlayer = (currentPlayer == player) ? computer : player;
            }
        }
    }

    static void playerMove() {
        System.out.println(currentPlayer.getName() + " enter your move(1 - 9)");
        int move = scanner.nextInt();
        int row = (move - 1) / 3;
        int column = (move - 1) % 3;
        try {
            if (isValidMove(row, column)) {
                board[row][column] = currentPlayer.getCell();
            } else {
                playerMove();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            playerMove();
        }
    }

    static void computerMove() {
        int computerMove = generateComputerMove();
        int row = (computerMove - 1) / 3;
        int column = (computerMove - 1) % 3;
        if (isValidMove(row, column)) {
            board[row][column] = currentPlayer.getCell();
        } else {
            computerMove();
        }
    }

    public static void displayBoard() {
        System.out.println("=============");
        for (int count = 0; count < 3; count++) {
            System.out.print("| ");
            for (int counter = 0; counter < 3; counter++) {
                System.out.print(board[count][counter].getValue() + " | ");
            }
            System.out.println("\n=============");
        }
    }

    public static void initializeBoard(Cell[][] board) {
        for (int count = 0; count < 3; count++) {
            for (int counter = 0; counter < 3; counter++) {
                board[count][counter] = Cell.E;
            }
        }
    }

    public static boolean isValidMove(int row, int column) {
        if (row >= 0 && row <= 2 && column >= 0 && column <= 2 && board[row][column] == Cell.E) return true;
        throw new InvalidMoveError("Error: cell is occupied");
    }

    static boolean checkWin(Cell[][] board, Cell cell) {
        for (int count = 0; count < 3; count++) {
            if (board[count][0] == cell && board[count][1] == cell && board[count][2] == cell ||
                    board[0][count] == cell && board[1][count] == cell && board[2][count] == cell)
                return true;
        }
        return board[2][0] == cell && board[1][1] == cell && board[0][2] == cell;
    }

    public static boolean isBoardFull(Cell[][] board) {
        for (int count = 0; count < 3; count++) {
            for (int counter = 0; counter < 3; counter++) {
                if (board[count][counter] == Cell.E) return false;
            }
        }
        return true;
    }

    public static int generateComputerMove() {
        Random random = new Random();
        return random.nextInt(9) + 1;
    }
}
