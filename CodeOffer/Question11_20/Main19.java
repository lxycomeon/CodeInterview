package Question11_20;

import java.util.regex.Pattern;
//TODO ��δ�� 
//������ʽƥ�䣬ʵ�֡�.���͡�*��������ƥ��
public class Main19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(match("aaa","ab*ac*a"));
		Pattern.compile("ab*ac*a").matcher("aaa");

	}
	
	public static boolean match(String str,String pattern) {
		if(str == null || pattern == null )
			return false;
		if(str.length() == 0 && pattern.length()==0)
			return true;
		if(str.length() ==0 || pattern.length() ==0)
			return false;
		
		
		
		int strP = 0,patP = 0;
		if(pattern.length() > 1&&pattern.charAt(1)=='*') {
			if(pattern.charAt(patP) == '.' || str.charAt(strP) == pattern.charAt(patP))
				return 	match(str.substring(1),pattern.substring(2)) ||
						match(str.substring(1),pattern.substring(0)) ||
						match(str.substring(0),pattern.substring(2)) ;
			else
				return match(str.substring(1),pattern.substring(2));//"*"������0���ַ������Լ���
		}
		
		
		if(pattern.charAt(0) == '.' || str.charAt(0) == pattern.charAt(0)) {
			strP++;patP++;
			return match(str.substring(1),pattern.substring(1));
		}
		
		
		return false;
	}

}
