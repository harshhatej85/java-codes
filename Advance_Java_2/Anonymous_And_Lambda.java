package Advance_Java_2;

@FunctionalInterface
interface Demo {
    void meth1(int a);
}

//class AnnonyDemo implements Demo {
//    public void display() {
//        System.out.println("Hello");
//    }
//
//    public void meth1() {
//        System.out.println("Hello from meth1");
//    }
//}

public class Anonymous_And_Lambda {
    public static void main(String[] args) {

//        Anonymous Class
//        Demo obj = new AnnonyDemo();
//        obj.meth1();
//        obj.meth2();

//        Demo obj2 = new Demo() {
//            @Override
//            public void meth1() {
//                System.out.println("Hello from meth1 without creating class");
//            }
//        };
//        obj2.meth1();

//        Lambda Expression
        Demo obj3 = (a) -> {
            System.out.println("Hello from lambda with argument of : " + a);
        };
        obj3.meth1(4);

    }
}
