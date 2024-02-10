import java.util.Scanner;

public class Day3{
    public static void main(String[] args){
        System.out.println("This is day3");

        Scanner sc = new Scanner(System.in);
        // new --> keyword which allocates memory to the object
        
        int number = sc.nextInt();
        // dot operator or access operator
        float num2 = sc.nextFloat();
        String name = sc.next(); // does not take blank spaces 
        sc.nextLine(); 
        String name2 = sc.nextLine(); // includes blank space

        // Scanner.nextInt, sc.next, sc.nextFloat etc.. method does not read the newline character in your input 
        // created by hitting "Enter," and so the call to Scanner.nextLine returns after reading that newline
        // So to skip this you have to add the sc.nextLine().

        System.out.println(number);
        System.out.println(num2);
        System.out.println(name);
        System.out.println(name2);

        sc.close(); // free the memory/resource of the object
    }
}