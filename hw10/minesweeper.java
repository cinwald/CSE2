
import java.util.*; //imports libraries
public class minesweeper { //creates class
	public static void main (String args[]) { //creates main method
		System.out.println("Please specify the size of the board, between 2 and 30"); //Asks for input for n
		Scanner myScanner = new Scanner(System.in); //creates a scanner
		int n = myScanner.nextInt(); //accepts integer
		if (n < 2 || n > 30) { //tests if valid size
			System.out.println("Error, not between 2 and 30"); //error message
			System.exit(0); //exits
		}
		char[][] board = new char[n][n]; //creates the board array
		System.out.println("Please specify the amount of mines");//asks for input for m
		int m = myScanner.nextInt(); //accepts integer
		if (m < 1 || m > (n*n)) { //checks for valid input
			System.out.println("Error, not between 2 and 30"); //error message
			System.exit(0); //exits
		}
		for (int i =0;i<m;i++){ //loops up to number of mines
			int x = (int)(Math.random()*n); //random x
			int y = (int)(Math.random()*n); //random y
			if (board[x][y] !='b'){ //checks if mine is already there
			board[x][y] ='b'; //places mine
			board[x+1][y] += 1; //increments surrounding values 
			board[x-1][y] += 1; //increments surrounding values
			board[x][y+1] += 1; //increments surrounding values
			board[x][y-1] += 1; //increments surrounding values
			board[x+1][y-1] += 1; //increments surrounding values
			board[x-1][y+1] += 1; //increments surrounding values
			board[x+1][y+1] += 1; //increments surrounding values
			board[x-1][y-1] += 1; //increments surrounding values
			}
			
		}
	}
}