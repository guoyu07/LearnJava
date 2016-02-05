import java.util.Scanner;

public class ItemNotFound {
	public static void main( String[] args ){
		Scanner keyboard = new Scanner(System.in);

		String[] sports = { "Baseball", "Basketball", "Football", "Soccer", "Hockey", "Golf"};

		String guess;
		boolean found;

		System.out.println( "Pop Quiz!" );
		System.out.print( "Name any popular in The United States: ");
		guess = keyboard.next();

		found = false;

		for ( String s : sports ){
			if ( guess.equals(s) ){
				System.out.println("That is one of them!");
				found = true;
			  }
		    }
			if ( found == false ) {
			  System.out.println("Sorry, that is not one of them.");
		}
	}
}