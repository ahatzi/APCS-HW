public class ShapesDriver {
    public static void main(String[] args) {
	Shapes a = new Shapes();

	System.out.println(a.Tri1(4));
	System.out.println(a.Tri1(6));

	System.out.println(a.Tri2(6));
	System.out.println(a.Tri2(4));

	System.out.println(a.Tri3(4));
        System.out.println(a.Tri3(6));

	System.out.println(a.Diamond(5));
	System.out.println(a.Diamond(3));

	System.out.println(a.Tri4(5));
	System.out.println(a.Tri4(3));

	System.out.println(a.frame(5,4));
	System.out.println(a.frame(3,5));
    }
}
