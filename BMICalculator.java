import java.util.Scanner;

public class BMICalculator {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int inches, lbs; 
		double bmi;

		System.out.print("Your height in inches:");
		inches = keyboard.nextInt();

		System.out.print("Your weight in pounds:");
		lbs = keyboard.nextInt();

		bmi = (lbs * 703) / (inches * inches);

		System.out.println("Your BMI is " + bmi);
	}
}