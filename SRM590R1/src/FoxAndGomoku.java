// Score 223.07 / 250 points
public class FoxAndGomoku {

	private char emptyCell = '.';
	private char jiroPiece = 'o';
	private int n;

	/** Main method for TopCoder */
	public String win(String[] board) {

		n = board.length;

		for (int x = 0; x < n; x++) {
			for (int y = 0; y < n; y++) {
				if (board[x].charAt(y) == jiroPiece) {
					// checks horizontal
					// only if there are at least 4 more pieces right to (y)
					if ((y < n - 4) && (board[x].charAt(y + 1) == jiroPiece)
							&& (board[x].charAt(y + 2) == jiroPiece)
							&& (board[x].charAt(y + 3) == jiroPiece)
							&& (board[x].charAt(y + 4) == jiroPiece))
						return "found";
					// checks vertical
					// only if there are at least 4 more pieces below (x)
					if ((x < n - 4) && (board[x + 1].charAt(y) == jiroPiece)
							&& (board[x + 2].charAt(y) == jiroPiece)
							&& (board[x + 3].charAt(y) == jiroPiece)
							&& (board[x + 4].charAt(y) == jiroPiece))
						return "found";
					// checks forward diagonal
					// only if there are at least 4 more pieces below (x) and
					// right to (y)
					if ((x < n - 4) && (y < n - 4)
							&& (board[x + 1].charAt(y + 1) == jiroPiece)
							&& (board[x + 2].charAt(y + 2) == jiroPiece)
							&& (board[x + 3].charAt(y + 3) == jiroPiece)
							&& (board[x + 4].charAt(y + 4) == jiroPiece))
						return "found";
					// checks backward diagonal
					if ((x < n - 4) && (y >= 4)
							&& (board[x + 1].charAt(y - 1) == jiroPiece)
							&& (board[x + 2].charAt(y - 2) == jiroPiece)
							&& (board[x + 3].charAt(y - 3) == jiroPiece)
							&& (board[x + 4].charAt(y - 4) == jiroPiece))
						return "found";
				}
			}
		}

		return "not found";

	}

}