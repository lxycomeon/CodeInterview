package Question31_40;

import java.util.Stack;

//�ж�һ�����������Ƕ���һ��ջѹ�����еĵ�������
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
			if(popNum[i]==stack.peek()) {//ջ��Ԫ������Ҫ������Ԫ����ȣ��򵯳�ջ��Ԫ��
				stack.pop();
			}else {
				while(stack.peek()!=popNum[i]) {//��ջ��Ԫ������Ҫ������Ԫ�ز���ȣ�������ѹ�롣��ֱ�����
					stack.push(pushNum[pushIndex]);
					pushIndex++;
					if(pushIndex >= pushNum.length)
						return false;
				}
				stack.pop();	//������ȵ�ʱ��
			}
			
		}
		
		
		return true;
	}

}
