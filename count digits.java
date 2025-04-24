/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
          System.out.print("Enter a number: ");
        int number = input.nextInt(); 

        int count = 0;
        int temp = Math.abs(number);  // Handle negative numbers

        if (temp == 0) {
            count = 1;  // Special case: 0 has 1 digit
        } else {
            while (temp > 0) {        // Loop until temp becomes 0
                temp = temp / 10;     // Remove last digit (5678 → 567 → 56 → 5 → 0)
                count++;              // Add 1 to count each time
            }
        }

        System.out.println("Number of digits: " + count);
    }
}