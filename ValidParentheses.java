import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
	public static void main(String[] args) {
		ValidParentheses test = new ValidParentheses();
		System.out.println(test.isValid("(())()[]{}"));
	}
	public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('(', 1);
        map.put(')', 2);
        map.put('[', 3);
        map.put(']', 4);
        map.put('{', 5);
        map.put('}', 6);
        
        for (int i = 0; i < s.length(); ++i) {
        	char current = s.charAt(i);
        	if (stack.isEmpty() || map.get(current) % 2 == 1 || map.get(current) != map.get(stack.peek())+1) {
        		stack.push(s.charAt(i));
        	} else {
        		stack.pop();
        	}
        }
        return stack.isEmpty();
    }
}
