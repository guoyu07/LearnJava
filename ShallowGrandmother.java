import java.util.Scanner;

public class ShallowGrandmother{
	public static void main( String[] args ){
		Scanner keyboard = new Scanner(System.in);

		int age;
		double income, looks;
		boolean allowed;

		System.out.print( "Enter your age: " );
		age = keyboard.nextInt();

		System.out.print ("Enter your yearly income: ");
		income = keyboard.nextDouble();

		System.out.print( "How good looking are you, on a scale from 0.0 to 10.0? ");
		looks = keyboard.nextDouble();

		allowed = ( age > 25 && age < 40 && (income > 5000 || looks >= 8.5));

		System.out.println( "Allowed to date my grandchild? " + allowed);

	}

}