package Question31_40;

//将一个二叉搜索树转换成一个排序的双向链表,不能创建新的链表，只能调整节点的指针
//思路：一个二叉搜索树的中序遍历，即是排好序的。所以只需要将中序遍历中左子树和右子树分别递归双向连接到根节点上即可
public class Main36 {

	public static void main(String[] args) {
		binaryTreeNode root = new binaryTreeNode(10);
		binaryTreeNode b6 = new binaryTreeNode(6);
		binaryTreeNode b14 = new binaryTreeNode(14);
		binaryTreeNode b4 = new binaryTreeNode(4);
		binaryTreeNode b8 = new binaryTreeNode(8);
		binaryTreeNode b12 = new binaryTreeNode(12);
		binaryTreeNode b16 = new binaryTreeNode(16);
		root.right = b14;root.left=b6;
		b6.right = b8;b6.left = b4;
		b14.right = b16;b14.left = b12;
		//起始输入false，输出双向链表的最左端，输入true输出双向链表的最右边
		binaryTreeNode last = ToDoubleLink(root,false);
		System.out.println(last);
		
		
	}
	
	public static binaryTreeNode ToDoubleLink(binaryTreeNode head,boolean isleft) {
		if(head == null)
			return null;
		binaryTreeNode lastNode = null;
		if(head.left != null)
			lastNode = ToDoubleLink(head.left,true);
		
		//双向连接
		head.left = lastNode;
		if(lastNode != null)
			lastNode.right = head;
		
		binaryTreeNode nextNode = null;
		if(head.right != null)
			nextNode = ToDoubleLink(head.right,false);
		head.right = nextNode;
		 if(nextNode != null)
			 nextNode.left = head;
		 else
			 return head;
		 
		 binaryTreeNode result = head;
		 if(isleft) {//左边进入的，就一直寻找到最右边返回那个最大值
			 while(result.right!=null) {
				 result = result.right;
			 }
		 }
		 else {
			 while(result.left!=null) {
				 result = result.left;
			 }
		 }
		 return result;
	}

}
