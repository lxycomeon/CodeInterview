package Question11_20;

//数值的整数次方，高效实现方式
public class Main16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pow(2,3));
	}

	public static double pow(double num,int n) {
		if(n == 0 )
			return 1.0;
		if(num == 0.0) 
			return 0;
		boolean daoFlag = false;
		if(n == 1)
			return num;
		if(n < 0) {
			n = -n;
			daoFlag = true;
		}
		boolean oddFlag = false;
		if(n % 2 ==1) {
			oddFlag = true;
			n = n-1;
		}
		double result = num;
		while(n > 1) {
			n = n/2;
			result = pow(result,n) * pow(result,n); 
		}//此处写的比较冗杂，看下面的递归方法
		if(oddFlag)
			result *= num;
		if(daoFlag)
			result = 1.0/result;
		return result;
	}
	
	//简洁的递归写法
	double PowerWithUnsignedExponent(double base,int exponent) {
		if(exponent == 0)
			return 1;
		if(exponent == 1)
			return base;
		double result = PowerWithUnsignedExponent(base,exponent >> 1);
		result *= result;
		if(exponent % 0x1 == 1) {
			result *= base;
		}
		return result;
	}
	
	
}
