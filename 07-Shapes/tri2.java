public class tri2{
    public String Tri2 (int a) {
	int row = 1;
	int stars;
	int spaces;
	String retstr = "";
	while (row <= a) {
	    spaces = row;
	    while (spaces < a) {
		retstr = retstr + " ";
		spaces = spaces + 1;
	    }
	    stars = row;
	    while (stars > 0){
		retstr = retstr + "*";
		stars = stars - 1;
	    }
	    retstr = retstr + "\n";
	    row = row + 1;
	}
	return retstr;
    }
}
