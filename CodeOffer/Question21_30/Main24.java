package Question21_30;

//������24����ת������������ͷ��㣬��ת�����������ת���ͷ�ڵ�
public class Main24 {

	public static void main(String[] args) {
		Node head = new Node(0);
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		//head.next = n1;
		//n1.next = n2;
		//n2.next = n3;
		//n3.next = n4;
		reverseList1(null);
		System.out.println(new2Head);
		
	}
	
	//�ǵݹ�д������ת����
	public static Node reverseList(Node head) {
		if(head == null)
			return null;
		if(head.next == null)
			return head;
		
		Node curNode = head.next;
		head.next = null;
		Node nextNode = null;
		while(curNode != null) {
			if(curNode.next != null)
				nextNode = curNode.next;
			else
				nextNode = null;
			curNode.next = head;
			head = curNode;
			curNode = nextNode;
		}
		return head;
	}
	
	//ʹ��һ����̬������¼�µķ�ת�ڵ��ͷ�ڵ�
	static Node new2Head = null;
	public static void reverseList1(Node head) {
		//Node new2Head = null;
		Node newLastNode = reverseList1Core(head);
		if(newLastNode != null)
			newLastNode.next = null;
	}
	
	//ʹ�õݹ�ʵ��
	public static Node reverseList1Core(Node head) {
		if(head == null)
			return null;
		if(head.next ==null) {
			new2Head = head;
			return head;
		}
		reverseList1Core(head.next).next = head;
		
		return head;
	}

}
