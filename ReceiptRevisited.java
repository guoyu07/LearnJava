import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReceiptRevisited {
	public static void main ( String[] args ){
	
		PrintWriter fileout;
		double ppg = 2.45;
		double total;
		int gallons;
		Scanner keyboard = new Scanner(System.in);

		try {
			fileout = new PrintWriter("receipt.txt");
		}
		catch ( IOException err ) {

			System.out.println("Sorry, I can't open 'receipt.txt' for writing");
			System.out.println("Maybe the file exists and is read-only?");
			fileout = null;
			System.exit(1);
		}

  		// Display and print info to terminal
		System.out.println("Gas costs " + ppg + " per gallon");
		System.out.println("How many gallons would you like to purchase?:");

		gallons = keyboard.nextInt();
		total = gallons * ppg;
		
		System.out.println("Total cost: " + total);

		// Write to receipt.txt
		fileout.println( "+------------------------+");
		fileout.println( "|                         ");
		fileout.println( "|       Corner Store      ");
		fileout.println( "|    2014-06-25 04:38PM   ");
		fileout.println( "|                         ");
		fileout.println( "|   Gallons: "+gallons+"  ");
		fileout.println( "|   Price/gallon: "+ppg+" ");
		fileout.println( "|                         ");
		fileout.println( "|  Fuel Total: "+total+"  ");
		fileout.println( "|                         ");
		fileout.println( "+------------------------+");
		fileout.close();
	  }
	}