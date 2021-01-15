import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {
    public char board[] = new char[10];
    public char userSymbol, computerSymbol;
    public int player = 0;
    public boolean play = true;

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

    public static void main(String[] args) throws Exception {
        System.out.println("Wlcome to Tic Tac Toe!");
        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        Scanner scanner = new Scanner(System.in);
        ticTacToeGame.createBoard();
        System.out.println("Enter Toss (H or T):");
        ticTacToeGame.tossForFirstPlay(scanner.next());
        System.out.println("Choose Your Symbol (O or X): ");
        ticTacToeGame.getUserInput(scanner.next());
        ticTacToeGame.printBoard();
        System.out.println("Enter Move (1-9): ");
        while (ticTacToeGame.play) {
            ticTacToeGame.play = ticTacToeGame.makeMove(scanner.nextInt(), 1);
        }
    }
}
