package Question31_40;

import java.util.Stack;

//判断一个数字序列是都是一个栈压入序列的弹出序列
public class Main31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] push = {1,2,3,4,5};
		int[] pop = {4,3,5,1,2};
	
		System.out.println(	isPopOrder(push, pop));
	}
	
	public static boolean isPopOrder(int[] pushNum,int[] popNum) {
		if(pushNum == null || popNum == null || pushNum.length != popNum.length || pushNum.length == 0 )
			return false;
		
		Stack<Integer> stack = new Stack();
		int pushIndex = 0;
		int popIndex = 0;
		for (int i = 0; i < popNum.length; i++) {
			if(stack.isEmpty()) {
				if(pushIndex >= pushNum.length)
					return false;
				stack.push(pushNum[pushIndex]);
				pushIndex ++;
			}
			if(popNum[i]==stack.peek()) {//栈顶元素与需要弹出的元素相等，则弹出栈顶元素
				stack.pop();
			}else {
				while(stack.peek()!=popNum[i]) {//若栈顶元素与需要弹出的元素不相等，则连续压入。。直到相等
					stack.push(pushNum[pushIndex]);
					pushIndex++;
					if(pushIndex >= pushNum.length)
						return false;
				}
				stack.pop();	//两数相等的时候
			}
			
		}
		
		
		return true;
	}

}
