package tribonnaci;

public class tribonnaci {
	/*
	 * The Tribonacci sequence Tn is defined as follows:
	 * 
	 * T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
	 * 
	 * Given n, return the value of Tn.
	 * 
	 * @param the number of sequence
	 * @return the value of T(n)
	 */
	public int checkTribonacci(int n) {

		int numList[] = new int[n];
		int value = 0;

		//if n is 0, then return 0
		//if n is 1 or 2, then return 1
		if (n <= 2) {
			if (n == 0) {
				return 0;
			} else {
				return 1;
			}
		}

		//If n is not 0 or 1 or 2, then assign numbers accordingly
		numList[0] = 0;
		numList[1] = 1;
		numList[2] = 1;

		// find value for each value after T(3)
		for (int i = 3; i < n; i++) {
			numList[i] = numList[i - 1] + numList[i - 2] + numList[i - 3];
		}

		// Add all the numbers in the list
		for (int i = (n - 3); i < n; i++) {
			value += numList[i];
		}

		return value;

	}
}
