package Question31_40;

//�����������ǳ���һ��nextָ��ָ����һ���ڵ㣬����һ��siblingָ�룬ָ�������е�����ڵ����null�ڵ㣩���ĸ���
//���ڴ��⣬һ�ּ򵥵�˼·���ȸ��Ƶ�����Ȼ�����ԭ�����ҵ�siblingָ����ָ��Ľڵ㣬�������������ҵ��˽ڵ㽫�����ӵ�siblingָ���ϡ�ʱ�临�Ӷ�O(n)
//�ڶ��ֽⷨ�Կռ任ʱ�䣬��ÿ���ڵ㶼����һ��hash���У����Եڶ�����Ѱ��ĳ���ڵ��ʱ�򣬲����ٱ������в�����
//�����һ������Ľⷨ���������ÿռ䣬����O(n)�Ľⷨ
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
		//��һ������ÿһ���ڵ�newһ���µĸ��ƽڵ㣬���뵽�ýڵ�ĺ���
		while(tmpHead != null) {
			listNode copyNode = new listNode(tmpHead.val);
			if(tmpHead.next != null)
				copyNode.next = tmpHead.next;
			tmpHead.next = copyNode;
			tmpHead = copyNode.next;
		}
		
		//�ڶ�������ÿһ��ԭ�ڵ��sibling��ָ���Ƹ��µ�copy�ڵ���
		tmpHead = head;
		while(tmpHead != null) {
			if(tmpHead.sibling != null) {
				tmpHead.next.sibling = tmpHead.sibling.next;
			}
			tmpHead = tmpHead.next.next;
		}
		
		//��������������������
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
