import java.util.Scanner;


public class ItemNotFound {
	public static void main( String[] args ){
		Scanner keyboard = new Scanner(System.in);

		String[] sports = { "Baseball", "Basketball", "Football", "Soccer", "Hockey", "Golf"};
		String[] companies = { "Apple", "Google", "Microsoft", "HP", "Oracle", "Facebook", "Twitter"};

		String guess;
		String next_guess;
		int count;
		boolean found;

		System.out.println( "Pop Quiz!" );
		System.out.print( "Name a popular sport in The United States: ");
		guess = keyboard.next();

		found = false;

		for ( String s : sports ){
			if ( guess.equals(s) ){
				System.out.println("That is one of them!");
				found = true;
			  }
			else if ( found == false ) {
			  System.out.println("Sorry, that is not one of them.");
			  break;
			}
		 }

		System.out.print("Name a top tech company right now: ");
		next_guess = keyboard.next();

		count = 0;
		for ( String c : companies ){
			if ( next_guess.equals(c) ){
				count += 1;
				System.out.println("That is a listed company!");
			}
			else if ( count == 0 ) {
				System.out.println("Sorry, that company is not listed.");
				break;	
			}
		}


	}
}