import java.util.Scanner;

public class EnterPIN {
	public static void main( String[] args ){
		Scanner keyboard = new Scanner(System.in);


		String password, password_entry;
		int pin, pin_entry;


		pin = 12345;
		password = "that";

		System.out.println("Welcome to the Bank of Java.");

		System.out.print("Enter Your PIN: ");
		pin_entry = keyboard.nextInt();

		System.out.print("Enter Your Password: ");
		password_entry = keyboard.next();


		while ( pin_entry != pin && password_entry != password ){
			System.out.println("\nIncorrect PIN and Password combination. Try Again.");
			System.out.println("Enter your PIN: \n");
			System.out.println("Enter your Password: ");

			pin_entry = keyboard.nextInt();
			password_entry = keyboard.next();
		}

		System.out.println("\nLogin Successful. Your account balance is $425.18");
	}
}