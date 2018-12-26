package Question21_30;

import java.util.Stack;

//���һ������min������ջ������O(1)��ʱ�临�Ӷ������ջ����С������
class minStack{
	Stack<Integer> stack = new Stack();
	Stack<Integer> minStack = new Stack();
	
	//��ջ
	public void push(int i) {
		stack.push(i);
		if(minStack.isEmpty())
			minStack.push(i);
		else {
			int tmp = minStack.peek();
			if(tmp < i)
				minStack.push(tmp);
			else
				minStack.push(i);
		}
	}
	
	public Integer pop() {
		if(stack.isEmpty() || minStack.isEmpty() )
			return null;
		Integer i = stack.pop();
		minStack.pop();
		return i;
	}
	
	public Integer minNum() {
		if(stack.isEmpty() || minStack.isEmpty() )
			return null;
		return minStack.peek();
	}
	
}

public class Main30 {

	public static void main(String[] args) {
		minStack s = new minStack();
		s.push(3);
		s.push(4);
		System.out.println(s.minNum());
		s.push(2);
		s.push(1);
		System.out.println(s.minNum());
		s.pop();
		System.out.println(s.minNum());
		s.pop();
		s.push(0);
		System.out.println(s.minNum());
		
	}
	
	

}
