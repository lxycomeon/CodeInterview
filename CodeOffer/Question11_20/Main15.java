package Question11_20;

//二进制中1的个数的相关运算
//一个常用这类题目的巧妙思路，非常有用：一个整数减去1，再和原整数做与运算会把该整数最右边的1变为0
//题15.输入一个整数，找出这个数二进制中1的个数。
public class Main15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(binaryCount(-4));
		System.out.println(Integer.toBinaryString(-4));
	}
	
	//使用上面的方法
	public static int binaryCount(int num) {
		int count = 0;
		while(num != 0) {
			num = num & (num-1);
			count ++;
		}
		return count;
	}
	//我们经常想到的方法，就是除2取余。此种方法的问题，对负数不支持，会因为移位后补位为1，造成死循环。除2尽量用移位运算，除法效率低
	
	
	
	

}
