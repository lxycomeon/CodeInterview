package Question11_20;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

//ɾ��һ����������Ľڵ㣬��O(1)��ʱ���ڣ�ע��ɾ���ڵ�ʱ��������Ŀ��ǣ����ӳ���Ľ�׳��
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
		
		head = deleteNode(head,n1);//�˾�ɾ��ͷ�ڵ㣬������һ���βΣ����β�Ϊnull��ʵ����head��û��Ϊnull��Ҳ���ǲ�û��������ɾ��
		//��������Ϊ�βδ��뺯����ʱ��ʵ���ϴ������һ����������õ�copy�������������õĿ����������ò������罫���ø�ֵΪnull
		//��ô���������󣬶�ʵ�ʵ�ԭ���ò�û��Ӱ�졣����ͨ��������õĿ������������������õġ�
		//����ǻ���������Ϊ�������롣��ô���Ǵ���Ļ������Ͳ�����ֵ�������ֵ���еĲ�����ԭֵ����Ӱ�죻
		//1.������Ǵ�����2.ԭʼ���;��Ǵ�ֵ3.String��immutable������Ϊû���ṩ�����޸ĵĺ�����ÿ�β�������������һ����������Ҫ����Դ���������Ϊ�Ǵ�ֵ��
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
		
		//ɾ���ڵ�Ķ������Խ�������һ���ڵ��ֵ��ֵ����Ҫɾ���Ľڵ㼴��
		node tmp = ToBeDeleted.next;
		//ɾ���Ľڵ�Ϊβ�ڵ�
		if(tmp == null) {
			node preNode = ListHead;
			node n = preNode.next;
			while(n.next != null) {
				preNode = preNode.next;
				n = n.next;
			}
			preNode.next = null;//ɾ��β�ڵ�
			return ListHead;
		}
		
		//ɾ���Ľڵ㲻��β�ڵ�,������ɾ��ͷ�ڵ�
		ToBeDeleted.value = tmp.value;
		ToBeDeleted.next = tmp.next;		
		return ListHead;
	}
	
}
