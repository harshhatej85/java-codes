package Core_Java;

public class Methods {
    //    what is methods and why we use them?
//    Sometimes our program grows in size, and we want to separate the logic of main method to
//    other methods :
//    for instance - If we are calculating average of a number pair 5 times , we can use methods
//    to avoid repeating the logic.
//    Syntax of a method
//    static DataType name() {
    //Method body
//     }
//    A method can be called by -
//    class obj = new class();
//    obj.sum(a,b);

    public static void main(String[] args) {
        int a = 5;
        int b = 12;
        int c;
//        Method invocation using object creation:
//        Methods obj = new Methods();
//        c = obj.logic(a, b);
        c = logic(a, b);


        int m = 2;
        int n = 1;
        int o;
        o = logic(m, n);
        System.out.println(c);
        System.out.println(o);
    }

    static int logic(int x, int y) { //Copies of a and b will be stored in x and y and there initial
        // values will never change by using methods
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        return z;
    }

}