//Charles Inwald
//Lab 04 - Calculator

//import the scanner
import java.util.Scanner;

public class Calculator {
    //main method
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        //Accept input
        System.out.println("Please enter in an integer");
        int integer1 = myScanner.nextInt();
        System.out.println("Please enter in an operator");
        String operator = myScanner.next();
        System.out.println("Please enter in another integer");
        int integer2 = myScanner.nextInt();
        
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
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
}