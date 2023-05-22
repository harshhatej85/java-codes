package Cal;

import static java.lang.Math.log;
import static java.lang.Math.sin;

class Calculator {
    void calc(int x, int y) {
        System.out.println("Your result is : " + (x + y));
    }
}

class ScCalculator {
    void Sccalc(int x, int y) {
        System.out.println("Your result is : " + sin(x + y));
    }

}

class HybridCalculator {
    void Hycalc(int x, int y) {
        System.out.println("Your result is : " + log(x + y));
    }

}

public class Problem_1 {
    public static void main(String[] args) {
        Calculator a = new Calculator();
        ScCalculator b = new ScCalculator();
        HybridCalculator c = new HybridCalculator();
        a.calc(4, 8);
        b.Sccalc(4, 8);
        c.Hycalc(4, 8);
    }
}
