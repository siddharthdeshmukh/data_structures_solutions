package interviewBit.algo;

import java.util.LinkedList;
import java.util.List;

final class LinkedListExmple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> linkList = new LinkedList<>();
		
		linkList.add(1);
		linkList.add(2);
		linkList.add(3);
		linkList.stream().forEach(System.out::println);

	}

}
