public class codingbat {
    public String nonStart(String a, String b) {
	String a2 = a.substring(1);
	String b2 = b.substring(1);
	return a2 + b2;
    }
    public String makeAbba(String a, String b) {
	return a + b + b + a;
    }
    public int diff21(int n) {
	if (n > 21) {
	    return Math.abs(21 - n)*2;
        }
        else {
	    return Math.abs(21-n);
        }
    }
}
