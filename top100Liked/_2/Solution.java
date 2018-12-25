package _2;


//NoFirstSolved
public class Solution {

	public static void main(String[] args) {
		ListNode l11 = new ListNode(2);ListNode l12 = new ListNode(4);ListNode l13 = new ListNode(3);
		l11.next = l12;l12.next=l13;
		ListNode l21 = new ListNode(5);ListNode l22 = new ListNode(6);ListNode l23 = new ListNode(4);
		l21.next = l22;l22.next=l23;
		Integer integer = Integer.valueOf("1000");
		Integer integer2 = Integer.valueOf("1000");
		System.out.println(integer == integer2);
		
		//这种思路不对，要模拟一个加法进位的操作。
		ListNode rNode = addTwoNumbers(String2Node( "[9]"),String2Node("[1,9,9,9,9,9,9,9,9,9]"));
		System.out.println(rNode);
	}
	public static ListNode String2Node(String str) {
		ListNode result = null;
		String[] strings = str.substring(1, str.length()-1).split(",");
		ListNode Oldnode = null;
		for (int i = 0 ; i<strings.length ; i++) {
			ListNode node = new ListNode(Integer.parseInt(strings[i]));
			if (i == 0) {
				result = node;
			}else {
				Oldnode.next = node;
			}
			Oldnode = node;
		}
		return result;
	}
	
	//有一个bug，对于，l1下一个为null，但是还能进位的情况解决不了，解决方法见下方大神的解法。
	public static ListNode addTwoNumbers(ListNode l1,ListNode l2) {
		ListNode head = null;
		ListNode preNode = null;
		int jinflag = 0;
		for(int i = 0;true;i++) {			
			int val = l1.val+l2.val+jinflag;
			if (val >= 10) {
				val = val - 10;
				jinflag = 1;
			}else {
				jinflag = 0;
			}
			ListNode node = new ListNode(val);
			if (i == 0) {
				head = node;
			}else {
				preNode.next = node;
			}
			preNode = node;
			l1 = l1.next;l2 = l2.next;
			if (l1==null || l2==null) {
				if (l1 != null) {
					l1.val += jinflag;
					node.next = l1;
					break;
				}
				if (l2 != null) {
					l2.val += jinflag;
					node.next = l2;
					break;
				}
				break;
			}
		}
		return head;
	}
	//这种解法只能解不超过long位数的数字
	public static ListNode addTwoNumbers1(ListNode l1,ListNode l2) {
		long num1 = 0;
		long countNum = 1;
		while(l1 != null) {
			num1 += l1.val * countNum;
			countNum *= 10;
			l1 = l1.next;
		}
		long num2 = 0;
		countNum = 1;
		while(l2 != null) {
			num2 += l2.val * countNum;
			countNum *= 10;
			l2 = l2.next;
		}
		
		long result = num1 + num2;
		if(result == 0)
            return new ListNode(0);
		ListNode head = null;
		ListNode Oldnode = null;
		for (int i = 0 ; result != 0 ;result = result/10,i++) {
			ListNode node = new ListNode((int)(result % 10));
			
			if (i == 0) {
				head = node;
			}else {
				Oldnode.next = node;
			}
			Oldnode = node;
		}
		
		return head;
	}
	
	//大神的答案
    public ListNode addTwoNumbers3(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
         ListNode cur = result;
         while (l1 != null || l2 != null) {
             int sum = 0;
             if (l1 != null) {
                 sum += l1.val;
                 l1 = l1.next;
             }
             if (l2 != null) {
                 sum += l2.val;
                 l2 = l2.next;
             }
             cur.next = cur.next==null?new ListNode(0):cur.next;
 			 cur = cur.next;
             sum += cur.val;
             cur.val = sum%10;
             cur.next = sum/10 != 0? new ListNode(1):null;
         }
         return result.next;
     }
	

}
