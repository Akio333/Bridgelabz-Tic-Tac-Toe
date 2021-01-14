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

    public static void main(String[] args) throws Exception {
        System.out.println("Wlcome to Tic Tac Toe!");
        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        Scanner scanner = new Scanner(System.in);
        ticTacToeGame.createBoard();
        ticTacToeGame.getUserInput(scanner.next());
    }
}
