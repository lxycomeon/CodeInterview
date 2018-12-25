package Question11_20;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

//删除一个单向链表的节点，在O(1)的时间内，注意删除节点时候几种情况的考虑，增加程序的健壮性
class node {
	int value;
	node next;
	node(int val){
		this.value = val;
	}
}

public class Main18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		node head = new node(0);
		node n1 = new node(1);
		node n2 = new node(2);
		head.next = n1;
		n1.next = n2;
		
		head = deleteNode(head,n1);//此句删除头节点，传入了一个形参，将形参为null，实际上head并没有为null，也就是并没有真正的删除
		//将对象作为形参传入函数的时候，实际上传入的是一个对象的引用的copy，如果对这个引用的拷贝进行引用操作比如将引用赋值为null
		//那么跳出函数后，对实际的原引用并没有影响。但是通过这个引用的拷贝操作对象是起作用的。
		//如果是基本类型作为参数传入。那么都是传入的基本类型参数的值，对这个值进行的操作对原值毫无影响；
		//1.对象就是传引用2.原始类型就是传值3.String等immutable类型因为没有提供自身修改的函数，每次操作都是新生成一个对象，所以要特殊对待。可以认为是传值。
		node n = head;
		while(n != null) {
			System.out.println(n.value);
			n = n.next;
		}
		
	}

	
	public static node deleteNode(node ListHead,node ToBeDeleted) {
		if(ListHead == null || ToBeDeleted == null) 
			return ListHead;
		if(ListHead.next == null && ListHead == ToBeDeleted) {
			ListHead = null;
			return ListHead;
		}
		
		//删除节点的动作可以将他的下一个节点的值赋值给将要删除的节点即可
		node tmp = ToBeDeleted.next;
		//删除的节点为尾节点
		if(tmp == null) {
			node preNode = ListHead;
			node n = preNode.next;
			while(n.next != null) {
				preNode = preNode.next;
				n = n.next;
			}
			preNode.next = null;//删除尾节点
			return ListHead;
		}
		
		//删除的节点不是尾节点,包括了删除头节点
		ToBeDeleted.value = tmp.value;
		ToBeDeleted.next = tmp.next;		
		return ListHead;
	}
	
}
