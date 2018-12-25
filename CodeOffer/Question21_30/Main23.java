package Question21_30;

//�ҳ������л�����ڽڵ㡣���ڵ�Ķ����Main22
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
		
		//���ҵ��������Ƿ��л���
		Node fastNode = head;
		Node behindNode = head;
		boolean hasRound = false;
		while(fastNode.next.next != null && behindNode.next != null) {
			fastNode = fastNode.next.next;
			behindNode = behindNode.next;
			if(fastNode == behindNode) {
				hasRound = true;//��ʾ�л����Ҵ�ʱ�Ľڵ��ڻ��У����ݴ˽ڵ��ҵ����Ĵ�С
				break;
			}
		}
		if(!hasRound )
			return null;
		//�ҵ����Ľڵ�ĸ���
		int k = 1;
		behindNode = behindNode.next;
		while(fastNode != behindNode) {
			k++;
			behindNode = behindNode.next;
		}
		//�ҵ�������ڽڵ�
		return lastKNode(head, k);
	
	}
	public static Node lastKNode(Node head,int k) {
		if(head == null || k <=0)
			return null;
		Node frontNode = head;
		Node backNode = null ;
		while(frontNode != backNode) {	//�ҵ����еĵ�����k���ڵ�
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
