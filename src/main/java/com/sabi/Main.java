package com.sabi;

import jdk.swing.interop.SwingInterOpUtils;

import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args){ //the main is the entry point to any programme
//        int age = 30; //store integers, ie whole numbers in memory (type of variable) age is the identifier which is used to identify the variable
////        age = 35; // this is how you would change the variable
////        int myAge = 22;
////        byte age = 22;
////        int viewsCount = 123_456_789;// can store values up to 2 billion
////        long viewsCount = 3_123_456_789L; // java sees this as an integer so you put L
////        float price = 10.99F; //java sees this as a double (decimal) so you put F
////        int herAge = myAge; // interchanging variables
////        char letter = 'A';
////        boolean isEligible = false;
//        //--------------------------------
////AN OBJECT IS AN INSTANCE OF A CLASS
////Primitive and Reference
////Primitive: for storing simple values = byte (1 byte) short (2 bytes) int (4 bytes) long (8 bytes)
//// float 4 bytes double 8 bytes char 2 bytes boolean 1 (true/false)
//
////non-primitive/Reference: for storing complex objects
////        Date now = new Date(); // when declaring primitive types you don't need to allocate memory, java does that for you
////        System.out.println(now);
////        //by saying 'new' we are allocating memory for the date variable
////        byte age = 30;
//        //System.out.println(herAge); //a method is a function that's part of a class
//  //-------------------------------------------------------------------------------------------
//  //STRINGS
////     // String message = "   hello world" + "   !"; // strings are reference types this is just shorthand
////      message.endsWith("!"); // note: string is a class and has members that can be accessed using the dot operator
////        System.out.println(message.endsWith("!")); //this statement returns a boolean - returns true
////        System.out.println(message.startsWith("!")); // returns false
////        System.out.println(message.length()); // returns number of characters - if username is longer than certain number of characters it
////        System.out.println(message.indexOf("o")); //returns index of character
////        System.out.println(message.replace("!", "*")); //target/replacement is the parameter, "!" is the argument
////        System.out.println(message);
////        System.out.println(message.trim());
//        //ESCAPE SEQUENCES: adding special characters to strings
////        String message = "Hello \"Sabi\""; // returns Hello "Sabi"
////        String message1 = "c:\\Windows\\..."; //c:\Windows\...
////        String message2 = "c:\nWindows\\..."; //c:\Windows\... adds a new line between windows and c:
////        String message3 = "c: \tWindows\\..."; //adds a space or tab c: 	Windows\...
////        System.out.println(message);
////        System.out.println(message1);
////        System.out.println(message2);
////        System.out.println(message3);
//        //----------------------------------------------------------------
//        //ARRAYS - have a fixed class
//        int[] numbers = new int[5]; // remember arrays are reference types so we have to allocate memory for it using 'new' - 5: allocate set numbers in the array
//        numbers[0] = 1; // allocate the actual numbers in the array
//        numbers[1] = 2;
//        Arrays.toString(numbers); // this is converting the string to array
//       // System.out.println(Arrays.toString(numbers)); // pay attention: this [I@4617c264 string is the reference of the array in memory
//        // so we use the Array class to access the array in memory
//        //so this returns [1,2,0,0,0]
//        int[] numbers1 = {2,3,5,1,4};
//        Arrays.sort(numbers1); // returns [1, 2, 3, 4, 5]
//      //  System.out.println(Arrays.toString(numbers1));
//    //    System.out.println(numbers1.length);
////----------------------------------------------------------------------
//        //MULTIDIMENSIONAL ARRAYS
//        //2D
//        int[][] numbers2D = new int[2][3]; // remember this is length of array allocation in memory - 2 rows 3 columns
//        numbers2D[0][0] = 1; // initialising the first row and the first column// returns [[1, 0, 0], [0, 0, 0]]
//        //System.out.println(Arrays.deepToString(numbers2)); // this doesn't work without deep
////3D array
//        int[][][] numbers3D = new int[2][3][5];
//        numbers3D[0][0][0] = 1;
//       // System.out.println(Arrays.deepToString(numbers3D));
//        //with curly braces
//        int[][] numbers4 = {{1,2,3}, {4,5,6}};
//    //    System.out.println(Arrays.deepToString(numbers4));// deep to print multidimensional
//        //CONSTANTS
//
//       final float PI = 3.14F; // final here is how you define a constant
//        //--------------------------------------------------------------------------------------------------------
//        //ARITHMETIC EXPRESSIONS
//        double divide = (double)10/(double)3; // 10 and 3 are operands
//       // System.out.println(divide);
//       // int x  = 1;
//   //     x++; //increment by 1 returns just 2 this is same as ++x
//       // int y = x++; //the value of y is 1 which then gets added to x which is 2
//       // int z = ++x; //
//      //  System.out.println(y);
//       // System.out.println(x);
//      //   System.out.println(z);// returns 2 - increments first and then replaces x
//        int e = 1;
//       // e = e + 2; // this line is the same as the line below
//      //  e += 2;
//     //   System.out.println(e);
//        //------------------------------------------------------------------------
//        //CASTING AND TYPE CONVERSIONS - conversions
//        //implicit casting - automatic conversion of data types
//        // byte > short > int > long > float > double
///in this scenario what java does is convert the short into an int variable in the order above
        short x = 1; //short (2 bytes) int (4 bytes)
        int y = x + 2;
        //java converting int to a double
        double x1 = 1.1;
        int y1 = (int)x1 + 2;

        System.out.println(y);
        String x2 = "1";



    }
}


//outside a class = function
//inside a class = method
// access modifier = determines if other classes/methods can access this method/class
// naming conventions - classes must use Pascal Naming, methods must use camelCase
