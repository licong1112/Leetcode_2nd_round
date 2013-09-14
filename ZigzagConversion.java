// This problem is boring. I don't expect it to be asked on interview.

public class ZigzagConversion {
	public String convert(String s, int nRows) {
        if (s.length() < nRows || nRows == 1) return s;
		StringBuilder result = new StringBuilder();
        for (int row = 1; row <= nRows; ++row) {
        	processRow(s, row, nRows, result);
        }
        return result.toString();
    }
    
    public void processRow(String s, int row, int n_rows, StringBuilder result) {
    	int i = row-1;
    	result.append(s.charAt(i));
    	while (i < s.length()) {
    		int first = i + (2*(n_rows-row));
    		if (first != i && first < s.length()) {
    			result.append(s.charAt(first));
    		}
    		int second = first + (2*(row-1));
    		if (second != first && second < s.length()) {
    			result.append(s.charAt(second));
    		}
    		i = second;
    	}
    }
}
