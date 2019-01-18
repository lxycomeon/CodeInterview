package Java_InterView;
//Momenta题目1
import java.util.Scanner;

import java.awt.List;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
 
public class Main {
	public static Queue<Integer> que = new LinkedList<Integer>();
																	
 
	public static int onenum(int a) {//求最后数字中1的个数
		int i = 0;
		while (a > 0) {
			i++;
			a = a & (a - 1);
		}
		return i;
	}
 
	public static int reversea(int a) {
		while (a > 0) {
			int onefirst = onenum(a);
			int temp = a >> 1;
			int onesecond = onenum(temp);
			if (onefirst > onesecond) 
				que.add(1);
			else
				que.add(0);
			a = a >> 1;
		}
		int ret = 0;
		int i = 0;
		while (!que.isEmpty()) {
			ret = (ret << 1) + que.poll(); 
			i++;
		}
		return ret;
	}
 
	public static void main(String[] args) {
		int k;
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			k = scan.nextInt();
			while (k > 0) {
				int a = scan.nextInt();
				if (a % 2 == 0) {
					System.out.print(reversea(a));
					if (k != 1)
						System.out.print(" ");
				} else {
					System.out.print(a);
					if (k != 1)
						System.out.print(" ");
				}
				k--;
			}
			System.out.println();
		}
	}
}

