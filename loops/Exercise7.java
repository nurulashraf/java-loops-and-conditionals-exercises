/*
  This code uses nested do-while loops to print the outer loop index (1 to 2), 
  followed by the inner loop index (1 to 3) for each iteration of the outer loop.
*/

package exercise7;

public class Exercise7 {

    public static void main(String[] args) {
        
        int i = 1;
        
        do {
            System.out.println("Outer: " + i);

            int j = 1;
            
            do {
                System.out.println(" Inner: " + j);
                j++;
            } while (j <= 3);
            
            i++;
        } while (i <= 2);
    }
}
