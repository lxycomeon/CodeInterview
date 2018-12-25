package _3;

import java.util.Arrays;

//NoFirstSolved
public class Solution {

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
		
		
	}
	//维护一个左指针left，i即是一个右指针，通过m数组记录该字符是否已经出现过，如果出现过，就将左指针移动到该出现过字符的位置。如此循环记录出最大的子字符串。
    public static int lengthOfLongestSubstring(String s) {
		int[] m = new int[256];
		Arrays.fill(m, -1);
		int res = 0,left = -1;
		for (int i = 0; i < s.length(); i++) {
			left = Math.max(left, m[s.charAt(i)]);
			m[s.charAt(i)] = i;
			res = Math.max(res, i - left);
		}
    	return res;
    }
    
}
	