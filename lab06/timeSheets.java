//Charles Inwald
//Lab 06 - timeSheets
//accepts time sheets, outputs total payroll

//import the scanner
import java.util.Scanner;

public class timeSheets {
//main method
    public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Please enter number employees");
    int empnum = myScanner.nextInt();
    int sheets = 0;
    int total = 0;
    int pay;
        while (sheets < empnum) {
            System.out.println("Please enter hourly wages of employee (pay per hour in cents)");
            int wages = myScanner.nextInt();
            System.out.println("Please enter hours worked on Monday:");
            int mon = myScanner.nextInt();
            System.out.println("Please enter hours worked on Tuesday:");
            int tue = myScanner.nextInt();
            System.out.println("Please enter hours worked on Wednesday:");
            int wed = myScanner.nextInt();
            System.out.println("Please enter hours worked on Thursday:");
            int thu = myScanner.nextInt();
            System.out.println("Please enter hours worked on Friday:");
            int fri = myScanner.nextInt();
            pay = (mon + tue + wed + thu + fri) * wages;
            total = total + pay;
            sheets ++;
        }
    System.out.println("The total payroll in cents is:"+total);
        
    }
}