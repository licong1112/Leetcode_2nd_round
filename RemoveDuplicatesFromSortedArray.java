
public class RemoveDuplicatesFromSortedArray {
	public int removeDuplicates(int[] A) {
		int position = (A.length == 0 ? 0 : 1);
        int i = 1;
        for (; i < A.length; ++i) {
        	if (A[i] != A[i-1]) {
        		A[position++] = A[i];
        	}
        }
        return position;
    }
}
