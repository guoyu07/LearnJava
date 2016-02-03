public class NestingLoops {
	public static void main( String[] args ){
		//this is #1, named "CN"
		for ( int n = 1; n <= 3; n++ ) {
		 for ( char c = 'A'; c <= 'E'; c++ ) {
			{
				System.out.println( c + " " + n );
			}
		 } 
	 }

		System.out.println("\n");

		//This is #2, named "AB"
		for ( int a = 1; a <= 3; a++ ) {
			for ( int b = 1; b <= 3; b++ ){
				System.out.println( "(" + a + "," + b + ") " );
			}
			// Add a line of code here
			System.out.println();
		}
		System.out.println("\n");
	}
}