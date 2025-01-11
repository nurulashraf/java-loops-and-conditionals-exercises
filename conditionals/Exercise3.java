/* 
    This code simulates an ATM where the user enters a PIN, 
    and if it's correct, they can deposit an amount into 
    their account and see the updated balance.
    Uses 'if.. else' statement.
*/

package exercise3;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final int CORRECT_PIN = 123456;
        double balance = 0.0;
        
        System.out.print("Please enter your 6-digit PIN: ");
        int enteredPin = scanner.nextInt();
        
        boolean isPinCorrect = (enteredPin == CORRECT_PIN);
        
        if (isPinCorrect) {
            System.out.println("PIN accepted!");
            
            System.out.print("Enter the amount you want to bank in: RM");
            double depositAmount = scanner.nextDouble();
            
            balance += depositAmount;
            
            System.out.println("\nTransaction successful!");
            System.out.printf("Your current balance is: RM%.2f%n", balance);
            
        } else {
            System.out.println("Invalid PIN. Access denied.");
        }
        
        scanner.close();
    }
}
