class Address {
 	public String street;
 	public String city;
 	public String state;
 	public int zip;
}

public class MailingAddresses {
	public static void main( String[] args ) {
		Address one, two, three;

		one = new Address();
		one.street = "191 Marigold Lane";
		one.city = "Miami";
		one.state = "FL";
		one.zip = 33179;

		two = new Address();
		two.street = "3029 Losh Lane";
		two.city = "Crafton";
		two.state = "PA";
		two.zip = 15205;

		three = new Address();
		three.street = "2693 Hannah Street";
		three.city = "Hickory";
		three.state = "NC";
		three.zip = 28601;

		System.out.println( one.street );
		System.out.println( one.city + ", " + one.state + " " + one.zip );

		System.out.println( two.street );
		System.out.println( two.city + ", " + two.state + " " + two.zip );

		System.out.println( three.street );
		System.out.println( three.city + ", " + three.state + " " + three.zip );
	}
}