package interviewBit.linkedList;

import java.util.LinkedList;
import java.util.List;

final class LinkedListExmple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new LinkedListExmple().new ListNode(1);
		ListNode secondNode = new LinkedListExmple().new ListNode(2);
		head.next=secondNode;
		ListNode thirdNode = new LinkedListExmple().new ListNode(3);
		secondNode.next=thirdNode;
		ListNode fourthNode = new LinkedListExmple().new ListNode(4);
		thirdNode.next=fourthNode;
		ListNode fifthNode = new LinkedListExmple().new ListNode(5);
		fourthNode.next=fifthNode;

		System.out.println("No of Elements in linked list are " + traversingLinkList(head));
		
		head = insertAtBeginning(head,0);
		System.out.println("No of Elements in linked list after insertion at beginning  are " + traversingLinkList(head));
		
		head = insertAtTheEnd(head,6);
		System.out.println("No of Elements in linked list after insertion at end are " + traversingLinkList(head));
		
		insertAfterGivenNode(thirdNode, 3);
		System.out.println("No of Elements in linked list after insertion after third node are " + traversingLinkList(head));
	}
	
	static int traversingLinkList(ListNode node) {
		
		ListNode currentNode = node;
		int count =0;
		while(currentNode!=null) {
			count=count+1;
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}
		
		return count;
		
	}
	
	static ListNode insertAtBeginning(ListNode node,int data) {
		ListNode newNode = new LinkedListExmple().new ListNode(data);
		newNode.next=node;
		return newNode;
	}
	
	static ListNode insertAtTheEnd(ListNode head, int data) {
		ListNode newNode = new LinkedListExmple().new ListNode(data);
		if(head ==null) {
			head = newNode;
			return head;
		}
		ListNode endNode = head;
		while(endNode.next!=null) {
			endNode= endNode.next;
		}
		endNode.next=newNode;
		
		return head;
	}
	
	static void insertAfterGivenNode(ListNode prev_node, int data) {
		
		if(prev_node==null) {
			System.out.println("Wrong prev node");
			return;
		}
		ListNode newNode = new LinkedListExmple().new ListNode(data);
		newNode.next=prev_node.next;
		prev_node.next=newNode;
	}
	
	class ListNode {
		private int data;
		ListNode next;
		
		ListNode(int data){
			this.data=data;
			next=null;
		}
	}

}
