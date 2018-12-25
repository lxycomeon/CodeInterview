package _844;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import sun.rmi.transport.proxy.CGIHandler;

/*
 *Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.

	Example 1:
	
	Input: S = "ab#c", T = "ad#c"
	Output: true
	Explanation: Both S and T become "ac".
	Example 2:
	
	Input: S = "ab##", T = "c#d#"
	Output: true
	Explanation: Both S and T become "".
	
	问题：1.对于将字符串直接转为字符数组纠结了很久，最后发现不行。只能够将其转为字符数组后再将一个一个的字符add到集合中。后面方便操作
	2.堆积asList 函数将类数组直接转为集合的时候，不能转化基本类型的数组，只能将其转为对象数组才能进行直接转为集合的操作
*/

public class Solution {

	public static void main(String[] args) {
		System.out.println(backspaceCompare("#ab#c#","ad#c"));
		
	}
	 public static boolean backspaceCompare(String S, String T) {
		return StringTran(S).equals(StringTran(T));	 
	}
	 public static String StringTran(String S) {
		 char[] ss = S.toCharArray();	 
		 ArrayList ssss = new ArrayList<>();
		 for (int i = 0; i < ss.length; i++) {
			ssss.add(ss[i]);
		}
		 while(ssss.contains('#')) {
			 int tmp = ssss.indexOf('#');
			 ssss.remove(tmp);
			 if(tmp>0)
				 ssss.remove(tmp-1);	 
		 }
		 String sssss = "";
		 for (int i = 0; i < ssss.size(); i++) {
			 sssss += ssss.get(i);
		} 
		return sssss;		 
	}
}

