public class PalindromeNumber {
	public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int multiplier_1 = 1;
        while (x/multiplier_1 > 9) {
        	multiplier_1 *= 10;
        }

        while (x > 0 && x/multiplier_1 == x%10) {
        	x %= multiplier_1;
        	x /= 10;
        	multiplier_1 /= 100;
        }
        if (x == 0) return true;
        return false;
    }
}