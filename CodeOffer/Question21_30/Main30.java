package Question21_30;

import java.util.Stack;

//设计一个包含min函数的栈，能在O(1)的时间复杂度内输出栈中最小的数字
class minStack{
	Stack<Integer> stack = new Stack();
	Stack<Integer> minStack = new Stack();
	
	//入栈
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
