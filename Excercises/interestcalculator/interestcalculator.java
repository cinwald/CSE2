public class interestcalculator{
    
    public static void main(String[] args) {
        double balance = 1000.53;
        double interest = balance * .05;
        double newBalance = balance + interest;
        System.out.println("$" + newBalance);
    }
}