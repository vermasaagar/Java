public class Banking {

	private static final int MIN_PASSWORD_LENGTH = 6;
	private static final int MAX_PASSWORD_LENGTH = 12;
	private static final int BANK_CHARGES = 100;

	public static boolean validateLogin(String username, String password) {
		if (username == null || password == null) {
			return false;
		}
		if (password.length() < MIN_PASSWORD_LENGTH || password.length() > MAX_PASSWORD_LENGTH) {
			return false;
		}
		
		boolean hasSmallLetter = false;
		for (char c : password.toCharArray()) {
			if (Character.isLowerCase(c)) {
				hasSmallLetter = true;
				break;
			}
		}
		if (!hasSmallLetter) {
			return false;
		}
		
		boolean hasNumber = false;
		for (char c : password.toCharArray()) {
			if (Character.isDigit(c)) {
				hasNumber = true;
				break;
			}
		}
		if (!hasNumber) {
			return false;
		}
		
		boolean hasCapitalLetter = false;
		for (char c : password.toCharArray()) {
			if (Character.isUpperCase(c)) {
				hasCapitalLetter = true;
				break;
			}
		}
		if (!hasCapitalLetter) {
			return false;
		}
		
		boolean hasSpecialChar = false;
		for (char c : password.toCharArray()) {
			if (c == '$' || c == '#' || c == '@') {
				hasSpecialChar = true;
				break;
			}
		}
		if (!hasSpecialChar) {
			return false;
		}
		return true;
	}

	public static boolean performTransaction(int amount, int accountBalance) {
		if (amount + BANK_CHARGES > accountBalance) {
			return false;
		}
		return true;
    }
}
