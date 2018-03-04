package codility.xtremax;

public class BinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree root = new Tree();
		root.x= 8;
		root.left = new Tree();
		root.left.x = 2;
		root.left.left = new Tree();
		root.left.left.x =8;
		root.left.right = new Tree();
		root.left.right.x = 7;
		root.right = new Tree();
		root.right.x = 6;
		int visibleNodes = solution(root);
		System.out.println(visibleNodes);

	}
	public static int solution(Tree T) {
        // write your code in Java SE 8
		int visbleNode = 0;
		if(T !=null){
			visbleNode=	visibleNodesSum(T, Integer.MIN_VALUE);
		}
		return visbleNode;
    }
	
	private static int visibleNodesSum(Tree T, int maxValue){
		
		int count =0;
		if(T == null){
			return 0;
		}
		if(T.x >= maxValue){
			count = 1;
			maxValue = T.x;
		}
		count = count+	visibleNodesSum(T.left, maxValue)+ visibleNodesSum(T.right, maxValue);
		return count;
	}
	
	static class Tree {
		int x;
		Tree left;
		Tree right;
	}

}
