/*
  This code prompts the user to enter a number between 1 and 7, 
  then generates a random weekday (Monday to Sunday) and displays it.
  Uses 'switch' statement.
*/

package exercise4;

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 7: ");
        int userInput = input.nextInt();

        int randomDay = (int) (Math.random() * 7) + 1;

        String weekday = "";
        switch (randomDay) {
            case 1:
                weekday = "Monday";
                break;
            case 2:
                weekday = "Tuesday";
                break;
            case 3:
                weekday = "Wednesday";
                break;
            case 4:
                weekday = "Thursday";
                break;
            case 5:
                weekday = "Friday";
                break;
            case 6:
                weekday = "Saturday";
                break;
            case 7:
                weekday = "Sunday";
                break;
            default:
                weekday = "Invalid input";
        }

        System.out.println("Generated weekday: " + weekday);
    }
}
