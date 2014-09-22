public class Driver {
    public static void main(String[] args) {
	String name = "ari hatzimemos";
	int space = name.indexOf(" ");
	String lastName = name.substring(space + 1);
	String firstName = name.substring(0, space);
	System.out.println(lastName);
	System.out.println(firstName);
    }
}
