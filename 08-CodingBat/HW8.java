public class HW8 {
    public String stringSplosion(String str) {
	String retstr = "";
	for (int count = 1;count <= str.length();count = count + 1) {
	    retstr = retstr + str.substring(0,count);
	}
	return retstr;
    }

    public String stringX(String str) {
	String retstr = str;
	char a = 'x';
	int count = 1;
	while (count < retstr.length()-1) {
	    if (retstr.charAt(count) == a) {
		retstr = retstr.substring(0,count) + retstr.substring(count + 1);
	    }
	    else {
		count = count + 1;
	    }
	}
	return retstr; 
    }
}
