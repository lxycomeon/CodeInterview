 package Question1_10;

 //��Ŀ10������쳲�����
public class Main10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1;i<=50;i++)
			System.out.println(f(i)+",");

	}
	//�ݹ�д����n����40�Ϳ��Կ������Ե��ٶȺ���
	public static int f1(int n) {
		if(n<=0)
			return 0;
		if(n == 1)
			return 1;
		return f1(n-1)+f1(n-2);
	}
	
	
	//��ʱѭ���ȵݹ�á��Ǽ򵥵ĵݹ��㷨���򵥵ĵݹ��㷨����ɣ����N�Ƚϴ��ʱ��������ջ��������ʱ�����Դ���Ƚ��˷�
	public static int f(int n) {
		int result = 0;
		if(n<=0)
			return 0;
		if(n == 1)
			return 1;
		int fn_1 = 1;
		int fn_2 = 0;
		for(int i = 2;i <= n;i++) {
			result = fn_1+fn_2;
			fn_2 = fn_1;
			fn_1 =result;
		}
		return result;
	}
	
	

}
