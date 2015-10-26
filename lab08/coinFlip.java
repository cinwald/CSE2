import java.util.Scanner; //import Scanner
public class coinFlip {   //Create Class
    public static int result = 0;  //creates a static variable

    public static void flip() { //Create first flip method
     result =  (int) (Math.random()*2); //Randomizes
        
        
    }
    public static void flip(int n) { //Create second flip method 
        int heads = 0; //number of heads
        int tails = 0; //number of tails
        for (int i=0;i<n;i++) { //Loops coin toss
            flip(); //runs coin toss
            if (result == 1) {  //if heads...
                heads++; //increment heads
            }
            else {tails++;} //Otherwise increment tails
        }
        System.out.println("Heads:"+heads+" Tails:"+tails); //Print output
    }
	public static void main(String[] args) { //Main Method
		 System.out.println("Please enter an integer for amount of flips. O runs once.");
		 Scanner myScanner = new Scanner(System.in); //declare scanner
		 int n = myScanner.nextInt();  //user input
		 if (n>100) { //Failsafe
		     System.out.println("Error, number too large, now exiting"); //Error message
		     System.exit(n); //Exits program
		 }
		 flip();
		 flip(n);
	}
}