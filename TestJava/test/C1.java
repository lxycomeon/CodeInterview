package test;

class c {
	c() {
		System.out.println("C");
	}
}

class a{
	c C = new c();	//静态成员，类相关，先执行静态代码。再执行构造函数
	static int s=2;	//运行时常量池中了
	
	public a() {
		this("A");
		System.out.println("A");
	}
	
	a(String s){
		System.out.println(s);
	}
	
}

public class C1 extends a {

	C1(){
		super("B");
		System.out.println("B");
	}
	
	public static void main(String[] args) {
		C1 c1 = new C1();
		System.out.println(C1.s+"ss");
		
	}
	
}
