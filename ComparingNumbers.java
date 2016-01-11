import java.util.Scanner;

public class ComparingNumbers {
	public static void main( String[] args ){
		Scanner keyboard = new Scanner(System.in);

		double first, second;

		System.out.print( "Give me two numbers. First: " );
		first = keyboard.nextDouble();
		System.out.print( "Second: ");
		second = keyboard.nextDouble();

		if ( first < second ){
			System.out.println( first + " is less than " + second );
		}
		if ( first <= second ){
			System.out.println( first + " is less than/equal to " + second);
		}
		if ( first == second ){
			System.out.println( first + " is equal to " + second );
		}
		if ( first >= second ){
			System.out.println( first + " is greater than/equal to " + second );
		}
		if ( first > second ){
			System.out.println( first + " is greater than " + second);
		}
		if ( first != second ){
			System.out.println( first + " is not equal to " + second );
			System.out.println( "Hey.");
		}

	}
}