/* 
  This code uses nested loops to print the outer loop index (1 to 2) 
  followed by the inner loop index (1 to 3) for each iteration of the outer loop.
*/

package nestedloopsexercise1;

public class NestedLoopsExercise1 {

    public static void main(String[] args) {
        
        // Outer loop
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer: " + i);
    
            // Inner loop
            for (int j = 1; j <= 3; j++) {
                System.out.println(" Inner: " + j);
            }
        }
    }
}
