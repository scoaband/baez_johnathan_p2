/** 
 * @author Johnathan Baez
 * University of Central Florida
 * 
 */
package baez_johnathan_p2;

// Scanner API
import java.util.Scanner;

// BMI Class
public class BMI_Calculator {
	// Main Class
	public static void main(String[] args) {
		
		// Scan for input open
	    Scanner scoa = new Scanner(System.in);
	    double weight;
	    double height;    
        
    	// Scan for weight in pound
        System.out.print("Enter weight in pounds: ");
        weight = scoa.nextDouble();
        
        // Scan for height in pound
        System.out.print("Enter height in feet: ");
        height = scoa.nextDouble();
        // Close the scanner to prevent overflow.
        scoa.close();
        
        // Convert feet to inches
        double inches = height * 12;
        // Calculate the BMI
        double calc = (weight * 703 / (inches * inches));
        // if conditional statement 
        if (calc < 18.5) {
            System.out.println("underweight");
        } else if (calc < 25) {
            System.out.println("normal");
        } else if (calc < 30) {
            System.out.println("overweight");
        } else {
            System.out.println("obese");
        }   
        // Console out the BMI result.
        System.out.printf("BMI = %.3f\n",calc);
    }
}
