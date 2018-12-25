package Question21_30;

//合并两个递增排序的链表
public class Main25 {

	public static void main(String[] args) {
		Node head1 = new Node(0);
		Node n1 = new Node(4);
		Node n2 = new Node(6);
		Node n3 = new Node(12);
		Node n4 = new Node(67);
		head1.next = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		
		Node head2 = new Node(0);
		Node n11 = new Node(3);
		Node n21 = new Node(4);
		Node n31 = new Node(13);
		Node n41 = new Node(45);
	//	head2.next = n11;
		//n11.next = n21;
		//n21.next = n31;
		//n31.next = n41;
		
		Node newlist = order2List(null,null);
		System.out.println(newlist);
	}
	
	public static Node order2List(Node list1,Node list2) {
		if(list1 == null)
			return list2;
		if(list2 == null)
			return list1;
		
		Node mergedHead = null;
		if(list1.val >= list2.val) {
			mergedHead =list2;
			mergedHead.next = order2List(list1,list2.next);
		}else {
			mergedHead = list1;
			mergedHead.next = order2List(list1.next,list2);
		}
		return mergedHead;
	}

}
