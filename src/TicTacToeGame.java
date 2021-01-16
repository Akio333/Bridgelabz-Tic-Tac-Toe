import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {
    public char board[] = new char[10];
    public char userSymbol, computerSymbol;
    public int player = 0;
    public boolean play = true;
    public static Scanner scanner = new Scanner(System.in);

    public void createBoard() {
        for (int i = 1; i < 10; i++) {
            board[i] = ' ';
        }
    }

    public void getUserInput(String symbol) {
        if (symbol.equals("X")) {
            userSymbol = 'X';
            computerSymbol = 'O';
        } else if (symbol.equals("O")) {
            userSymbol = 'O';
            computerSymbol = 'X';
        } else {
            //
        }
    }

    public void printBoard() {
        String horizontalPart = "+---+---+---+";
        for (int i = 0; i < 3; i++) {
            System.out.println(horizontalPart);
            for (int j = 1; j < 4; j++) {
                System.out.print("| " + board[i * 3 + j] + " ");
            }
            System.out.print("|\n");
        }
        System.out.print(horizontalPart);
        System.out.print("\n");
    }

    public boolean makeMove(int index, int player) {
        if (board[index] == ' ') {
            if (player == 0) {
                System.out.println("Computer played: ");
                board[index] = computerSymbol;
            } else {
                System.out.println("Player played: ");
                board[index] = userSymbol;
            }
            printBoard();
            checkWin();
            return false;
        } else {
            return true;
        }
    }

    public void tossForFirstPlay(String toss) {
        int i = (int) Math.round(Math.random()) % 2;
        if ((i == 1 && toss.equals("H")) || (i == 0 && toss.equals("T"))) {
            System.out.println("Congratulations! You've won the Toss.");
            player = 1;
        } else {
            System.out.println("You've lost Toss. Computer plays first.");
            player = 0;
        }
    }

    public void checkWin() {
        if ((board[1] == userSymbol && board[2] == userSymbol && board[3] == userSymbol)) {
            System.out.println("Player Wins!");
            System.exit(0);
        }
        if ((board[4] == userSymbol && board[5] == userSymbol && board[6] == userSymbol)) {
            System.out.println("Player Wins!");
            System.exit(0);
        }
        if ((board[7] == userSymbol && board[8] == userSymbol && board[9] == userSymbol)) {
            System.out.println("Player Wins!");
            System.exit(0);
        }
        if ((board[1] == userSymbol && board[4] == userSymbol && board[7] == userSymbol)) {
            System.out.println("Player Wins!");
            System.exit(0);
        }
        if ((board[2] == userSymbol && board[5] == userSymbol && board[8] == userSymbol)) {
            System.out.println("Player Wins!");
            System.exit(0);
        }
        if ((board[3] == userSymbol && board[6] == userSymbol && board[9] == userSymbol)) {
            System.out.println("Player Wins!");
            System.exit(0);
        }
        if ((board[1] == userSymbol && board[5] == userSymbol && board[9] == userSymbol)) {
            System.out.println("Player Wins!");
            System.exit(0);
        }
        if ((board[3] == userSymbol && board[5] == userSymbol && board[7] == userSymbol)) {
            System.out.println("Player Wins!");
            System.exit(0);
        }
        if ((board[1] == computerSymbol && board[2] == computerSymbol && board[3] == computerSymbol)) {
            System.out.println("Player Lost!");
            System.exit(0);
        }
        if ((board[4] == computerSymbol && board[5] == computerSymbol && board[6] == computerSymbol)) {
            System.out.println("Player Lost!");
            System.exit(0);
        }
        if ((board[7] == computerSymbol && board[8] == computerSymbol && board[9] == computerSymbol)) {
            System.out.println("Player Lost!");
            System.exit(0);
        }
        if ((board[1] == computerSymbol && board[4] == computerSymbol && board[7] == computerSymbol)) {
            System.out.println("Player Lost!");
            System.exit(0);
        }
        if ((board[2] == computerSymbol && board[5] == computerSymbol && board[8] == computerSymbol)) {
            System.out.println("Player Lost!");
            System.exit(0);
        }
        if ((board[3] == computerSymbol && board[6] == computerSymbol && board[9] == computerSymbol)) {
            System.out.println("Player Lost!");
            System.exit(0);
        }
        if ((board[1] == computerSymbol && board[5] == computerSymbol && board[9] == computerSymbol)) {
            System.out.println("Player Lost!");
            System.exit(0);
        }
        if ((board[3] == computerSymbol && board[5] == computerSymbol && board[7] == computerSymbol)) {
            System.out.println("Player Lost!");
            System.exit(0);
        }
    }

    public void computerPlay() {
        // TODO: Implementation computer playing logic
        while (makeMove((int) (Math.random() * 8) + 1, 0)) {
            System.out.println("");
        }
    }

    public void playGame() {
        int i;
        for (i = 0; i < 9; i++) {
            if (player == 0) {
                computerPlay();
                player = 1;
            } else {
                System.out.println("Select Position (1-9): ");
                while (makeMove(scanner.nextInt(), player)) {
                    System.out.println("Try different place.");
                }
                player = 0;
            }
        }
        if (i == 9) {
            System.out.println("Game Draw!");
            System.exit(0);
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Wlcome to Tic Tac Toe!");
        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        ticTacToeGame.createBoard();
        System.out.println("Enter Toss (H or T):");
        ticTacToeGame.tossForFirstPlay(scanner.next());
        System.out.println("Choose Your Symbol (O or X): ");
        ticTacToeGame.getUserInput(scanner.next());
        ticTacToeGame.printBoard();
        ticTacToeGame.playGame();
    }
}
