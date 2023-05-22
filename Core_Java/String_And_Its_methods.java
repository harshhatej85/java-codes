package Core_Java;

public class String_And_Its_methods {
    public static void main(String[] args) {
        // String name = new String("Harry");
        // String name = "Harry";
        // System.out.print("The name is: ");
        // System.out.print(name);
        int a = 6;
        float b = 5.6454f;
        System.out.printf("The value of a is %d and value of b is %8.2f", a, b);
        // in above line 8 is used for 8 total space used and if not enough data available then
        // blank spaces are used and 2 denotes number of decimals to print :"     5.64"
        //System.out.format("The value of a is %d and value of b is %f", a, b);
//        Scanner sc = new Scanner(System.in);
//        String sc = sc.next(); //used to scan only first input word
//        String sc = sc.nextLine();// used to scan entire input Sentence
//        System.out.println(st);

        //String Methods
        String name = "Harsh";
//        System.out.println(name);
//        int value = name.length();// Returns the integer value of Character used in a string!
//        System.out.println(value);
//
//        String lstring = name.toLowerCase();// Returns another string with all words in LowerCase
//        System.out.println(lstring);
//
//        String ustring = name.toUpperCase();// Returns another string with all words in UpperCase
//        System.out.println(ustring);

//        String nonTrimmedString = "    Harsh    ";
//        System.out.println(nonTrimmedString);
//        String trimmedString = nonTrimmedString.trim();// Returns another String with no useless blank spaces
//        System.out.println(trimmedString);

//        System.out.println(name.substring(2));// Return a substring from start to the end
        // same substring (3) returns "sh" NOTE that index starts from 0
//        System.out.println(name.substring(1,3));// Returns a substring form start index to the end index.
        //Start index is included and end index is excluded

//        System.out.println(name.replace('H','D'));//Returns a new String after replacing (all) H with D Darsh
//        is returned in this case (NOTE : Case Sensitivity is being utilized in this method)
//        System.out.println(name.replace("Har","HELL"));//Returns a new String after replacing Har with HELL
//        HELLsh is returned in this case (NOTE : Case Sensitivity is being utilized in this method)

//        System.out.println(name.startsWith("Har"));//Returns boolean Expression by checking if the given String
        // starts with the following characters
//        System.out.println(name.endsWith("sh"));// Returns boolean Expression by checking if the given String
        // ends with the following characters

//        System.out.println(name.charAt(1));// Returns the character at given index

//        System.out.println(name.indexOf('r'));//Returns the index of a given Strings first occurrence of that char

//         String newname = "Harsharsh";
//         System.out.println(newname.indexOf("arsh",4));//Returns the index of a given String starting with  given
        // index number starting form 0
//        System.out.println(newname.lastIndexOf("arsh"));//Returns the index of a given String starting form
        // last character
//        System.out.println(newname.lastIndexOf("arsh", 4));//Returns the index of a given String starting
        // with given index number starting form last character
//        System.out.println(name.equals("Harsh"));//This method is case sensitive
//          System.out.println(name.equalsIgnoreCase("hARsh"));//This method does not check cases

//      Escape Sequence Characters
//        System.out.println("Escape Sequence Characters \" ");//used to print "
//        System.out.println("Escape Sequence Characters \\ ");//used to print /
//        System.out.println("Escape Sequence Characters \t abcd");//used to print tab spaces ( 3 spaces)
        // Every Escape Sequence Character in Java:

        /*
        \t	Insert a tab in the text at this point.
        \b	Insert a backspace in the text at this point.
        \n	Insert a newline in the text at this point.
        \r	Insert a carriage return in the text at this point.
        \f	Insert a form feed in the text at this point.
        \'	Insert a single quote character in the text at this point.
        \"	Insert a double quote character in the text at this point.
        \\	Insert a backslash character in the text at this point.
         */
    }
}
