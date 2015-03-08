public class RobotOnMoonEasy {

	private static char empty = '.';
	private static char robot = 'S';
	private static char obstacle = '#';

	/** Main method for TopCoder */
	String isSafeCommand(String[] board, String s) {

		// Board size
		int boardXSize = board[0].length();
		int boardYSize = board.length;

		// Initial position
		int robotXPos = 0;
		int robotYPos = 0;
		for (int i = 0; i < boardYSize; i++) {
			if (board[i].indexOf("S") != -1) {
				robotXPos = board[i].indexOf("S");
				robotYPos = i;
				break;
			}
		}

		// Execute commands
		for (int i = 0; i < s.length(); i++) {
			char[] cBoard;
			switch (s.charAt(i)) {
			case 'U':
				if (robotYPos == 0)
					return "Dead";
				if (board[robotYPos - 1].charAt(robotXPos) == obstacle)
					continue;
				// Move robot to new position
				cBoard = board[robotYPos - 1].toCharArray();
				cBoard[robotXPos] = robot;
				board[robotYPos - 1] = String.valueOf(cBoard);
				// Update old position
				board[robotYPos] = board[robotYPos].replace(robot, empty);
				// Update coordinates
				robotYPos--;
				break;
			case 'D':
				if (robotYPos == boardYSize - 1)
					return "Dead";
				if (board[robotYPos + 1].charAt(robotXPos) == obstacle)
					continue;
				// Move robot to new position
				cBoard = board[robotYPos + 1].toCharArray();
				cBoard[robotXPos] = robot;
				board[robotYPos + 1] = String.valueOf(cBoard);
				// Update old position
				board[robotYPos] = board[robotYPos].replace(robot, empty);
				// Update coordinates
				robotYPos++;
				break;
			case 'L':
				if (robotXPos == 0)
					return "Dead";
				if (board[robotYPos].charAt(robotXPos - 1) == obstacle)
					continue;
				// Move robot to new position
				cBoard = board[robotYPos].toCharArray();
				cBoard[robotXPos] = empty;
				cBoard[robotXPos - 1] = robot;
				board[robotYPos] = String.valueOf(cBoard);
				// Update coordinates
				robotXPos--;
				break;
			case 'R':
				if (robotXPos == boardXSize - 1)
					return "Dead";
				if (board[robotYPos].charAt(robotXPos + 1) == obstacle)
					continue;
				// Move robot to new position
				cBoard = board[robotYPos].toCharArray();
				cBoard[robotXPos] = empty;
				cBoard[robotXPos + 1] = robot;
				board[robotYPos] = String.valueOf(cBoard);
				// Update coordinates
				robotXPos++;
				break;
			}

		}

		return "Alive";
	}

}