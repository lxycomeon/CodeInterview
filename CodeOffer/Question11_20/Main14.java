package Question11_20;

//��̬�滮�������,���Լ����������,���뱻��������ȻΪ0
public class Main14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(MaxMulti1(8));
	}
	
	//��̬�滮�ⷨ�������˶���ռ䡣���ǽ�ʡʱ�临�Ӷ�
	public static int MaxMulti(int length) {
		if(length < 2 )
			return 0;
		if(length == 2)
			return 1;
		if(length == 3)
			return 2;
		int max = 0;
		int[] products = new int[length+1];
		products[0]=0;
		products[1]=1;
		products[2]=2;//��ʾ���εĳ˻�
		products[3]=3;//��ʾ����������ֵ�����ǳ���Ϊ3�����ӵĽ��������Ϊ3�����ӵ����γ˻��Ѿ������淵���ˡ�
		
		for(int i = 4; i <= length;i++) {
			//4���ϵĿ��Ա���Ϊ�������ε������,13,22
			int tmpMax = 0;
			for(int j = 1; j <= length/2;j++) {
				int tmp = products[j]*products[i-j];
				if(tmp > tmpMax)
					tmpMax = tmp;
			}
			products[i] = tmpMax;
		}
		
		return products[length];
	}
	
	//�ݹ�ⷨ������Ҫ����ռ䡣���ǻ�����������ظ�������ļ���
	public static int MaxMulti1(int length) {
		if(length < 2 )
			return 0;
		if(length == 2)
			return 1;
		if(length == 3)
			return 2;
		return MaxMultiCore(length);
	
	}
	public static int MaxMultiCore(int length) {
		if(length <= 0)
			return 0;
		if(length <= 3 )
			return length;
		int max = 0;
		for(int i = 1; i <= length/2;i++) {
			int tmp = MaxMultiCore(i)*MaxMultiCore(length-i);
			if(tmp > max)
				max = tmp;
		}
		return max;
	}

}
