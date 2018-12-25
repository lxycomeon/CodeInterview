package Question1_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class BinaryTreeNode{
	int val;
	BinaryTreeNode left;
	BinaryTreeNode right;
	public BinaryTreeNode(int val) {
		this.val = val;
	}
	
	public BinaryTreeNode() {
		// TODO Auto-generated constructor stub
	}
}

//根据前序遍历和中序遍历重建二叉树
public class Main7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] preOrder = {1,2,4,8,9,5,10,3,6,7};
		List<Integer> preOrderlist = new ArrayList<>();
		for (int i = 0; i < preOrder.length; i++) {
			preOrderlist.add(preOrder[i]);
		}
		int[] inOrder = {8,4,9,2,10,5,1,6,3,7};
		List<Integer> inOrderlist = new ArrayList<>();
		for (int i = 0; i < inOrder.length; i++) {
			inOrderlist.add(inOrder[i]);
		}
		System.out.println(inOrderlist.subList(1, 3));
		BinaryTreeNode head = reConsruct(preOrderlist,inOrderlist);
		System.out.println(head.val);

	}
	
	public static BinaryTreeNode reConsruct(List preOrder,List inOrder) {
		
		BinaryTreeNode root = new BinaryTreeNode((int)preOrder.get(0));
		if(preOrder.size()==1 && preOrder.get(0)==inOrder.get(0) && 1==inOrder.size())
			return root;
		int leftNodeNum = inOrder.indexOf(root.val);//左子节点的个数
		if(leftNodeNum>=1)
			root.left=reConsruct(preOrder.subList(1, leftNodeNum+1), inOrder.subList(0, leftNodeNum));
		if(leftNodeNum+1< inOrder.size())
		root.right=reConsruct(preOrder.subList(leftNodeNum+1, preOrder.size()), inOrder.subList(leftNodeNum+1, inOrder.size()));
		return root;
	}
	

}
