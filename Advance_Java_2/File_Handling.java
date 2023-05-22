package Advance_Java_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_Handling {
    public static void main(String[] args) {
//        Code to create a new file :
        File myFile1 = new File("exmp");
        try {
            myFile1.createNewFile();
        } catch (IOException e) {
            System.out.println("Cannot create this file!");
            e.printStackTrace();
        }
//
////        Code to write a file :
        try {
            FileWriter myFileWriter = new FileWriter("exmp");
            myFileWriter.write("This is a Sentence.\nOk now bye");
            myFileWriter.close();
        } catch (IOException e) {
            System.out.println("Cannot write this file!");
            e.printStackTrace();
        }

//        Code to read a file :
        File myFile2 = new File("exmp");
        try {
            Scanner sc = new Scanner(myFile2);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Cannot read this file!");
            e.printStackTrace();
        }

//        Code to delete a File :
        File myFile3 = new File("exmp");
        if (myFile3.delete()) {
            System.out.println("The file " + myFile3.getName() + " has been delete");
        } else {
            System.out.println("Cannot delete the file some error occurred!");
        }

    }
}
