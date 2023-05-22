package Advance_Java_2;

import java.util.Date;

@FunctionalInterface
interface myFunctionalInterface {
    void method();
}

class NewPhone extends phone {
    @Override
    public void showTime() {
        Date t1 = new Date();
        System.out.println("The time is " + t1.getHours() + ":" + t1.getMinutes() + ":" + t1.getSeconds());
    }

    @Deprecated
    public int sum(int a, int b) {
        return a + b;
    }
}

public class Annotions {
    public static void main(String[] args) {
        @SuppressWarnings("deprecation")
        phone obj = new NewPhone();
        NewPhone t = new NewPhone();
        obj.showTime();
        t.sum(3, 7);

    }
}
