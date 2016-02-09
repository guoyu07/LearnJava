public class ArraySlotAccess {
	public static void main( String[] args ){
		int[] arr = new int[3];

		// We almost always use a for loop to access each slot of an array.
		for (int i = 0; i < arr.length; i++){
			arr[i] = 1 + (int)(Math.random() * 100);
		}

		//Displaying all the values in an array 
		System.out.print("Values: ");
		for (int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		// A number into each slot of the array, one at a time.
		arr[0] = 6;
		arr[1] = 7;
		arr[2] = 8;

		//Display the values in those slots, one at a time.
		System.out.println("Values: " + arr[0] + " " + arr[1] + " " + arr[2]);

		//Put a random number 1-100 into each slotm of the array, one at a time.
		arr[0] = 1 + (int)(Math.random()*100);
		arr[1] = 1 + (int)(Math.random()*100);
		arr[2] = 1 + (int)(Math.random()*100);

		//Display the values again, one at a time.
		System.out.println("Values: " + arr[0] + " " + arr[1] + " " + arr[2]);

		//Additional arrays added here.
		int m = 0;
		arr[m] = 1 + (int)(Math.random()*100);
		m = 1;
		arr[m] = 1 + (int)(Math.random()*100);
		m = 2;
		arr[m] = 1 + (int)(Math.random()*100);

		//Display them again.
		System.out.print("Values: ");
		m = 0;
		System.out.print(arr[m] + " ");
		m = 1;
		System.out.print(arr[m] + " ");
		m = 2;
		System.out.print(arr[m] + " ");
		System.out.println();

		//This also works.
		int n = 0;
		arr[n] = 1 + (int)(Math.random()*100);
		n++;
		arr[n] = 1 + (int)(Math.random()*100);
		n++;
		arr[n] = 1 + (int)(Math.random()*100);
		n++;

		//Display them again.
		System.out.print("Values: ");
		n = 0;
		System.out.print(arr[n] + " ");
		n++;
		System.out.print(arr[n] + " ");
		n++;
		System.out.print(arr[n] + " ");
		n++;
		System.out.println();

		//Now using a loop which works much better.
		for (int q = 0; q < arr.length; q++){
			arr[q] = 1 + (int)(Math.random()*100);
		}

		System.out.print("Values: ");
		for (int q = 0; q < arr.length; q++){
			System.out.print(arr[q] + " ");
		}
		System.out.println();
	}
}