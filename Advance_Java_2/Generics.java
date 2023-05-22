package Advance_Java_2;

import java.util.ArrayList;
import java.util.Scanner;

class Mygeneric<T1, T2> {
    int val;
    private T1 t1;
    private T2 t2;

    public Mygeneric(int val, T1 t1, T2 t2) {
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }
}

public class Generics {
    public static void main(String[] args) {
//        Generic basically means you are supplying which class object are you using in array list.
//        Non Generic class ->
        ArrayList arrayList = new ArrayList();
        arrayList.add("String1");
        arrayList.add(23);
        arrayList.add(3);
        arrayList.add(new Scanner(System.in));

//        int c = (int) arrayList.get(0);  -> Throws runtime error
//        int a = arrayList.get(2);     -> without typecasting throws error
        int a = (int) arrayList.get(2);   // with typecasting works perfect

//        Generic class ->
        ArrayList<Integer> ar = new ArrayList<>();
//        ArrayList<int> ar = new ArrayList<>();   -> this will produce an error as int is a variable data type not generic class
        ar.add(45);
        ar.add(4);
        ar.add(100);
        ar.add(16);

        int b = ar.get(2);
//        System.out.println(b);

        Mygeneric<String, Integer> g1 = new Mygeneric(55, "This is a String ", 44);
        String str = g1.getT1();
        Integer num = g1.getT2();
        System.out.println(str + num);

    }
}
