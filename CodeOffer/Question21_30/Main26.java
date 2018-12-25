package Question21_30;

//输入两个二叉树A,B，判断B是否是A的子结构。
class binaryTreeNode {
	double val;
	binaryTreeNode left;
	binaryTreeNode right;
	binaryTreeNode(double val){
		this.val = val;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.val+"";
	}
	
}
public class Main26 {

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
		
		binaryTreeNode root2 = new binaryTreeNode(2);
		binaryTreeNode b7 = new binaryTreeNode(4);
		binaryTreeNode b8 = new binaryTreeNode(8);
		root2.left = b7;root2.right = b8;
		
		System.out.println(hasSubTree(root1,root2));

	}
	
	public static boolean hasSubTree(binaryTreeNode rootA,binaryTreeNode rootB) {
		boolean result = false;
		//前序遍历
		if(rootA != null && rootB != null) {
			if(rootA.val == rootB.val)
				result = hasSubTreeCore(rootA,rootB);
			if(!result)
				result = hasSubTree(rootA.left,rootB);
			if(!result)
				result =  hasSubTree(rootA.right,rootB);
		}
		return result;
	}
	
	
	public static boolean hasSubTreeCore(binaryTreeNode rootA,binaryTreeNode rootB) {
		if(rootB == null)
			return true;
		if(rootA == null && rootB != null)
			return false;
		if(rootA.val == rootB.val)
			return hasSubTreeCore(rootA.left,rootB.left) && hasSubTreeCore(rootA.right,rootB.right);
		return false;
	}

}
