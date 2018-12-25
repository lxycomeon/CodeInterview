package Question1_10;

//面试题6：从尾到头打印链表
//方法1：利用栈，先进后出，将链表节点的值从头到尾入栈，在出栈
//方法2：递归调用。每次调用自身输出后一个节点的值
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
