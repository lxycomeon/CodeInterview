package TestJava;

public class StringTest {

	public static void main(String[] args) {
	//------------���Բ��ɱ��ࣨString���Լ�һЩ��װ�ࣩ����Щ���ʵ��һ����������ֵ�ǲ��ɱ�ġ�ֵһ���ı䣬�ͻᴴ��һ���µĶ���
		Integer a = 1;
		Integer b = a;
		b++;
		System.out.println(a);
		System.out.println(b==a);
		String sa = "a";
		String sb = sa;
		System.out.println(sa);
		System.out.println(sb==sa);
	//-----------------SringBuffer�����
		StringBuffer siu = new StringBuffer("hello");
		StringBuffer siu2 = new StringBuffer("asf");
		//siu.append(" word");
		//siu2 = siu;
		changeStringBuffer(siu,siu2);
		System.out.println(siu);
		System.out.println(siu2);
	//---------------����С��int���������ͽ��������ʱ�����Ȼ����Щ���͵ı���ֵǿתΪint�ͣ�������
		short s1 = 1;
		short s2 = 2;
		//s1 = s1 + s2;  //����д�ͻᱨ�����뽫��������ǿתΪshort
		s1 += s2;	//����ʹ��+=��Ҳ�������
		
		
		
		
	}
	
	public static void changeStringBuffer(StringBuffer ss1,StringBuffer ss2) {
		//�����ھֲ������Ĳ�����ֻ��һ�����á�
		ss1.append("word");
		ss2 = ss1;
		ss2.append(" !");
		
	}

}
