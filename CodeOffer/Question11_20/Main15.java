package Question11_20;

//��������1�ĸ������������
//һ������������Ŀ������˼·���ǳ����ã�һ��������ȥ1���ٺ�ԭ�������������Ѹ��������ұߵ�1��Ϊ0
//��15.����һ���������ҳ��������������1�ĸ�����
public class Main15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(binaryCount(-4));
		System.out.println(Integer.toBinaryString(-4));
	}
	
	//ʹ������ķ���
	public static int binaryCount(int num) {
		int count = 0;
		while(num != 0) {
			num = num & (num-1);
			count ++;
		}
		return count;
	}
	//���Ǿ����뵽�ķ��������ǳ�2ȡ�ࡣ���ַ��������⣬�Ը�����֧�֣�����Ϊ��λ��λΪ1�������ѭ������2��������λ���㣬����Ч�ʵ�
	
	
	
	

}
