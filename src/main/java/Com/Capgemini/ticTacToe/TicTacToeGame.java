package Com.Capgemini.ticTacToe;

public class TicTacToeGame {

	public static char[] createBoard() {
		char[] ticTacBoard = new char[10];
		for (int i = 0; i < 10; i++) {
			ticTacBoard[i] = ' ';
		}
		return ticTacBoard;
	}

	public static void main(String[] args) {
		createBoard();
	}
}
