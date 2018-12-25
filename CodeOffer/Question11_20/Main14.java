package Question11_20;

//动态规划求剪绳子,可以剪开到任意段,必须被剪开，不然为0
public class Main14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(MaxMulti1(8));
	}
	
	//动态规划解法，利用了额外空间。但是节省时间复杂度
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
		products[2]=2;//表示单段的乘积
		products[3]=3;//表示几个基础数值，不是长度为3的绳子的结果，长度为3的绳子的最大段乘积已经在上面返回了。
		
		for(int i = 4; i <= length;i++) {
			//4以上的可以被分为多种两段的情况了,13,22
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
	
	//递归解法，不需要额外空间。但是会产生大量的重复子问题的计算
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
