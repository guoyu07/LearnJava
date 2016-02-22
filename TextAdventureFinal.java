import java.util.Scanner;

class Room {
	int roomNumber;
	String roomName;
	String description;
	int numExits;
	String[] exits = new String[10];
	int[] destinations = new int[10];
}

public class TextAdventureFinal {
	public static void main( String[] args ){
		Scanner keyboard = new Scanner(System.in);

		//initialize rooms from file
		Room[] rooms = loadRoomsFromFile("text-adventure-rooms.txt");

		//showAllRooms(rooms); //for debugging

		int currentRoom = 0;
		String answer;
		while ( currentRoom >= 0 ){
			Room cur = rooms[currentRoom];
			System.out.print(cur.description);
			System.out.print("> ");
			answer = keyboard.nextLine();;

			//Check if what they typed matches any of the exit names
			boolean found = false;
			for ( int i = 0; i < cur.numExits; i++ ){
				if ( cur.exits[i].equals(answer) ){
					//if so, change next room to that exit's room number
					currentRoom = cur.destinations[i];
					found = true;
				}
			}
			if ( !found ){
				System.out.println("Sorry, I don't understand.");
			}
		}

		
	}
}