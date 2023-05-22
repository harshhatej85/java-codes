package Advance_Java_2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

@FunctionalInterface
interface MyInt {
    void display();
}

class MyDeprecated {
    @Deprecated
    void meth1() {
        Date d = new Date();
        System.out.println(d.getSeconds());
    }
}


public class Practise_Set_16 {
    public static void main(String[] args) {

//        Problem 1
//        Create a class and a method with deprecated annotation. What is its effect on program execution?

//        Ans -->
//        There is no as such special effect on the program of deprecated annotation. The only thing is that compiler generated a waning if we use deprecated method or class in our program.


//        Problem 2
//        Suppress the warning generated in question number 2.
        @SuppressWarnings("deprecation")
        MyDeprecated obj = new MyDeprecated();
        obj.meth1();


//        Problem 3
//        Create an interface and generate an instance from it.
        MyInt i = () -> System.out.println("I am display");
        i.display();


//        Problem 4
//        Write a Java program to generate a multiplication table of a given number and write it to a file.
        String table = "";
        for (int x = 1; x <= 10; x++) {
            int y = 2;
            table += y + " * " + x + " = " + (y * x);
            table += "\n";
        }
        try {
            FileWriter myfile = new FileWriter("Multiplication");
            myfile.write(table);
            myfile.close();
        } catch (IOException e) {
            System.out.println("Cannot Write the File !");
        }

    }
}
