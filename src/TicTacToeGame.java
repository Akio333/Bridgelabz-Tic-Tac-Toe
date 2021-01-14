import java.util.Scanner;

public class TicTacToeGame {
    public char board[] = new char[10];
    public char userSymbol, computerSymbol;

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

    public void makeMove(int i) {
        if (board[i] == ' ') {
            board[i] = userSymbol;
        } else {
            System.out.println("Already occupied place.");
        }
        printBoard();
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Wlcome to Tic Tac Toe!");
        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        Scanner scanner = new Scanner(System.in);
        ticTacToeGame.createBoard();
        System.out.println("Choose Your Symbol (O or X): ");
        ticTacToeGame.getUserInput(scanner.next());
        ticTacToeGame.printBoard();
        System.out.println("Enter Move (1-9): ");
        ticTacToeGame.makeMove(scanner.nextInt());
    }
}
