package summingmydigits;

import javax.swing.JOptionPane;

/**
 * ClassName: SummingMyDigits
 * @author Brock Gast
 * @since 07/06/2018
 * Description - The user enters an integer and has the method returns the sum 
 * of its digits passed in recursively.
 */
public class SummingMyDigits {
    
    static int mostRightDigit = 0;
    static int sum = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String value = JOptionPane.showInputDialog("Enter a nonnegative number");
        int n = Integer.parseInt(value);        
        
        System.out.println("The sum of the digits " + n + " is " + sumMyDigits(n));
    }    
    /** 
     * @param n
     * @return sum
     */
    public static int sumMyDigits(int n) {
                
        if (n >= 0 && n <= 9) {     // If n has just one digit left greater than zero, it is then added to the sum
            return sum += n;
        }
        else if(n % 10 == 0) {      // If the most right digit is zero, then nothing is added to the total      
            return sumMyDigits(n / 10); // cuts off the zero and calls the method again
        }            
        else {                         
            mostRightDigit = n % 10;// Finds the most right number
            sum += mostRightDigit;  // Takes the most right number and adds it to the total                    
            return sumMyDigits(n / 10); // Calls the method with n missing it's most right number           
        }        
    }    
}
