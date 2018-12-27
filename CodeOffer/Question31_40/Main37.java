package Question31_40;

import java.util.ArrayList;
import java.util.List;

//实现一个函数，可以序列化和反序列化二叉树
public class Main37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binaryTreeNode root = new binaryTreeNode(10);
		binaryTreeNode b6 = new binaryTreeNode(6);
		binaryTreeNode b14 = new binaryTreeNode(14);
		binaryTreeNode b4 = new binaryTreeNode(4);
		binaryTreeNode b8 = new binaryTreeNode(8);
		binaryTreeNode b12 = new binaryTreeNode(12);
		binaryTreeNode b16 = new binaryTreeNode(16);
		root.right = b14;root.left=b6;
		b6.right = b8;b6.left = b4;
		b14.right = b16;//b14.left = b12;
		
		List<String> list = new ArrayList<>();
		Srizlize(root, list);
		System.out.println(list);
		binaryTreeNode newRoot = unSrizlize(list);
		System.out.println(newRoot);
		
	}
	
	public static void Srizlize(binaryTreeNode head,List list) {
		if(head == null) {
			list.add("$");
			return ;
		}else {
			list.add(head.val+"");
		}
			Srizlize(head.left, list);
			Srizlize(head.right, list);
	}
	public static binaryTreeNode unSrizlize(List list) {
		if(list.isEmpty() || list == null || list.get(0)=="$")
			return null;
		
		binaryTreeNode head = new binaryTreeNode(Double.parseDouble((String) list.get(0)));
		list.remove(0);
		head.left = unSrizlize(list);
		list.remove(0);
		head.right = unSrizlize(list);
		return head;
		
	}
	

}
