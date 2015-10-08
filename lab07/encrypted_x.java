//Charles Inwald
//Lab 07
//Encrypted X - Prints an x buried in stars
import java.util.Scanner;
//Create class
public class encrypted_x {
//Create a main method
    public static void main(String[] args) {
    //declare scanner 
    Scanner myScanner = new Scanner(System.in);
    //Ask and recieve for input
    System.out.println("Please specify the size of the square");
    int input = myScanner.nextInt();
    if (input <= 100 && input > 0 )
      {System.out.println("Ok, that works");}
    else 
        {
      System.out.println("Please listen to instructions, now exiting");
      System.exit(-1);
        }
    //Declare my "fill" variable
      String star = "*";
      String space = " ";
    //Outer Loop, Number of lines
        for(int i = 0; i < input; i++) {
    //Inner Loop, What gets printed in the lines
            for(int j = 0; j < input; j++) {
                if (j != i && j != (input-i)) {
                System.out.print(star);
                }
                else {
                System.out.print(space);
                }
            }
    //Next Line
            System.out.println();
        }
        
    }
}