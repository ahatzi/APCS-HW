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
    
    public String Diamond (int h) {
        int counter;
	int spaces = (h - 1)/2;
	int b;
	int stars = 1;
	int d;
	int e = (h + 1)/2;
	String retstr = "";
	for (counter = h;counter >= e;counter = counter - 1) {
	    b = spaces;
	    while (b > 0) {
		retstr = retstr + " ";
		b = b - 1;
	    }
	    d = stars;
	    while (d > 0) {
		retstr = retstr + "*";
		d = d - 1;
	    }
	    if (counter > e){
		retstr = retstr + "\n";
	    }
	    spaces = spaces - 1;
	    stars = stars + 2;
	}
	retstr = retstr + "\n";
	spaces = 1;
	stars = h - 2;
	for (counter = h;counter > e;counter = counter - 1) {
	    b = spaces;
	    while (b > 0) {
		retstr = retstr + " ";
		b = b - 1;
	    }
	    d = stars;
	    while (d > 0) {
		retstr = retstr + "*";
		d = d - 1;
	    }
	    retstr = retstr + "\n";
	    spaces = spaces + 1;
	    stars = stars - 2;
	}
	return retstr;
    }

    public String Tri4(int h) {
	String retstr = "";
	int count;
	int a;
	int b;
	for (count = h;count > 0;count = count - 1) {
	    b = h - count;
	    while (b > 0) {
		retstr = retstr + " ";
		b = b - 1;
	    }
	    a = count;
	    while (a > 0) {
		retstr = retstr + "*";
		a = a - 1;
	    }
	    retstr = retstr + "\n";
	}
	return retstr;
    }

    public String frame(int r, int c) {
	String retstr = "";
	for (int firstRow = c;firstRow > 0;firstRow = firstRow - 1) {
	    retstr = retstr + "*";
	}
	for (int MiddleRows = ((r-2)*2)+1;MiddleRows>0;MiddleRows = MiddleRows - 1){
	    if ((MiddleRows % 2) == 1) {
		retstr = retstr + "\n";
	    }
	    else {
		retstr = retstr + "*";
		for (int spaces = (c - 2);spaces > 0; spaces = spaces - 1) {
		    retstr = retstr + " ";
		}
		retstr = retstr + "*";
	    }
	}
	for (int lastRow = c;lastRow > 0;lastRow = lastRow - 1) {
	    retstr = retstr + "*";
	}
	return retstr;
    }
}
