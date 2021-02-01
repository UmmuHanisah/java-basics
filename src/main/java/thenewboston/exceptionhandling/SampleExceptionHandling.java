/**
 *
 * @author Ummu Hanisah
 * @since 01-Feb-2021
 * @title Java Programming Tutorial - 82 - Exception Handling
 * @source https://www.youtube.com/watch?v=K_-3OLkXkzY
 */
package thenewboston.exceptionhandling;

import java.util.Scanner;

public class SampleExceptionHandling {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1;
        
        do {
            try {
                System.out.println("######## Exception Handling on Divide By Zero ########");
                System.out.println("Enter first number");
                int number1 = input.nextInt();

                System.out.println("Enter second number");
                int number2 = input.nextInt();
                int sum = number1/number2; // Error divided by zero will happen here

                System.out.println("The answer is: " + sum);
                i = 2; // if all statement in try successfully executed without error, i will assigned to 2 and stop
            } catch (Exception e) {
                System.out.println("You can't do that");
                System.out.println("");
            }
        } while (i == 1); // if failed, do loop will execute over and over again until i = 2
    }
}
