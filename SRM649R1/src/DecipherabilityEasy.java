public class DecipherabilityEasy {

	/** Main method for TopCoder */
	// s contains t
	public String check(String s, String t) {

		if (s.equalsIgnoreCase(t))
			return "Impossible";
		if (s.length() != t.length() + 1)
			return "Impossible";

		boolean missingFirstLetterFound = false;

		StringBuilder sbt = new StringBuilder(t);

		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == sbt.charAt(i)) {
				// Found same char
				continue;
			} else {
				// Is it the first missing letter found?
				if (missingFirstLetterFound == true) {
					// At least two missing letters
					return "Impossible";
				}
				// First missing letter found
				missingFirstLetterFound = true;
				sbt.insert(i, " ");
			}
		}
		return "Possible";
	}

}