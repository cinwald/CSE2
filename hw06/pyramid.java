//Charles Inwald
//hw06
//Prints scaleable pyramids
import java.util.Scanner;

public class pyramid {
//main method
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What size pyramid?");
        int x = myScanner.nextInt();
        if (x>=1){
            System.out.println("         *");
        }
        if (x>=2){
            System.out.println("        ***");        }
        if (x>=3){
        System.out.println("       *****");
        }
        if (x>=4){
        System.out.println("      *******");
        }
        if (x>=5){
        System.out.println("     *********");
        }
        if (x>=6){
        System.out.println("    ***********");
        }
        
    }
    
    
    
    
    
    
    
    
}