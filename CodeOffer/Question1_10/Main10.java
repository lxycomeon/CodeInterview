 package Question1_10;

 //题目10，计算斐波那契
public class Main10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1;i<=50;i++)
			System.out.println(f(i)+",");

	}
	//递归写法，n大于40就可以看出明显的速度很慢
	public static int f1(int n) {
		if(n<=0)
			return 0;
		if(n == 1)
			return 1;
		return f1(n-1)+f1(n-2);
	}
	
	
	//此时循环比递归好。非简单的递归算法，简单的递归算法会造成，如果N比较大的时候可能造成栈深度溢出。时间和资源都比较浪费
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
