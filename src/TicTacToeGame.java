public class TicTacToeGame {
    public char board[] = new char[10];

    TicTacToeGame() {
        createBoard();
    }

    public void createBoard() {
        for (int i = 1; i < 10; i++) {
            board[i] = ' ';
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Wlcome to Tic Tac Toe!");
        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        ticTacToeGame.createBoard();
    }
}
