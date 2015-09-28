//Charles Inwald
//Lab 04 - CalculatorSpecial
//A more advanced Calculator, as it incorporates a while loop with input

//import the scanner
import java.util.Scanner;

public class CalculatorSpecial {
//main method
    public static void main(String[] args) {
        String m = "";
//Checks to see if the user wants to stop the program
        while (!m.equals ("n") && !m.equals ("N")) {
        Scanner myScanner = new Scanner(System.in);
//Accept input
        System.out.println("Please enter in an integer");
        int integer1 = myScanner.nextInt();
        System.out.println("Please enter in an operator");
        String operator = myScanner.next();
        System.out.println("Please enter in another integer");
        int integer2 = myScanner.nextInt();
        
//Performs the math of the calculator
        int result;
        switch (operator) {
            case "+":
                System.out.println((double)integer1+(double)integer2);
                    break;
            case "-":
                System.out.println((double)integer1-(double)integer2);
                    break;
            case "*":
                System.out.println((double)integer1*(double)integer2);
                    break;
            case "/":
                System.out.println((double)integer1/(double)integer2);
                    break;
            default:
                System.out.println("Illegal Operator");
            
          
        }
//Allows the user to stop the program
        System.out.println("Type n or N to stop");
        m = myScanner.next();
        }
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
}