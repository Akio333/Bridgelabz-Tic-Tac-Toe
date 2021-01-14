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
        String horizontalPart = "+---";
        String verticalPart = "|   ";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(horizontalPart);
            }
            System.out.print("+\n");
            for (int j = 0; j < 3; j++) {
                System.out.print(verticalPart);
            }
            System.out.print("+\n");
        }

    }

    public static void main(String[] args) throws Exception {
        System.out.println("Wlcome to Tic Tac Toe!");
        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        Scanner scanner = new Scanner(System.in);
        ticTacToeGame.createBoard();
        ticTacToeGame.getUserInput(scanner.next());
        ticTacToeGame.printBoard();
    }
}
