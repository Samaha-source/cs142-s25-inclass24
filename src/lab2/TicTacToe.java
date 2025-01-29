package lab2;

import java.awt.*;

/** The three-in-a-row game for two human players. */
public class TicTacToe {

    /**
     * Draws the state of board, including a game over message if applicable.
     */
    public static void draw(SimpleCanvas canvas, char[][] board) {
        canvas.clear();
        canvas.setPenColor(Color.BLACK);
        canvas.drawLine(0, 100, 300, 100);
        canvas.drawLine(0, 200, 300, 200);
        canvas.drawLine(100, 0, 100, 300);
        canvas.drawLine(200, 0, 200, 300);
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                int centerX = 100 * col + 50;
                int centerY = 100 * row + 50;
                if (board[row][col] == 'X') {
                    canvas.setPenColor(Color.RED);
                    canvas.drawFilledCircle(centerX, centerY, 50);
                }
                else if (board[row][col] == 'O') {
                    canvas.setPenColor(Color.BLUE);
                    canvas.drawFilledCircle(centerX, centerY, 50);
                }
            }
        }
        canvas.setPenColor(Color.BLACK);
        char whoWins = winner(board);
        if (whoWins != '-') {
            canvas.drawStringCentered(150, 150, whoWins + " wins!", 40);
        } else if (isFull(board)) {
            canvas.drawStringCentered(150, 150, "Tie game!", 40);
        }
        canvas.update(); // like .show(), but for when the canvas is already visible.
    }

    /** Returns true if the game is over. */
    public static boolean gameOver(char[][] board) {
        return (winner(board) != '-') || isFull(board);
    }

    /**
     * Handles a mouse click, placing currentPlayer's mark in the square on which the
     * user clicks.
     */
    public static void handleMouseClick(SimpleCanvas canvas, char[][] board, char currentPlayer) {
        boolean madeValidMove = false;
        while (!madeValidMove) {
            canvas.waitForClick();

            int mouseX = canvas.getMouseClickX();
            int mouseY = canvas.getMouseClickY();

            int row = mouseY / 100;
            int col = mouseX / 100;

            if (board[row][col] == ' ') {
                board[row][col] = currentPlayer;
                madeValidMove = true;
            }
        }
    }

    /** Returns true if board is full. */
    public static boolean isFull(char[][] board) {
        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board[x].length; y++) {
                if (board[x][y] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    /** Plays the game. */
    public static void main(String[] args) {
        SimpleCanvas canvas = new SimpleCanvas(300, 300);
        canvas.show(); // make the canvas visible on the screen.

        char[][] board = new char[3][3];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = ' ';
            }
        }

        char currentPlayer = 'X';
        draw(canvas, board);
        while (!gameOver(board)) {
            handleMouseClick(canvas, board, currentPlayer);
            currentPlayer = opposite(currentPlayer);
            draw(canvas, board);
        }
    }

    /** Returns the opposite player's character. */
    public static char opposite(char player) {
        if (player == 'X') {
            return 'O';
        } else {
            return 'X';
        }
    }

    /**
     * Returns the character ('X' or 'O') of the winning player, or '-' if there
     * is no winner.
     */
    public static char winner(char[][] board) {

        // Section A
        for (int row = 0; row < board.length; row++) {
            boolean allMatch = true;
            for (int col = 1; col < board[0].length; col++) {
                if (board[row][col] != board[row][0]) {
                    allMatch = false;
                    break;
                }
            }
            if (board[row][0] != ' ' && allMatch) {
                return board[row][0];
            }
        }

        // Section B
        for (int col = 0; col < board.length; col++) {
            boolean allMatch = true;
            for (int row = 1; row < board[0].length; row++) {
                if (board[row][col] != board[0][col]) {
                    allMatch = false;
                    break;
                }
            }
            if (board[0][col] != ' ' && allMatch) {
                return board[0][col];
            }
        }

        // Section C
        boolean allMatch = true;
        for (int row = 0; row < board.length; row++) {
            if (board[row][row] != board[0][0]) {
                allMatch = false;
                break;
            }
        }
        if (board[0][0] != ' ' && allMatch) {
            return board[0][0];
        }

        // Section D
        int col = board[0].length - 1;
        allMatch = true;
        for (int row = 0; row < board.length; row++) {
            if (board[row][col] != board[0][board[0].length-1]) {
                allMatch = false;
                break;
            }
            col--;
        }
        if (board[0][board[0].length-1] != ' ' && allMatch) {
            return board[0][board[0].length-1];
        }

        return '-';
    }

}
