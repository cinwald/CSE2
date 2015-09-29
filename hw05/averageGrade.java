//Charles Inwald
//hw05
//Average Grade Calculator

import java.util.Scanner;

public class averageGrade {
//main method
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int totalGrade = 0;
        int grade = 0;
        int numGrade = 0;
        boolean exit = false;
        while (totalGrade < 999 && exit == false) {
            System.out.println("Please enter your grade: ");
                if ((grade >= 0) && (grade <= 100)) {
                grade = myScanner.nextInt();
                totalGrade += grade;
                numGrade ++;
                }
                else {
                    System.out.println("Invalid Grade");
                    exit = true;
                }
            
        }
        int averageGrade = totalGrade/numGrade;
        if (exit == false){
        System.out.println(averageGrade + " is your average grade");
        }
    }
    
    
    
    
    
    
    
    
}