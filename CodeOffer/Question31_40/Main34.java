package Question31_40;

import java.util.ArrayList;
import java.util.List;

//打印出二叉树中，路径和为指定值的所有路径
public class Main34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binaryTreeNode root1 = new binaryTreeNode(0);
		binaryTreeNode b1 = new binaryTreeNode(1);
		binaryTreeNode b2 = new binaryTreeNode(2);
		binaryTreeNode b3 = new binaryTreeNode(3);
		binaryTreeNode b4 = new binaryTreeNode(4);
		binaryTreeNode b5 = new binaryTreeNode(4);
		binaryTreeNode b6 = new binaryTreeNode(6);
		binaryTreeNode b7 = new binaryTreeNode(7);
		binaryTreeNode b8 = new binaryTreeNode(8);
		binaryTreeNode b9 = new binaryTreeNode(9);
		binaryTreeNode b10 = new binaryTreeNode(10);
		root1.left = b1;root1.right = b2;
		b1.left = b3;b1.right = b4;b2.left = b7;b2.right = b8;
		b4.left = b5;b4.right = b6;
		b8.right = b9; b6.left = b10;
		
		printPathBySum(root1, 9);
		
	}
	
	public static void printPathBySum(binaryTreeNode head,double sum) {
		if(head == null)
			return ;
		List<binaryTreeNode> path = new ArrayList<>();
		double count = 0;
		printPathBySumCore(head, sum,count, path);
		
	}
	
	public static void printPathBySumCore(binaryTreeNode head,double sum,double count,List<binaryTreeNode> path) {
		path.add(head);
		count += head.val;
		if(count == sum && head.left == null && head.right == null) {
			for (binaryTreeNode obj : path) {
				System.out.print(obj.val +"->");
			}
			System.out.println();
		}
		if(head.left != null)
			printPathBySumCore(head.left, sum, count, path);
		if(head.right != null)
			printPathBySumCore(head.right, sum, count, path);
		path.remove(head);//注意在返回父节点之前，必须将这个节点从路径中删除
		
	}

}
