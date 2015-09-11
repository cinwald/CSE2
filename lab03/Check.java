//Charles Inwald
//hw03
//Check
import java.util.Scanner;
// 
public class Check{
    
//  main method
  public static void main(String[] args) {
      //Declare instance of Scanner 
      Scanner myScanner = new Scanner( System.in );
      //Prompt for cost
      System.out.print("Enter the original cost of the check in the form xx.xx: ");
      //Accepts users input with
      double checkCost = myScanner.nextDouble();
      //Ditto except now with tip, where we convert to a decimal afterwards
      System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): ");
      double tipPercent = myScanner.nextDouble();
      tipPercent /= 100;
      //Number of people for number of ways to split check
      System.out.print("Enter the number of people who went out to dinner: ");
      int numPeople = myScanner.nextInt();
      
      //Time to get down to business now that we have our variables
      double totalCost,costPerPerson; //self explanatory
      int dollars,dimes,pennies; //Money
      totalCost = checkCost * (1 + tipPercent);
      costPerPerson = totalCost / numPeople;
      //truncated total
      dollars=(int)costPerPerson;
      dimes=(int)(costPerPerson * 10) % 10;
      pennies=(int)(costPerPerson * 100) % 10;
      System.out.println("Each person in the group owes $" + dollars + '.' + dimes + pennies);
      
      
    
  }
}