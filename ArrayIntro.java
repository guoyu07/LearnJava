public class ArrayIntro {
	public static void main( String[] args ){
		String[] planets = { "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus"};
		String[] sports = { "Basketball", "Baseball", "Football", "Cricket" };

		for ( String p : planets ){
			System.out.println( p + "\t" + p.toUpperCase() );
		}

		for ( String s : sports ){
			System.out.println( s + " " + "is a sport" );
		}
	}
}