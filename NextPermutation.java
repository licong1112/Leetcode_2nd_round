
public class NextPermutation {
	public void nextPermutation(int[] num) {
        int index = num.length-1;
        while (index > 0 && num[index] <= num[index-1]) {
        	--index;
        }
        if (index == 0) {
        	reverse(num, 0, num.length-1); 
        	return;
        }
        int swap_start = index-1;
        index = num.length-1;
        while (num[index] <= num[swap_start]) {
        	--index;
        }
        swap(num, swap_start, index);
        reverse(num, swap_start+1, num.length-1);
    }
	
	public void reverse(int[] num, int start, int end) {
		while (start < end) {
			swap(num, start++, end--);
		}
	}
	
	public void swap(int[] num, int start, int end) {
		int temp = num[start];
		num[start] = num[end];
		num[end] = temp;
	}
}
