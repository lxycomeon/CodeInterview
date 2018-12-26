package Question21_30;

//对称二叉树，判断一颗二叉树是不是对称的。也即是这个二叉树和它的镜像是不是完全相等。
public class Main28 {

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
		
		binaryTreeNode root2 = new binaryTreeNode(8);
		binaryTreeNode b21 = new binaryTreeNode(8);
		binaryTreeNode b22 = new binaryTreeNode(7);
		binaryTreeNode b23 = new binaryTreeNode(9);
		binaryTreeNode b24 = new binaryTreeNode(2);
		binaryTreeNode b25 = new binaryTreeNode(4);
		binaryTreeNode b26 = new binaryTreeNode(7);
		root2.left = b22;root2.right = b21;
		b21.left = b24;b21.right = b23;
		b24.left = b26;b24.right = b25;
		
		System.out.println(isMirrorTree(null, null));

	}
	
	public static boolean isMirrorTree(binaryTreeNode root1,binaryTreeNode root2) {
		if(root1 == null && root2 == null)
			return true;
		if(root1 == null || root2 == null)
			return false;
		if(root1.val != root2.val)
			return false;
		
		//root2是一种自定义的根右左的遍历。root1是先序遍历
		return  isMirrorTree(root1.left,root2.right)
				&& isMirrorTree(root1.right, root2.left);
	}

}
