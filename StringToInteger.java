public class StringToInteger {
	public int atoi(String str) {
        if (str == null || str.length() == 0) return 0;
		int index = 0;
        while (index < str.length() && str.charAt(index) == ' ') {
        	++index;
        }
        if (index == str.length()) return 0;
        boolean is_negative = false;
        if (str.charAt(index) == '-' || str.charAt(index) == '+') {
        	is_negative = str.charAt(index) == '-';
        	++index;
        }
        int index_digit = index, count = 0;
        long result = 0;
        int curr_digit = 0;
        while (index_digit < str.length() && count <= 10) {
        	curr_digit = str.charAt(index_digit) - '0';
        	if (curr_digit >= 0 && curr_digit <= 9) {
        		result = result*10 + curr_digit;
        		++count;
        		++index_digit;
        	} else {
        		break;
        	}
        }
        if (index_digit == index) return 0;
        if (!is_negative) return (int)Math.min(Integer.MAX_VALUE, result);
        return (int)Math.max(Integer.MIN_VALUE, -result);
    }
}