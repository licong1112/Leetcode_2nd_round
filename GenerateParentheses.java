import java.util.ArrayList;

public class GenerateParentheses {
	public ArrayList<String> generateParenthesis(int n) {
        ArrayList<String> result = new ArrayList<String>();
        Helper(result, new StringBuilder(), 0, 0, n, 0);
        return result;
    }
	
	public void Helper(ArrayList<String> result, StringBuilder str, int left, int right, int n, int total) {
		if (total == 2*n) {
			result.add(str.toString());
			return;
		}
		
		if (left < n) {
			str.append('(');
			Helper(result, str, left+1, right, n, total+1);
			str.deleteCharAt(str.length()-1);
		}
		if (right < left) {
			str.append(')');
			Helper(result, str, left, right+1, n, total+1);
			str.deleteCharAt(str.length()-1);
		}
	}
}
