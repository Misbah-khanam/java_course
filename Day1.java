// features of java
// 1.platform independent -> can write code in one platform and run in other
// 2.object-oriented --> more reusable and flexible
// 3.speed --> much faster than python etc, as fast as lower-level languages
// 4.compiler --> entire code in one attempt

public class Day1{
    public static void main(String[] args){
        System.out.println("Hi..... iam misbah");
        int student = 521;

        int age = 21;
        int AGE = 25;
        // java is case sensitive
        // variable names should start with letter, underscore or dollar
        // variable names should not start with numbers and should not contain whitespaces

        System.out.println(student);
        System.out.println(age);
        System.out.println(AGE);

        String name;
        // System.out.println(name); error --> variable not initialized

    }
}

// java compiler starts executing the code from the main method
// System is a class, out is object in System class, println is a method

// what is JVM ? ---> abstract machine that enables your computer to run java
// Java Program ---java compiler---> Java ByteCode ---JVM---> Machine Code ---CPU--> Output
// java is platform independent because of jvm. because jvm executes the bytecode and the bytecode is platform independent

// JRE is a software package that provides (java class libraries + JVM + other components) required to run java applications
// JRE superset of JVM

// JDK  is sw development kit required to develop applications in java
// JDK --> (JRE + compilers + Debuggers...)

// Java is a statically-typed language --> all variables must be declared before they can be used --> because of size