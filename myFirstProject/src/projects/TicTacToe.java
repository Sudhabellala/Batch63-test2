package projects;

import java.util.Scanner;

public class TicTacToe {
	static char currentPlayer = 'X';
	static char[][] board = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };

	static void board() {
		System.out.println("-------");
		for (int i = 0; i < 3; i++) {
			System.out.print("|");
			for (int j = 0; j < 3; j++) {
				System.out.print(board[i][j] + "|");
			}
			System.out.println();
			System.out.println("-------");
		}
	}

	static boolean isValid(int i, int j) {
		if (i < 0 || i > 2 || j < 0 || j > 2 || board[i][j] != ' ') {
			return false;
		}
		return true;
	}

	static boolean isWinner(char currentPlayer) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if ((board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer)
						|| (board[0][i] == currentPlayer && board[1][i] == currentPlayer
								&& board[2][i] == currentPlayer)
						|| (board[0][0] == currentPlayer && board[1][1] == currentPlayer
								&& board[2][2] == currentPlayer)
						|| (board[0][2] == currentPlayer && board[1][1] == currentPlayer
								&& board[2][0] == currentPlayer)) {
					return true;
				}

			}
		}
		return false;
	}

	static boolean isDraw() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[i][j] == ' ') {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("GAME STARTED!");
		Scanner sc = new Scanner(System.in);

		while (true) {
			board();
			System.out.println("Current Player--->" + currentPlayer + " \nEnter Your Move: ");
			System.out.println("Enter your choice of row: ");
			int row = sc.nextInt();
			System.out.println("Enter your choice of column: ");
			int column = sc.nextInt();
			if (isValid(row, column)) {
				board[row][column] = currentPlayer;
				if (isWinner(currentPlayer)) {
					System.out.println(currentPlayer + "----> is Winner");
					break;
				}
				if (isDraw()) {
					System.out.println("The game is Draw!");
					board();
					break;
				}
				currentPlayer = currentPlayer == 'X' ? 'O' : 'X';
			} else {
				System.out.println("INVALID ENTRY!! TRY AGAIN");
				continue;
			}
		}
		sc.close();
	}
}
