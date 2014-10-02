public class Shapes {
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

    public String Tri3(int h) {
	int row;
	int num;
	int star = 1;
	int starCounter;
	String retstr = "";
	row = h;
	while (row > 0) {
	    for (num = (row*2-2)/2;num > 0;num = num - 1) {
		retstr = retstr + " ";
	    }
	    for (starCounter = star;starCounter > 0;starCounter = starCounter - 1) {
		retstr = retstr + "*";
	    }
	    for (num = (row*2-2)/2;num > 0;num = num - 1) {
		retstr = retstr + " ";
	    }
	    retstr = retstr + "\n";
	    row = row - 1;
	    star = star + 2;
	}
	return retstr;
    }
}
