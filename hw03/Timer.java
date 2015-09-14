//Charles Inwald
//Timer - calculates time until dinner
//lab03
import java.util.Scanner;

public class Timer {

	// main method
	public static void main(String[] args) {
		// time to declare a scanner instance
		Scanner myScanner = new Scanner(System.in);
		// declare variables
		int curTime, dinTime, curHour, curMin, dinHour, dinMin, remHour, remMin;
		// prompt for current time
		System.out.println("Enter the current time:");
		// recieve dinner time
		curTime = myScanner.nextInt();
		// prompt for dinner time
		System.out.println("Enter the time that you will be eating dinner:");
		dinTime = myScanner.nextInt();
		curHour = curTime / 100;
		curMin = curTime % 100;
		dinHour = dinTime / 100;
		dinMin = dinTime % 100;
		remHour = dinHour - curHour;
		remMin = dinMin - curMin;
		System.out.println("You have "+remHour+" hours and "+remMin+" minutes until dinner.");
		//System.out.println(remHour + " " + remMin);
	}
}