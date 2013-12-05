
public class DivideTwoIntegers {
	public static void main(String[] args) {
		DivideTwoIntegers test = new DivideTwoIntegers();
		int dividend = Integer.MIN_VALUE;
		int divisor = 2;
		System.out.println(test.divide(dividend, divisor));
		System.out.println(dividend / divisor);
	}
	
	public int divide(int dividend, int divisor) {
		if (divisor == 0) return 0;
		boolean is_neg = false;
		long dividend_long = dividend;
		long divisor_long = divisor;
		if (dividend_long < 0) {
			dividend_long = -dividend_long;
			is_neg = !is_neg;
		}
		if (divisor_long < 0) {
			divisor_long = -divisor_long;
			is_neg = !is_neg;
		}
		
		int index = 0;
		while ((divisor_long << index) <= dividend_long) {
			++index;
		}
		
		long result = 0;
		for (int i = index-1; i >= 0; --i) {
			if ((divisor_long << i) <= dividend_long) {
				result |= (1 << i);
				dividend_long -= (divisor_long << i);
			}
		}
		return is_neg ? (int)-result : (int) result; 
    }
}
