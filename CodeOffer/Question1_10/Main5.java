package Question1_10;
//������5���滻�ַ����ո�
public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "hello  word ni hao";
		//replace �������ú󶼻�������һ��string��������ı�ԭ�ַ��������ݡ�
		String s1 = s.replace(" ", "%20");
		System.out.println(ReplaceBlank(s));

	}
	
	//ģ��C++�еĿո��滻����������ָ�룬�������Ϊ�±�.��c++����ʱ�临�Ӷ�O(n)�ķ�ʽʵ���˿ո���滻���������ַ��ƶ�
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
