import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class CaesarCipher {
	/** 
	* Returns the character shifted by the given number of letters.
	*/
	public static char shiftLetter( char c, int n ){
		int u = c;

		if ( ! Character.isLetter(c) ){
			return c;
		}

		u = u + n;
		if ( Character.isUpperCase(c) && u > 'Z' || Character.isLowerCase(c) && u > 'z' ){
			u -= 26;
		}

		if ( Character.isUpperCase(c) && u < 'A' || Character.isLowerCase(c) && u < 'a' ){
			u += 26;
		}

		return (char)u;
	}

	public static void main( String[] args )
	 throws Exception  {
		Scanner keyboard = new Scanner(System.in);
		String plaintext, cipher = "";
		int shift;

		Scanner fileIn = new Scanner( new File("read_cipher_file.txt") );
		plaintext = fileIn.nextLine();
		shift = fileIn.nextInt();
		fileIn.close();

		System.out.println("Encrypting message " + plaintext );
		System.out.println("Shifting: " + shift );

		for ( int i = 0; i < plaintext.length(); i++ ) {
			cipher += shiftLetter(cipher.charAt(i), shift);
		}

		}


	


		//System.out.println( cipher );
	}