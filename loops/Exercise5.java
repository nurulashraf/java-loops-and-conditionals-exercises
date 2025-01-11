/* This code calculates 5 numbers which:

    1. Receives user input numbers thru looping.
    2. Calculate the total and average.
    3. Output on the console. 
*/

package exercise5;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int number;

        System.out.println("Enter 5 numbers:");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number " + i + ": ");
            number = scanner.nextInt();
            total += number;
        }

        double average = total / 5.0;

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);

        scanner.close();
    }
}
