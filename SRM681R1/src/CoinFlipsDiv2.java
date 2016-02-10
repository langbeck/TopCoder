public class CoinFlipsDiv2 {

	/** Main method for TopCoder */
	public int countCoins(String state) {
		int coins = state.length();

		if ((coins == 0) || (coins == 1)) {
			return 0;
		}

		char[] coinsArray = state.toCharArray();

		if (coinsArray[0] != coinsArray[1]) {
			return 2;
		}

		int count = 0;
		if (coinsArray[0] != coinsArray[1]) {
			count = 2;
		}

		for (int i = 1; i < coinsArray.length - 1; i++) {
			if ((coinsArray[i - 1] != coinsArray[i]) || (coinsArray[i] != coinsArray[i + 1]))
				count++;
		}

		if (coinsArray[coins - 2] != coinsArray[coins - 1]) {
			count++;
		}

		return count;
	}

}
