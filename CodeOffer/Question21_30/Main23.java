package Question21_30;

//找出链表中环的入口节点。，节点的定义见Main22
public class Main23 {

	public static void main(String[] args) {
		Node head = new Node(0);
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		head.next = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = head;
		System.out.println(findRoundNode(head));
	}
	
	public static Node findRoundNode(Node head) {
		if(head == null)
			return null;
		
		//先找到链表中是否有环：
		Node fastNode = head;
		Node behindNode = head;
		boolean hasRound = false;
		while(fastNode.next.next != null && behindNode.next != null) {
			fastNode = fastNode.next.next;
			behindNode = behindNode.next;
			if(fastNode == behindNode) {
				hasRound = true;//表示有环，且此时的节点在环中，根据此节点找到环的大小
				break;
			}
		}
		if(!hasRound )
			return null;
		//找到环的节点的个数
		int k = 1;
		behindNode = behindNode.next;
		while(fastNode != behindNode) {
			k++;
			behindNode = behindNode.next;
		}
		//找到环的入口节点
		return lastKNode(head, k);
	
	}
	public static Node lastKNode(Node head,int k) {
		if(head == null || k <=0)
			return null;
		Node frontNode = head;
		Node backNode = null ;
		while(frontNode != backNode) {	//找到环中的倒数第k个节点
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
