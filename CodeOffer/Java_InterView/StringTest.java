package TestJava;

public class StringTest {

	public static void main(String[] args) {
	//------------测试不可变类（String，以及一些包装类）。这些类的实例一旦被创建，值是不可变的。值一旦改变，就会创建一个新的对象
		Integer a = 1;
		Integer b = a;
		b++;
		System.out.println(a);
		System.out.println(b==a);
		String sa = "a";
		String sb = sa;
		System.out.println(sa);
		System.out.println(sb==sa);
	//-----------------SringBuffer类测试
		StringBuffer siu = new StringBuffer("hello");
		StringBuffer siu2 = new StringBuffer("asf");
		//siu.append(" word");
		//siu2 = siu;
		changeStringBuffer(siu,siu2);
		System.out.println(siu);
		System.out.println(siu2);
	//---------------对于小于int的数据类型进行运算的时候，首先会把这些类型的变量值强转为int型，在运算
		short s1 = 1;
		short s2 = 2;
		//s1 = s1 + s2;  //这样写就会报错，必须将运算结果再强转为short
		s1 += s2;	//或者使用+=号也不会出错
		
		
		
		
	}
	
	public static void changeStringBuffer(StringBuffer ss1,StringBuffer ss2) {
		//函数内局部变量的操作。只是一个引用。
		ss1.append("word");
		ss2 = ss1;
		ss2.append(" !");
		
	}

}
