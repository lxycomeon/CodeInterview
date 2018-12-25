package Question1_10;
//面试题5：替换字符串空格
public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "hello  word ni hao";
		//replace 函数作用后都会新生成一个string串，不会改变原字符串的内容。
		String s1 = s.replace(" ", "%20");
		System.out.println(ReplaceBlank(s));

	}
	
	//模拟C++中的空格替换，利用两个指针，这里代替为下标.在c++中以时间复杂度O(n)的方式实现了空格的替换，减少了字符移动
	public static String ReplaceBlank(String str) {
		
		int countBlank = 0;
		
		for(int i = 0;i<str.length();i++) {
			if(str.charAt(i)==' ')
				countBlank++;
		}
		char[] result = new char[str.length()+countBlank*2];
		int NewPoint = result.length-1;
		int OldPoint = str.length()-1;
		for(int i =0;i<str.length();i++) {
			if(str.charAt(OldPoint)==' ') {
				result[NewPoint--]='0';
				result[NewPoint--]='2';
				result[NewPoint--]='%';
			}else {
				result[NewPoint--]=str.charAt(OldPoint);
			}
			OldPoint--;
		}
		return new String(result);
	}
	
	
	

}
