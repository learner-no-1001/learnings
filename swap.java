/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Create Scanner object

        System.out.print("Enter first number (a): ");
        int a = input.nextInt();  // Get first number

        System.out.print("Enter second number (b): ");
        int b = input.nextInt();  // Get second number

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swapping using a temporary variable
        int temp = a;  // Save a to temp
        a = b;         // Put b into a
        b = temp;      // Put temp (original a) into b

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}