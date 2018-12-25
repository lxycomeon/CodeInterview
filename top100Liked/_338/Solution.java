package _338;

import java.util.Arrays;

//NoFirstSolved
public class Solution {

	public static void main(String[] args) {
		System.out.println(countBits2(20));
		
		
	}
	public static int[] countBits(int num) {	  
		  int[] res = new int[num + 1];
	        for (int i = 0; i <= num; i++) {
	            res[i] = Integer.bitCount(i);
	        }
	        return res;
	}
	public static int[] countBits2(int num) {
	    // 3->11 9 ->1001  10->1010 11->1011
		if(num==0)return new int[1];
		int counts[] = new int[num+1];
		int base = 2;
		counts[1]=1;
		for(int i=2;i<=num;i++) {
			counts[i] = 1 + counts[i-base];
			if(base*2<=i+1)
				base*=2;
		}
		return counts;
	}
    
}
	