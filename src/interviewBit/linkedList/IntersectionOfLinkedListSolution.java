package interviewBit.linkedList;


public class IntersectionOfLinkedListSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode getIntersectionNode(ListNode a, ListNode b) {
		int m = getLengthofLinkList(a);
		int n = getLengthofLinkList(b);
		int difference = n - m;
		if (m > n) {
			ListNode temp = a;
			a = b;
			b = temp;
			difference = m - n;
		}

		for (int i = 0; i < difference; i++) {
			b = b.next;
		}

		while (a != null && b != null) {
			if (a.equals(b)) {
				return a;
			}
			a = a.next;
			b = b.next;
		}

		return null;
	}

	static int getLengthofLinkList(ListNode node) {

		ListNode currentNode = node;
		int count = 0;
		while (currentNode != null) {
			count = count + 1;
			currentNode = currentNode.next;
		}

		return count;

	}

	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			this.val = x;
			next = null;
		}
	}

}
