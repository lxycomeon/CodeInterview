package test;
//
//class C {
//	static {
//		System.out.println("c static");
//	}
//	{
//		System.out.println("c shi");
//	}
//    C() {
//        System.out.print("C");
//    }
//}
// 
//class A {
//    C c = new C();
//    static {
//    	System.out.println("a static");
//    }
//    {
//    	int s ;
//    	System.out.println("a shi");
//    }
// 
//    A() {
//        this("A");
//        System.out.print("A");
//    }
// 
//    A(String s) {
//        System.out.print(s);
//    }
//}
// 
//class Test extends A {
//    Test() {
//        super("B");
//        System.out.print("B");
//    }
// 
//    public static void main(String[] args) {
//        new Test();
//    }
//}
