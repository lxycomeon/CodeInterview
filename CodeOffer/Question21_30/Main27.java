package Question21_30;

//求一个二叉树的镜像。
public class Main27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binaryTreeNode root1 = new binaryTreeNode(8);
		binaryTreeNode b1 = new binaryTreeNode(8);
		binaryTreeNode b2 = new binaryTreeNode(7);
		binaryTreeNode b3 = new binaryTreeNode(9);
		binaryTreeNode b4 = new binaryTreeNode(2);
		binaryTreeNode b5 = new binaryTreeNode(4);
		binaryTreeNode b6 = new binaryTreeNode(7);
		root1.left = b1;root1.right = b2;
		b1.left = b3;b1.right = b4;
		b4.left = b5;b4.right = b6;
		
		MirrorRecursively(root1);
		
	}
	
	//先序遍历，若遍历到有子节点的节点，就交换它的两个子节点。
	public static void MirrorRecursively(binaryTreeNode head) {
		
		if(head == null)
			return;
		if(head.left==null && head.right == null)
			return;
		
		
		if(head.right != null || head.left!=null) {
			binaryTreeNode tmpNode = head.left;
			head.left = head.right;
			head.right = tmpNode;
		}
		MirrorRecursively(head.left);
		MirrorRecursively(head.right);
		
	}

}
