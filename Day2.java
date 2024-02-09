
public class Day2{
    public static void main(String[] args){
        System.out.println("hi..... iam misbah this is day 2");

        // Literals are data used for representing fixed values
         
        int a =15;
        float b = 2.5f;
        char c = 'm';
        System.out.println(b); // output --> 2.5
        // Here 1,2.5,m are literals

        // types of literals
        // 1. boolean --> false & true
        // 2. Integer --> numeric values without exponential or fractional part --> 4 types --> binary, decimal, octal, hexadecimal
        // in java binary starts with 0b, octal starts with 0, hexadecimal starts with 0x

        int binaryNumber = 0b1010;
        int octalNumber = 027;
        int decimalNumber = 21;
        int hexadecimal = 0x27;

        System.out.println(binaryNumber); // 10
        System.out.println(octalNumber); // 23
        System.out.println(decimalNumber); // 21
        System.out.println(hexadecimal); // 39

        // 3.floating point literals
        // numerical value that has either fractional form or exponential form

        double d = 3.4;
        float f = 3.4f;
        double scientificValue = 3.44e2;

        System.out.println(d); // 3.4
        System.out.println(f); // 3.4
        System.out.println(scientificValue); // 344.0

        // 4.character literal
        // escape sequences are also literals --> \b \t \n
        System.out.println("misbah\b\bkhanam"); // output --> misbkhanam

        // 5.String literal
        String str1 = "hi misbah";
        // str1 --> object

        // types of Data Types
        // 1. boolean --> default = false
        // 2. byte --> -128 to 127 default = 0 (8 bit)
        // 3. short --> -32768 to 32767 (16 bit) default = 0
        // 4. int --> -2^31 to 2^31-1 (32 bit) default = 0
        // 5. long --> 64bit default = 0
        long range = 2345678l;
        // 6. double --> 64 bit default = 0.0
        // 7. float --> 32 bit default = 0.0f
        // 8. char --> 16 bit unicode character from \u0000 to \uffff default =  \u0000

        char ex = '\u0000';
        System.out.println(ex); // empty string

        char ex1 = '\u0041';
        System.out.println(ex1); // A

        // string pool --> if assigned a string that is already present in the pool --> that will be used new memory not allocated

        // assignment operators --> =, +=, -=, *=, /=, %=
        // logical operators --> &&, ||, !
        // unary operators --> +, ++, -, --, !

        int ma = 10;
        System.out.println(ma++); // 10
        System.out.println(++ma); // 12
        ma++;
        System.out.println(ma); // 13

        // bitwise category --> perform opertaions on individual bits --> ~, << left shift, >> right shift, >>> unsigned right shift, & bitwise and, ^ bitwise exclusive or

        // instanceof --> operator checks whether an object is an instance of particular class --> returns true or false

        String str = "misbah";
        boolean result;

        result = str instanceof String; 
        System.out.println(result); // prints true

        // System.out.printf() --> providing string formatting
    }
}