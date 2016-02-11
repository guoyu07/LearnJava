import java.util.Scanner;
import java.net.URL;

class Actor {
	public String name;
	public String role;
	public String birthdate;
}

public class ActorList {
	public static void main(String[] args)
	throws Exception {
		String url = "https://learnjavathehardway.org/txt/s01e01-cast.txt";
		int counter;

		Scanner inFile = new Scanner((new URL(url)).openStream());


		counter = 0;
		while ( inFile.hasNext() ) {
			Actor a = getActor(inFile);
			counter += 1;
			System.out.print(a.name + " was born on " + a.birthdate);
			System.out.println(" and played " + a.role);
		}
		inFile.close();
		System.out.println(counter + " " + "records processed");
	}

	public static Actor getActor( Scanner input ){
		Actor a = new Actor();
		a.name = input.nextLine();
		a.role = input.nextLine();
		a.birthdate = input.nextLine();

		return a;
	}
}