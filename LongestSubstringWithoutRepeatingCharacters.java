import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) return s.length();
        HashSet<Character> set = new HashSet<Character>();
        int max_length = 0;
        for (int start = 0, end = 0; end < s.length(); ++end) {
        	if (set.contains(s.charAt(end))) {
        		while (start < end && s.charAt(start) != s.charAt(end)) {
        			set.remove(s.charAt(start++));
        		}
        		++start;
        	} else {
        		set.add(s.charAt(end));
        		max_length = Math.max(max_length, set.size());
        	}
        }
        return max_length;
    }
}
