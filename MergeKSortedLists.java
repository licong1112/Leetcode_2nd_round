import java.util.ArrayList;

public class MergeKSortedLists {	
	public ListNode mergeKLists(ArrayList<ListNode> lists) {
		if (lists == null || lists.size() == 0) return null;
        if (lists.size() == 1) return lists.get(0);
        ArrayList<ListNode> new_lists = new ArrayList<ListNode>();
        for (int i = 0; i < lists.size(); i += 2) {
        	ListNode newlist = new ListNode(0); // fake head
        	if (i != lists.size()-1) {
        		mergeTwoLists(lists.get(i), lists.get(i+1), newlist);
        		new_lists.add(newlist.next);
    		} else {
    			new_lists.add(lists.get(i));
			}
    	}
        return mergeKLists(new_lists);
    }
	
	public void mergeTwoLists(ListNode list1, ListNode list2, ListNode merged_list) {
		if (list1 == null && list2 == null) return; 
		if (list1 == null || (list2 != null && list1.val > list2.val)) {
			merged_list.next = new ListNode(list2.val);
			mergeTwoLists(list1, list2.next, merged_list.next);
		} else {
			merged_list.next = new ListNode(list1.val);
			mergeTwoLists(list1.next, list2, merged_list.next);
		}
	}	
	
	class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
			next = null;
		}
	}
}


