package Question31_40;

//复杂链表（就是除了一个next指针指向下一个节点，还有一个sibling指针，指向链表中的任意节点或者null节点），的复制
//对于此题，一种简单的思路，先复制单链表，然后遍历原链表。找到sibling指针所指向的节点，后在新链表上找到此节点将其连接到sibling指针上。时间复杂度O(n)
//第二种解法以空间换时间，将每个节点都放入一个hash表中，所以第二次在寻找某个节点的时候，不用再遍历进行查找了
//下面的一种巧妙的解法，不再利用空间，并且O(n)的解法
class listNode {
	int val;
	listNode next;
	listNode sibling;
	listNode(int val){
		this.val = val;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.val+"";
	}
	
}
public class Main35 {

	public static void main(String[] args) {
		listNode a = new listNode(1);
		listNode b = new listNode(2);
		listNode c = new listNode(3);
		listNode d = new listNode(4);
		listNode e = new listNode(5);
		a.next=b;b.next=c;c.next=d;d.next=e;
		a.sibling=c;d.sibling=b;b.sibling=e;
		
		listNode a1 = copyList(a);
		System.out.println(a1);
	}

	public static listNode copyList(listNode head) {
		if(head == null)
			return null;
		if(head.next == null)
			return new listNode(head.val);
		listNode tmpHead = head;
		//第一步：对每一个节点new一个新的复制节点，插入到该节点的后面
		while(tmpHead != null) {
			listNode copyNode = new listNode(tmpHead.val);
			if(tmpHead.next != null)
				copyNode.next = tmpHead.next;
			tmpHead.next = copyNode;
			tmpHead = copyNode.next;
		}
		
		//第二步：将每一个原节点的sibling的指向复制给新得copy节点上
		tmpHead = head;
		while(tmpHead != null) {
			if(tmpHead.sibling != null) {
				tmpHead.next.sibling = tmpHead.sibling.next;
			}
			tmpHead = tmpHead.next.next;
		}
		
		//第三步，分离两个链表。
		tmpHead = head;
		listNode newHead = tmpHead.next;
		while(tmpHead != null) {
			listNode newTmpNode = tmpHead.next;
			if(newTmpNode.next != null) {
				tmpHead.next = newTmpNode.next;
				newTmpNode.next = tmpHead.next.next;
			}else {
				break;
			}
			tmpHead = tmpHead.next;
		}
		return newHead;
	}
	
}
