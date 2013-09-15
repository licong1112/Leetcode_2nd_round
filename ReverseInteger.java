
public class ReverseInteger {
	public static void main(String[] args) {
		ReverseInteger test = new ReverseInteger();
		System.out.println(test.reverse(-10));
		
		Long test_long = new Long(Integer.MAX_VALUE) +10;
		System.out.println(test_long);
		System.out.println(test_long.intValue());
	}
	
	public int reverse(int x) {
		if (Math.abs(x) <= 9) return x;
		boolean is_negative = (x < 0);
		x = Math.abs(x);
		StringBuilder sb = new StringBuilder();
		int digit = 0;
		
		while (x > 0) {
			digit = x%10;
			sb.append(digit);
			x = x/10;
		}
		
		Long reversed_num = Long.parseLong(sb.toString());
		if (is_negative) {
			return -1*reversed_num < Integer.MIN_VALUE ? Integer.MIN_VALUE : -1*reversed_num.intValue();
		} else {
			return reversed_num > Integer.MAX_VALUE ? Integer.MAX_VALUE : reversed_num.intValue();
		}
    }
}
