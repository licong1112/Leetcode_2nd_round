import java.util.ArrayList;


public class LetterCombinationsOfAPhoneNumber {
	public static final String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	
	public ArrayList<String> letterCombinations(String digits) {
        ArrayList<String> result = new ArrayList<String>();
        helper(digits, 0, result, new StringBuilder());
        return result;
    }
	
	public void helper(String digits, int index, ArrayList<String> result, StringBuilder str) {
		if (index == digits.length()) {
			result.add(str.toString());
			return;
		}
		
		int map_index = digits.charAt(index)-'0';
		for (int i = 0; i < map[map_index].length(); ++i) {
			str.append(map[map_index].charAt(i));
			helper(digits, index+1, result, str);
			str.deleteCharAt(str.length()-1);
		}
	}
}
