package Question1_10;

//������6����β��ͷ��ӡ����
//����1������ջ���Ƚ������������ڵ��ֵ��ͷ��β��ջ���ڳ�ջ
//����2���ݹ���á�ÿ�ε������������һ���ڵ��ֵ
class Node{
	Node next;
	int val;
	public Node() {
		// TODO Auto-generated constructor stub
	}
	public Node(int val) {
		this.val = val;
	}

}
public class Main6 {
	

	public static void main(String[] args) {
		Node head = new Node();
		head.next = new Node(2);
		head.next.next= new Node(3);
		head.next.next.next=new Node(4);
		endTostartVal(head);
		
	}
	
	public static void endTostartVal(Node head) {
		
		if(head.next != null) {
			endTostartVal(head.next);
		}
		System.out.println(head.val);
		
	}
	
	

}
