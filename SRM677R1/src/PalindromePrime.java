public class PalindromePrime {

	/** Main method for TopCoder */
	public int count(int L, int R) {

		int matches = 0;

		for (int i = L; i <= R; i++) {
			String num = Integer.toString(i);

			if (isPalindrome(num)) {
				if (isPrime(Integer.parseInt(num))) {
					matches++;
				}
			}
		}

		return matches;
	}

	private boolean isPalindrome(String num) {
		StringBuilder sb = new StringBuilder(num);
		StringBuilder sbReverse = new StringBuilder(num).reverse();
		if (sb.toString().equals(sbReverse.toString())) {
			return true;
		} else {
			return false;
		}
	}

	private boolean isPrime(int num) {
		if (num == 1)
			return false;
		if (num == 2)
			return true;
		if (num % 2 == 0)
			return false;
		for (int i = 3; i * i <= num; i += 2)
			if (num % i == 0)
				return false;
		return true;
	}

}
