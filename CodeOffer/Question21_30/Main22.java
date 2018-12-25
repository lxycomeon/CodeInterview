package Question21_30;

//��һ������ĵ�����K���ڵ�,ֻ��Ҫ���������һ��Ľⷨ��zhuyi
class Node {
	int val;
	Node next;
	Node(int val){
		this.val = val;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.val+"";
	}
	
}
public class Main22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(0);
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		head.next = n1;
		n1.next = n2;
		System.out.println(lastKNode(head,4));
		

	}
	
	//��������ǰ������K���ڵ�
	public static Node lastKNode(Node head,int k) {
		if(head == null || k <=0)
			return null;
		Node frontNode = head;
		Node backNode = null ;
		while(frontNode != null) {
			k--;
			if(k == 0)
				backNode = head;
			if(k < 0)
			backNode = backNode.next;
			frontNode = frontNode.next;
		}
		
		return backNode;
	}

}
