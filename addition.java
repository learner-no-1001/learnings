/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("give two numbers");
        int a = input.nextInt();
        int b = input.nextInt();
        int sum = a + b;
        System.out.println("The sum is: " + sum);
    }
}