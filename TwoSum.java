import java.util.HashMap;

public class TwoSum {
	public int[] twoSum(int[] numbers, int target) {
        int[] solution = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; ++i) {
        	map.put(numbers[i], i);
        }
        for (int i = 0; i < numbers.length; ++i) {
        	if (map.containsKey(target - numbers[i])) {
        		int second_index = map.get(target - numbers[i]); 
        		solution[0] = Math.min(i, second_index) + 1;
        		solution[1] = Math.max(i, second_index) + 1;
        		break;
        	}
        }
        return solution;
    }
}