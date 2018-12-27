package Question31_40;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.Executor;


//打印二叉树的几种操作
public class Main32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binaryTreeNode root1 = new binaryTreeNode(0);
		binaryTreeNode b1 = new binaryTreeNode(1);
		binaryTreeNode b2 = new binaryTreeNode(2);
		binaryTreeNode b3 = new binaryTreeNode(3);
		binaryTreeNode b4 = new binaryTreeNode(4);
		binaryTreeNode b5 = new binaryTreeNode(5);
		binaryTreeNode b6 = new binaryTreeNode(6);
		binaryTreeNode b7 = new binaryTreeNode(7);
		binaryTreeNode b8 = new binaryTreeNode(8);
		binaryTreeNode b9 = new binaryTreeNode(9);
		binaryTreeNode b10 = new binaryTreeNode(10);
		root1.left = b1;root1.right = b2;
		b1.left = b3;b1.right = b4;b2.left = b7;b2.right = b8;
		b4.left = b5;b4.right = b6;
		b8.right = b9; b6.left = b10;
		
		printFromTopToBottom(root1);
	}
	
	//打印二叉树1，按照行顺序打印二叉树，也即是层序遍历,使用了递归的思想
	public static void printBinaryTree1(binaryTreeNode head) {
		if(head == null)
			return;
		Queue<binaryTreeNode> queue = new LinkedList();
		printBinaryTree1Core(head, queue);
	}
	public static void printBinaryTree1Core(binaryTreeNode head,Queue<binaryTreeNode> queue) {
		System.out.print(head.val+",");
		if(head.left != null) 
			queue.add(head.left);
		if(head.right != null)
			queue.add(head.right);
		
		while(!queue.isEmpty()) {
			printBinaryTree1Core(queue.poll(),queue);
		}
	}
	
	//-----------------不使用递归的方法，按行打印-----------------
	//多使用两个变量，一个记录在当前层还没有打印出的节点数。另一个记录下一层的节点数。
	public static void printFromTopToBottom(binaryTreeNode head) {
		if(head == null)
			return;
		Queue<binaryTreeNode> queue = new LinkedList();
		queue.add(head);
		int nextCount = 0;//待记录
		int noPrintCount = 1;//下一行待输出的节点数为1一个head节点
		while(!queue.isEmpty()) {
			binaryTreeNode tmpNode = queue.poll();
			System.out.print(tmpNode.val+" ,");
			noPrintCount--;
			
			if(tmpNode.left != null) {
				queue.add(tmpNode.left);
				nextCount++;
			}
			if(tmpNode.right != null) {
				queue.add(tmpNode.right);
				nextCount++;
			}
			if(noPrintCount==0) {
				System.out.println();
				noPrintCount = nextCount;
				nextCount = 0;
			}
		}
	}
	//题三：按照之字走法按行打印，即第一行从左往右，二行从右往左等。要使用两个栈结构,一个从左往右入栈另一个从右往左入栈。利用行号 的奇偶判断
	//

}
