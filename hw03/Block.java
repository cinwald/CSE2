//Charles Inwald
//HW03 9/13/15
import java.util.Scanner;

public class Block {
//main method
public static void main(String args[]) {
	//declare and construct scanner instance
	Scanner myScanner = new Scanner(System.in);
	//declare variables
	double length, width, height, volume, surface;
	//prompt and recieve input
	System.out.println("Enter the length of the block:");
	length = myScanner.nextDouble();
	System.out.println("Enter the width of the block:");
	width = myScanner.nextDouble();
	System.out.println("Enter the height of the block:");
	height = myScanner.nextDouble();
	//volume is l*w*h
	volume = (length * width * height);
	//surface area is 2ab+2bc+2ac
	surface = (2 * width * length) + (2 * length * height) + (2 * width * height);
	//output
	System.out.println("The volume of the block of dimensions " + length+ " x " + width + " x " + height + " is " + volume);
	System.out.println("The surface area of the block is " + surface);
}

}
