import java.util.Scanner;

public class DictionaryOrder {
	public static void main( String[] args ){
		Scanner keyboard = new Scanner(System.in);

		String name;

		System.out.print( "Make up the name of a programming language! ");
		name = keyboard.nextLine();


		// Start C++
		if ( name.compareTo("c++") < 0 ){
			System.out.println( name + " comes before c++ ");
		}
		if (name.compareTo("c++") == 0 ){
			System.out.println( "c++ isn't a made up language!");
		}
		if ( name.compareTo("c++") > 0 ){
			System.out.println( name + " comes after c++" );
		}

		// Start Go
		if ( name.compareTo("go") < 0 ){
			System.out.println( name + "comes before go");
		}
		if ( name.compareTo("go") == 0 ){
			System.out.println( "go isn't a made-up language");
		}
		if ( name.compareTo("go") > 0 ){
			System.out.println( name + " comes after go");
		}

		// Start Java
		if ( name.compareTo("java") < 0 ){
			System.out.println( name + " comes before java");
		}
		if ( name.compareTo("java") == 0){
			System.out.println( "java isn't a made-up language");
		}
		if ( name.compareTo("java") > 0 ){
			System.out.println( name + " comes after java");
		}

		// Start Lisp
		if ( name.compareTo("lisp") < 0 ){
			System.out.println( name + " comes before lisp ");
		}
		if ( name.compareTo("lisp") == 0 ){
			System.out.println( "lisp isn't a made-up language!" );
		}
		if ( name.compareTo("lisp") > 0 ){
			System.out.println( name + " comes after lisp");
		}

		//Start Python
		if ( name.compareTo("python") < 0 ){
			System.out.println( name + " comes before python ");
		}
		if ( name.compareTo("python") == 0){
			System.out.println("python isn't a made-up language!");
		}
		if ( name.compareTo("python") > 0){
			System.out.println( name + " comes after python");
		}

		//Start Ruby
		if ( name.compareTo("ruby") < 0){
			System.out.println( name + " comes before ruby ");
		}
		if ( name.compareTo("ruby") == 0){
			System.out.println( name + " isn;t a made-up language! ");
		}
		if ( name.compareTo("ruby") > 0){
			System.out.println( name + " comes after ruby");
		}

		//Start Visual Basic
		if ( name.compareTo("visualbasic") < 0){
			System.out.println( name + " comes before visualbasic");
		}
		if ( name.compareTo("visualbasic") == 0){
			System.out.println( "visualbasic isn;t a made-up language!" );
		}
		if ( name.compareTo("visualbasic") > 0){
			System.out.println( name + " comes after visualbasic");
		}


	}
}