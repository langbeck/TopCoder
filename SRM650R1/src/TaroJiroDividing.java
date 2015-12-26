public class TaroJiroDividing {

	/** Main method for TopCoder */
	public int getNumber(int A, int B) {
		int smallInt;

		// A or B is odd
		if ((A % 2 != 0) || (B % 2 != 0))
			return 0;

		// It is enough to compute the smallest number
		if (A > B) {
			smallInt = B;
		} else {
			smallInt = A;
		}

		// Compute turns
		int turns = 1;
		while (smallInt % 2 == 0) {
			turns++;
			smallInt = smallInt / 2;
		}

		return turns;
	}

}