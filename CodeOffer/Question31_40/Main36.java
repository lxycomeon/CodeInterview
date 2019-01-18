package Question31_40;

//��һ������������ת����һ�������˫������,���ܴ����µ�����ֻ�ܵ����ڵ��ָ��
//˼·��һ����������������������������ź���ġ�����ֻ��Ҫ��������������������������ֱ�ݹ�˫�����ӵ����ڵ��ϼ���
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
		//��ʼ����false�����˫�����������ˣ�����true���˫����������ұ�
		binaryTreeNode last = ToDoubleLink(root,false);
		System.out.println(last);
		
		
	}
	
	public static binaryTreeNode ToDoubleLink(binaryTreeNode head,boolean isleft) {
		if(head == null)
			return null;
		binaryTreeNode lastNode = null;
		if(head.left != null)
			lastNode = ToDoubleLink(head.left,true);
		
		//˫������
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
		 if(isleft) {//��߽���ģ���һֱѰ�ҵ����ұ߷����Ǹ����ֵ
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
