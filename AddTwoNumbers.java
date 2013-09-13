// Recursive solution. Dirty but worth try.

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return AddOneNode(l1, l2, 0);
    }
    
    public ListNode AddOneNode(ListNode l1, ListNode l2, int carry) {
        if (l1 == null && l2 == null) {
            if (carry == 0) return null;
            return new ListNode(carry);
        }
        
        int result = 0;
        ListNode l1_next = null, l2_next = null;
        if (l1 == null) {
            result = l2.val + carry;
            l2_next = l2.next;
        } else if (l2 == null) {
            result = l1.val + carry;
            l1_next = l1.next;
        } else {
            result = l1.val + l2.val + carry;
            l1_next = l1.next;
            l2_next = l2.next;
        }
        carry = result / 10;
        result = result % 10;
        ListNode result_node = new ListNode(result);
        result_node.next = AddOneNode(l1_next, l2_next, carry);
        return result_node;
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
