public class HW6 {
    /*
      Took 5 minutes, then I ran into the cannot find front
      variable problem 
    */
    public String frontTimes(String str, int n) {
	String front;
	if (str.length() < 3) {
	    front = str;
	}
	else {
	    front = str.substring(0,3);
	}
	String retstr = "";
	while (n > 0) {
	    retstr = retstr + front;
	    n = n - 1;
	}
	return retstr;
    }

    //8 minutes.
    public String stringBits(String str) {
	int len = str.length();
	int num = 0;
	String retstr = "";
	while (num < len) {
	    String a = str.substring(num,num+1);
	    retstr = retstr + a;
	    if ((len - num) <= 2) {
		num = len + 1;
	    }
	    else {
		num = num + 2;
	    }
	}
	return retstr;
    }

    //5 Minutes.
    public String stringYak(String str) {
	int num = 0;
	while (((str.length() - 1) - num) >= 2) {
	    if (str.substring(num,num+3).equals("yak")) {
		str = str.substring(0,num) + str.substring(num+3);
	    }
	    num = num + 1;
	}
	return str;
    }

    //10 Minutes.
    public int stringMatch(String a, String b) {
	int mark = 0;
	int num = 0;
	int lena = a.length()-1;
	int lenb = b.length()-1;
	int len;
	if ((lenb > lena)) {
	    len = lena;
	}
	else {
	    len = lenb;
	}
	while ((len - mark) > 0) {
	    if (a.substring(mark,mark+2).equals(b.substring(mark,mark+2))) {
		num = num + 1;
	    }
	    mark = mark + 1;
       }
       return num;
   }
}
