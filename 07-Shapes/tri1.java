public class tri1 {
    public String Tri1(int a) {
	int rows = 1;
	int stars;
	String retstr = "";
	while (rows <= a) {
	    stars = rows;
	    while (stars > 0) {
		retstr = retstr + "*";
		stars = stars - 1;
	    }
	    retstr = retstr + "\n";
	    rows = rows + 1;
	}
	return retstr;
    }
}
