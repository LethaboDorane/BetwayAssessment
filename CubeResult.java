import java.math.*;

class CubeResult {
    public static void Main (String[] args) {
        /* This program is meant to determine whether 
        A magical potion's power level is the exact cube of an integer.
        Return YES if the given power level is a magical potion and NO otherwise. 
        This code determines whether a value is the exact cube of an integer*/

        long number = 132651201231L; // Use long for large numbers
        double result = Math.cbrt(number, 3); //Use the cbrt
        if (result == Math.floor(result)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
    }
}