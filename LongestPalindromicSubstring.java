public class LongestPalindromicSubstring {        
    public String longestPalindrome(String s) {
        int max_length = Integer.MIN_VALUE;
    	int[] pair = new int[2];
    	for (int i = 0; i < s.length(); ++i) {
            max_length = process(i-1, i+1, s, pair, max_length);
            max_length = process(i, i+1, s, pair, max_length);
        }
        return s.substring(pair[0], pair[1]);
    }
    
    public int process (int start, int end, String s, int[] pair, int max_length) {
    	while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
    		--start;
            ++end;
        }
        if (max_length < end-start-3) {
            pair[0] = start+1;
            pair[1] = end;
        }
        return Math.max(max_length, end-start-3);
    }
}
