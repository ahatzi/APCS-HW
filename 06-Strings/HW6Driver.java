public class HW6Driver {
    public static void main(String[] args) {
	HW6 a = new HW6();
	System.out.println(a.frontTimes("hello",3));//5 minutes.
	System.out.println(a.stringBits("Hello"));//8 minutes.
	System.out.println(a.stringYak("xxxyakyyyakzzz"));//5 minutes.
	System.out.println(a.stringMatch("aaxxaaxx","iaxxai"));//10 minutes.
    }
}
