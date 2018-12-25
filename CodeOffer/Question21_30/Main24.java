package Question21_30;

//面试题24：反转链表，输入链表头结点，倒转该链表并输出反转后的头节点
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
	
	//非递归写法，反转链表
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
	
	//使用一个静态变量记录新的反转节点的头节点
	static Node new2Head = null;
	public static void reverseList1(Node head) {
		//Node new2Head = null;
		Node newLastNode = reverseList1Core(head);
		if(newLastNode != null)
			newLastNode.next = null;
	}
	
	//使用递归实现
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
