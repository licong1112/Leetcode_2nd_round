
public class RemoveDuplicatesFromSortedArray {
	public int removeDuplicates(int[] A) {
		int position = (A.length == 0 ? 0 : 1);
        for (int i = 1; i < A.length; ++i) {
        	if (A[i] != A[i-1]) {
        		A[position++] = A[i];
        	}
        }
        return position;
    }
}
