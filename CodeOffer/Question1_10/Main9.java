package Question1_10;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
//面试9：用两个栈实现队列。以及用两个队列实现栈
class queue{	//两个栈实现队列：先进先出
	Stack<Object> stack1 = new Stack<>();
	Stack<Object> stack2 = new Stack<>();
	queue(){		}
	void appendTail(Object o){
		stack1.push(o);
	}
	
	Object deleteHead() {
		if(this.size()<=0)
			return "No value in queue";
		
		if(stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				Object tmpO = stack1.pop();
				stack2.push(tmpO);
			}
		}
		return stack2.pop();
	}
	int size() {
		return stack1.size()+stack2.size();
	}
	
}

class stack{	//先进后出
	Queue<Object> q1 = new PriorityQueue<>();
	Queue<Object> q2 = new PriorityQueue<>();
	
	stack(){	}
	
	void push(Object o) {
		if(q2.isEmpty()) {
			q1.add(o);
		}else {
			q2.add(o);
		}
	}
	
	Object pop() {
		if(q1.isEmpty() && q2.isEmpty())
			return "no element in stack";
		if(q1.isEmpty()) {
			while(q2.size()>1) {
				Object tmpO = q2.poll();
				q1.add(tmpO);
			}
			return q2.poll();
		}
		if(q2.isEmpty()) {
			while(q1.size()>1) {
				Object tmpO = q1.poll();
				q2.add(tmpO);
			}
			return q1.poll();
		}
		return null;
	}
	
	int size() {
		if(q1.isEmpty() && q2.isEmpty())
			return 0;
		if(q1.isEmpty())
			return q2.size();
		else
			return q1.size();
	}
	
	
}


public class Main9 {
	

	

	public static void main(String[] args) {
		queue q = new queue();
		q.appendTail('a');
		q.appendTail('b');
		q.appendTail(12);
		while(q.size()>0) {
			System.out.println(q.deleteHead());
		}
		//System.out.println(q.deleteHead());
		
		stack s = new stack();
		s.push('a');
		s.push('b');
		System.out.println(s.pop());
		s.push('c');
		while(s.size()>0) {
			System.out.println(s.pop());
		}
		System.out.println(s.pop());
		
	}
	

}
