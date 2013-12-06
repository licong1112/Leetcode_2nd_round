import java.util.ArrayList;
import java.util.HashMap;

public class SubstringWithConcatenationOfAllWords {
	
	public ArrayList<Integer> findSubstring(String S, String[] L) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if (L.length == 0) return result;
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (String str : L) {
        	if (map.containsKey(str)) {
        		map.put(str, map.get(str)+1);
        	} else {
        		map.put(str, 1);
        	}
        }
        int substr_length = L[0].length();
        
        for (int i = 0; i + L.length*substr_length <= S.length(); ++i) {
        	if (dfs(S, i, map, substr_length, L.length)) {
        		result.add(i);
        	}
        }
        return result;
    }
	
	public boolean dfs(String str, int index, HashMap<String, Integer> map, int substr_length, int num_words) {
		if (num_words == 0) return true;
		
		String substr = str.substring(index, index+substr_length);
		if (!map.containsKey(substr) || map.get(substr) <= 0) return false;
		
		map.put(substr, map.get(substr)-1);
		boolean is_success = dfs(str, index+substr_length, map, substr_length, num_words-1);
		map.put(substr, map.get(substr)+1);
		
		return is_success;
	}
}
