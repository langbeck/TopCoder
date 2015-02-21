public class KitayutaMart2 {

	/** Main method for TopCoder */
	// k = initial price, t = total paid
	public int numBought(int K, int T) {

		int totalPaid = 0;
		int apples;
		for (apples = 1; totalPaid < T; apples++) {
			totalPaid += ((int) Math.pow(2, apples - 1)) * K;
		}
		return apples - 1;
	}

}