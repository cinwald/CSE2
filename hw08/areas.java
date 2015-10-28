//Charles Inwald
//hw08
//10/26/15
import java.util.Scanner; //import Scanner

public class areas { //Create class
public static void main(String[] args){ //main method
    Scanner myScanner = new Scanner(System.in); //declaration of scanner
    
    String valid = ""; //establish validity variable
    while (!valid.equals("n")) { //while loop to keep programm running
    	System.out.println("Please enter either  0 for circle,2 for rectangle or 3 for trapezoid. Or 4 to quit."); //main menu
        int shape = myScanner.nextInt(); //detect user input
    	if (shape == 0) { //circle
        System.out.println("Please enter radius"); //ask for radius
        double rad = myScanner.nextDouble(); //learn radius
        double result = area(rad); // calculate area
        System.out.println(result); //print
        
    }
    else if (shape==2) { //rectangle
    	System.out.println("Please enter width"); //ask for width
    	double length = myScanner.nextDouble(); //detect user input
    	System.out.println("Please enter length"); //ask for length
    	double width = myScanner.nextDouble(); //detect user input
    	double result = area(length,width); //calculate
        System.out.println(result); //print
        //valid = true;
    }
    else if (shape==3) { //trapezoid
    	System.out.println("Please enter base 1"); //Ask for base 1
    	double base1 = myScanner.nextDouble(); //detect user input
    	System.out.println("Please enter base 2"); //Ask for base 2
    	double base2 = myScanner.nextDouble(); //detect user input
    	System.out.println("Please enter height"); //Ask for height
    	double height = myScanner.nextDouble(); //detect user input
    	double result = area(base1,base2,height); //calculate
    	System.out.println(result); //print
    	//valid = true;
    }
    else if (shape == 4) { //exit
    	System.out.println("Exiting"); //print exiting
    	System.exit(0); //quit
    }
    else if (shape !=1 && shape !=2 && shape !=3 && shape !=4){ //Error
    	System.out.println("Please enter a valid option"); //Yell at user
    	System.exit(0); //Exit
    }
    System.out.println("Press n to quit, otherwise program will continue"); //Repeat
    valid = myScanner.next(); //detect user input
    }
    
} 
    public static double area(double rad) { //Circle class
        double result = Math.PI * Math.pow(rad, 2); //Circle area
        return result; //returns the area
    }
public static double area(double length, double width){ //Rectangle class
        double result = length * width; //Rectangle equation
        return result; //returns the area
}
public static double area(double base1,double base2, double height) {
    double result = ((base1 + base2)/2) * height; //trapezoid equation
    return result; //returns the area
}

}